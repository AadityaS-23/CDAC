using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.Extensions.Logging;
using Microsoft.Data.SqlClient;

namespace CRMAPP.Pages.Customers
{
    public class Index : PageModel
    {
      
       public List<CustomerInfo> CustomersList { get; set; } = [];
        

        public void OnGet()
        {
            try{
                string connectionString = "Server=.;Database=crmdb;Trusted_Connection=True;TrustServerCertificate=true;"; 

                using (SqlConnection connection = new SqlConnection(connectionString))
                {
                    connection.Open();
                    string query = "SELECT * FROM Customers ORDER BY Id DESC";
                    using (SqlCommand command = new SqlCommand(query, connection))
                    {
                        using (SqlDataReader reader = command.ExecuteReader())
                        {
                            while (reader.Read())
                            {
                                CustomerInfo customerInfo = new CustomerInfo();
                                customerInfo.Id = reader.GetInt32(0);
                                customerInfo.FirstName = reader.GetString(1);
                                customerInfo.LastName = reader.GetString(2);
                                customerInfo.Email = reader.GetString(3);
                                customerInfo.Phone = reader.GetString(4);
                                customerInfo.Address = reader.GetString(5);
                                customerInfo.Company = reader.GetString(6);
                                customerInfo.Notes = reader.GetString(7);
                                customerInfo.CreatedAt = reader.GetDateTime(8).ToString("yyyy-MM-dd");
                                CustomersList.Add(customerInfo);
                            }
                        }
                    }
                }
            }
            catch(Exception ex){
                Console.WriteLine(ex.Message);
            }
        }
    }

    public class CustomerInfo{
        public int Id { get; set; }
        public string FirstName { get; set; } = "";
        public string LastName { get; set; } = "";
        public string Email { get; set; } = "";
        public string Phone { get; set; } = "";
        public string Address { get; set; } = "";
        public string Company { get; set; } = "";
        public string Notes { get; set; } = "";
        public string CreatedAt { get; set; } = "";
    }
}