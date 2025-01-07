using Microsoft.AspNetCore.Mvc;
using OnlineBookStore.Models;

namespace OnlineBookStore.Controllers
{
    public class BookController : Controller
    {
        //Static list to act as db for demo 
        private static List<Book> books = new List<Book>();

        //Action to get all books
        [HttpGet]
        public IActionResult Index()
        {
            return View(books);  // pass the list of books to the view
        }

        //Action to show the form for adding a new book
        [HttpGet]
        public IActionResult AddBook() {
            return View();  //rreturns the view for adding a new book

        }

        //Action to handle form submisssion for adding a new book
        [HttpPost]
        public IActionResult AddBook(Book book) {
            if (ModelState.IsValid) {  //check if the submitted data is valid
                books.Add(book);  // add new book to the list
                return RedirectToAction("Index"); // redirect to the list of the books

            }

            //if validation fails,re dsplay the form with validation mssgs
            return View(book);
        }

        //A pvt helper method (excluded from routing)
        [NonAction]
        private string FormatBookDetails(Book book) {
            return $"{"book.Title"} by {book.Author},Price : {book.Price:C} ";
        }


    }
}
