using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using SpendSmart.Models;

namespace SpendSmart.Controllers
{
    public class HomeController : Controller
    {
        private readonly ILogger<HomeController> _logger;

        private readonly SpendSmartDbContext _context;

        public HomeController(ILogger<HomeController> logger, SpendSmartDbContext context)
        {
            _logger = logger;
            _context = context;
        }

        public IActionResult Index()
        {
            return View();
        }

        public IActionResult Privacy()
        {
            return View();
        }

        public IActionResult Expenses() 
        { 
            var allExpenses = _context.Set<Expense>().ToList();
            var totalExpenses = allExpenses.Sum(x => x.value);
            ViewBag.Expenses = totalExpenses;
            return View(allExpenses);
        }

        public IActionResult CreateEditExpense(int? Id)
        {
            if (Id != null) {
                // editing - > load an epense by d

                var expenseInDb = _context.Set<Expense>().SingleOrDefault(expense => expense.Id == Id);
                return View(expenseInDb);



            }



  return View();
        }


        public IActionResult CreateEditExpenseForm(Expense model) 
        {
            if (model.Id == 0)
            {
                //  create
                _context.Set<Expense>().Add(model);
            }
            else
            {
                //editing
                _context.Set<Expense>().Update(model);

            }
                _context.SaveChanges();

                return RedirectToAction("Expenses");
           
            }

        public IActionResult DeleteExpense(int Id)
        {
            var expenseInDb = _context.Set<Expense>().SingleOrDefault(expense => expense.Id == Id);
            _context.Set<Expense>().Remove(expenseInDb);
            _context.SaveChanges();
            return RedirectToAction("Expenses");
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
