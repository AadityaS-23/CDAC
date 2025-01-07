using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;

namespace BlogManagementSystem.Models
{
    public class BlogDbContext : DbContext
    {
        public BlogDbContext(DbContextOptions<BlogDbContext> options) : base(options) { }

        public DbSet<BlogPost> BlogPosts { get; set; }
        public DbSet<Category> Categories { get; set; }
    }
}
