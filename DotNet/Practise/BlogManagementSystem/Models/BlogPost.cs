using System.ComponentModel;
using System.ComponentModel.DataAnnotations;

namespace BlogManagementSystem.Models
{
    public class BlogPost
    {
        public int Id { get; set; }

        [Required]
        [StringLength(100)]
        public string Title { get; set; } = string.Empty;


        [Required]
        public string Content { get; set; } = string.Empty;

        public DateTime CreatedAt { get; set; } = DateTime.Now;

        public int CategoryId { get; set; }

       
        public Category? Category { get; set; } 
    }
}
