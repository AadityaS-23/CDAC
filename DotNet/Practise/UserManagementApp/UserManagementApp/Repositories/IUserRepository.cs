using UserManagementApp.Models;

namespace UserManagementApp.Repositories
{
    public interface IUserRepository
    {
        bool Validate(string email, string password);
        bool Insert(User user);
    }
}
