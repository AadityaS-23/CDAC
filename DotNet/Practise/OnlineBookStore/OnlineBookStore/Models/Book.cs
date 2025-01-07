using System.ComponentModel.DataAnnotations;

namespace OnlineBookStore.Models
{
    public class Book
    {
        [Required(ErrorMessage ="Title is required")]
        public string Title { get; set; }

        [Required(ErrorMessage = "Author is required")]
        public string Author { get; set; }

        [Range(1,1000,ErrorMessage ="Price must be between 1 - 1000")]
        public decimal Price { get; set; }

        [Required(ErrorMessage ="Publish date is required")]
        [DataType(DataType.Date)]
         public DateTime PublishedDate { get; set; }
    }
}
