
using UserManagementApp.Models;
using UserManagementApp.Repositories;

namespace UserManagementApp.Services
{
    public class UserService
    {
        private readonly IUserRepository _repository;

        public UserService(IUserRepository repository) { 
              _repository = repository;
        }


        public bool ValidateUser(string email, string password)
        {
            return _repository.Validate(email, password);
        }


        public bool RegisterUser(User user)
        {
            return _repository.Insert(user);
        }



    }
}
