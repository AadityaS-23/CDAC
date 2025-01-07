using InventoryManagement.Models;
using Microsoft.EntityFrameworkCore;

namespace InventoryManagement.Data
{
    public class AppDbContext : DbContext
    {
        public AppDbContext(DbContextOptions options) : base(options) {}

        public DbSet<User> Users { get; set; }
       public DbSet<Category> Categories { get; set; }
        public DbSet<Product> Products { get; set; }
        }


}
