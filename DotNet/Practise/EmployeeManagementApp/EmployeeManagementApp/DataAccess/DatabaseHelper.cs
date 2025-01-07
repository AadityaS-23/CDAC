using MySql.Data.MySqlClient;
using Microsoft.Extensions.Configuration;
using System.IO;

public class DatabaseHelper
{
    private readonly string _connectionString;

    public DatabaseHelper()
    {
        var builder = new ConfigurationBuilder()
            .SetBasePath(Directory.GetCurrentDirectory())
            .AddJsonFile("appsettings.json");

        var configuration = builder.Build();
        _connectionString = configuration.GetConnectionString("MySqlConnection");
    }

    public MySqlConnection GetConnection()
    {
        return new MySqlConnection(_connectionString);
    }
}
