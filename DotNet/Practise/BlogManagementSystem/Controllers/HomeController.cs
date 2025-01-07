using BlogManagementSystem.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using System.Linq;

public class HomeController : Controller
{
    private readonly BlogDbContext _context;

    public HomeController(BlogDbContext context)
    {
        _context = context;
    }

    public IActionResult Index()
    {
        var posts = _context.BlogPosts.Include(p => p.Category).ToList();
        return View(posts);
    }
}
