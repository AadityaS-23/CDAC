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
    public class Edit : PageModel
    {
           [BindProperty]
        public string Id { get; set; } = "";


        [BindProperty, Required(ErrorMessage = "First Name is required")]
        public string FirstName { get; set; } = "";

        [BindProperty, Required(ErrorMessage = "Last Name is required")]
        public string LastName { get; set; } = "";

        [BindProperty, Required, EmailAddress]
        public string Email { get; set; } = "";

        [BindProperty, Phone]
        public string? Phone { get; set; }

        [BindProperty]
        public string? Address { get; set; }

        [BindProperty, Required(ErrorMessage = "Company Name is required")]
        public string Company { get; set; } = "";

        [BindProperty]
        public string? Notes { get; set; }


        public string? ErrorMessage { get; set; } // Add this property

        public void OnGet(int Id)
        {
            try{ 
               string connectionString = "Server=.;Database=crmdb;Trusted_Connection=True;TrustServerCertificate=true;";

                using (SqlConnection connection = new SqlConnection(connectionString)){
                    connection.Open();

                    string query = "SELECT * FROM customers WHERE Id = @Id";


                    using (SqlCommand command = new SqlCommand(query,connection)){
                        command.Parameters.AddWithValue("@Id", Id);

                       using( SqlDataReader reader = command.ExecuteReader()){
                            if (reader.Read()){
                                Id = reader.GetInt32(0);
                                FirstName = reader.GetString(1);
                                LastName = reader.GetString(2);
                                Email = reader.GetString(3);
                                Phone = reader.GetString(4);
                                Address = reader.GetString(5);
                                Company = reader.GetString(6);
                                Notes = reader.GetString(7);
                            }else{
                                Response.Redirect("/Customers/Index");
                            }
                        }
                    }
                }

 }catch(Exception ex){
                ErrorMessage = ex.Message;
            }
        }

        public void OnPost(){
            if (!ModelState.IsValid)
            {
                return;
            }

            if (Phone == null) Phone = "";
            if (Address == null) Address = "";
            if (Notes == null) Notes = "";

            //update customer details
            try {
                  string connectionString = "Server=.;Database=crmdb;Trusted_Connection=True;TrustServerCertificate=true;";

                using (SqlConnection connection = new SqlConnection(connectionString)){
                    connection.Open();
                    
                    string query ="UPDATE customers SET firstName=@FirstName,lastName=@LastName," +
                                   "email=@Email,phone=@Phone,address=@Address,company=@Company,notes=@Notes WHERE Id=@Id";
                    
                    using (SqlCommand command = new SqlCommand(query,connection)){
                    command.Parameters.AddWithValue("@FirstName",FirstName);
                    command.Parameters.AddWithValue("@LastName",LastName);
                    command.Parameters.AddWithValue("@Email",Email);
                    command.Parameters.AddWithValue("@Phone",Phone);
                    command.Parameters.AddWithValue("@Address",Address);
                    command.Parameters.AddWithValue("@Company",Company);
                    command.Parameters.AddWithValue("@Notes",Notes);
                    command.Parameters.AddWithValue("@Id",Id);

                    command.ExecuteNonQuery();
                    }
                }

            }catch(Exception ex){
                ErrorMessage = ex.Message;
                return;
            }

            Response.Redirect("/Customers/Index");
        }
    }
}