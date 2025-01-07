using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.Extensions.Logging;
using System.ComponentModel.DataAnnotations;
using Microsoft.Data.SqlClient;

namespace CRMAPP.Pages.Customers
{
    public class Delete : PageModel
    {
      
        public void OnGet()
        {
          //Delete without popup  
             //deleteCustomer(Id);  
            // Response.Redirect("/Customers/Index");
        }


        public void OnPost(int Id)  {
            //delete customer

            deleteCustomer(Id);
            Response.Redirect("/Customers/Index");
        }


        private void deleteCustomer(int Id)
        {
           try{
           string connectionString = "Server=.;Database=crmdb;Trusted_Connection=True;TrustServerCertificate=true;";

                using (SqlConnection connection = new SqlConnection(connectionString))
                {
                    connection.Open();

                    string query = "DELETE FROM customers WHERE Id = @Id";
                    using(SqlCommand command = new SqlCommand(query,connection))
                    {
                        command.Parameters.AddWithValue("@Id",Id);
                        command.ExecuteNonQuery();
                    }

                }

           }catch(Exception ex){
             Console.WriteLine("Cannot delete customer " +ex.Message);
        }
    }
 } 

}