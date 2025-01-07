using MySql.Data.MySqlClient;
using UserManagementApp.Models;

namespace UserManagementApp.Repositories
{
    public class UserRepository : IUserRepository
    {
        private readonly string connectionString;

        public UserRepository(string connectionString) { 
           this.connectionString = connectionString;
        }

        public bool Validate(string email, string password) {
            using (var connection = new MySqlConnection(connectionString)) { 
                 connection.Open();

                string query = "SELECT COUNT(*) FROM users WHERE Email = @Email AND Password = @Password";
                using (var cmd = new MySqlCommand(query, connection)) { 
                
                        cmd.Parameters.AddWithValue("@Email", email);
                    cmd.Parameters.AddWithValue("@Password", password);
                    return Convert.ToInt32(cmd.ExecuteScalar()) > 0;
                }
            }
        }



        public bool Insert(User user)
        {
            using (var connection = new MySqlConnection(connectionString))
            {
                connection.Open();
                string query = "INSERT INTO users (FirstName, LastName, Email, Password, Contact) VALUES (@FirstName, @LastName, @Email, @Password, @Contact)";
                using (var cmd = new MySqlCommand(query, connection))
                {
                    cmd.Parameters.AddWithValue("@FirstName", user.FirstName);
                    cmd.Parameters.AddWithValue("@LastName", user.LastName);
                    cmd.Parameters.AddWithValue("@Email", user.Email);
                    cmd.Parameters.AddWithValue("@Password", user.Password);
                    cmd.Parameters.AddWithValue("@Contact", user.Contact);
                    return cmd.ExecuteNonQuery() > 0;
                }
            }
        }
    }
}
