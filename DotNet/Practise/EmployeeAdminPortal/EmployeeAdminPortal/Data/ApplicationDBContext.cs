using EmployeeAdminPortal.Models.Entities;
using Microsoft.EntityFrameworkCore;

namespace EmployeeAdminPortal.Data
{
    public class ApplicationDBContext : DbContext
    {
        
        public ApplicationDBContext(DbContextOptions options) : base(options)
        {

        }



        public DbSet<Employee> Employees { get; set; }
    }
}
