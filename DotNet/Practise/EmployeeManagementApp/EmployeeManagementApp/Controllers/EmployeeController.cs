using Microsoft.AspNetCore.Mvc;
using MySql.Data.MySqlClient;
using System.Collections.Generic;
using EmployeeManagementApp.Models;

public class EmployeeController : Controller
{
    private readonly DatabaseHelper _dbHelper = new DatabaseHelper();

    public IActionResult Index()
    {
        var employees = new List<Employee>();

        using (var connection = _dbHelper.GetConnection())
        {
            connection.Open();
            var command = new MySqlCommand("SELECT * FROM Employees", connection);
            var reader = command.ExecuteReader();

            while (reader.Read())
            {
                employees.Add(new Employee
                {
                    Id = reader.GetInt32("Id"),
                    Name = reader.GetString("Name"),
                    Email = reader.GetString("Email"),
                    Position = reader.GetString("Position"),
                    Salary = reader.GetDecimal("Salary")
                });
            }
        }

        return View(employees);
    }

    [HttpGet]
    public IActionResult Create() => View();

    [HttpPost]
    public IActionResult Create(Employee employee)
    {
        if (ModelState.IsValid)
        {
            using (var connection = _dbHelper.GetConnection())
            {
                connection.Open();
                var command = new MySqlCommand("INSERT INTO Employees (Name, Email, Position, Salary) VALUES (@Name, @Email, @Position, @Salary)", connection);
                command.Parameters.AddWithValue("@Name", employee.Name);
                command.Parameters.AddWithValue("@Email", employee.Email);
                command.Parameters.AddWithValue("@Position", employee.Position);
                command.Parameters.AddWithValue("@Salary", employee.Salary);

                command.ExecuteNonQuery();
            }
            return RedirectToAction("Index");
        }

        return View(employee);
    }

    [HttpGet]
    public IActionResult Edit(int id)
    {
        Employee employee = null;

        using (var connection = _dbHelper.GetConnection())
        {
            connection.Open();
            var command = new MySqlCommand("SELECT * FROM Employees WHERE Id = @Id", connection);
            command.Parameters.AddWithValue("@Id", id);
            var reader = command.ExecuteReader();

            if (reader.Read())
            {
                employee = new Employee
                {
                    Id = reader.GetInt32("Id"),
                    Name = reader.GetString("Name"),
                    Email = reader.GetString("Email"),
                    Position = reader.GetString("Position"),
                    Salary = reader.GetDecimal("Salary")
                };
            }
        }

        return View(employee);
    }

    [HttpPost]
    public IActionResult Edit(Employee employee)
    {
        if (ModelState.IsValid)
        {
            using (var connection = _dbHelper.GetConnection())
            {
                connection.Open();
                var command = new MySqlCommand("UPDATE Employees SET Name = @Name, Email = @Email, Position = @Position, Salary = @Salary WHERE Id = @Id", connection);
                command.Parameters.AddWithValue("@Name", employee.Name);
                command.Parameters.AddWithValue("@Email", employee.Email);
                command.Parameters.AddWithValue("@Position", employee.Position);
                command.Parameters.AddWithValue("@Salary", employee.Salary);
                command.Parameters.AddWithValue("@Id", employee.Id);

                command.ExecuteNonQuery();
            }
            return RedirectToAction("Index");
        }

        return View(employee);
    }

    [HttpGet]
    public IActionResult Delete(int id)
    {
        Employee employee = null;

        using (var connection = _dbHelper.GetConnection())
        {
            connection.Open();
            var command = new MySqlCommand("SELECT * FROM Employees WHERE Id = @Id", connection);
            command.Parameters.AddWithValue("@Id", id);
            var reader = command.ExecuteReader();

            if (reader.Read())
            {
                employee = new Employee
                {
                    Id = reader.GetInt32("Id"),
                    Name = reader.GetString("Name"),
                    Email = reader.GetString("Email"),
                    Position = reader.GetString("Position"),
                    Salary = reader.GetDecimal("Salary")
                };
            }
        }

        return View(employee);
    }

    [HttpPost]
    public IActionResult DeleteConfirmed(int id)
    {
        using (var connection = _dbHelper.GetConnection())
        {
            connection.Open();
            var command = new MySqlCommand("DELETE FROM Employees WHERE Id = @Id", connection);
            command.Parameters.AddWithValue("@Id", id);

            command.ExecuteNonQuery();
        }

        return RedirectToAction("Index");
    }



}
