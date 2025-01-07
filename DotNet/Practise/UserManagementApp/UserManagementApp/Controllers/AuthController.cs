using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using UserManagementApp.Models;
using UserManagementApp.Services;

namespace UserManagementApp.Controllers
{
    public class AuthController : Controller
    {

        private readonly UserService _userService;

        public AuthController(UserService userService)
        {
            _userService = userService;
        }


        [HttpGet]
        public IActionResult Login()
        {
            return View();
        }


        [HttpPost]
        public IActionResult Login(string email, string password)
        {
            if (_userService.ValidateUser(email, password))
            {
                // HttpContext.Session.SetString("Email", email);
                return RedirectToAction("Index", "Home");
            }
            ViewBag.Error = "Invalid Credentials ";
            return View();
        }


        [HttpGet]
        public IActionResult Register()
        {
            return View();
        }
        [HttpPost]
        public IActionResult Register(User user)
        {
            if (_userService.RegisterUser(user))
            {
                return RedirectToAction("Login");
            }

            ViewBag.Error = "Registration Failed";
            return View();
        }
    }


}
