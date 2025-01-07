IF OBJECT_ID('customers', 'U') IS NOT NULL
    DROP TABLE customers;

CREATE TABLE customers(
    id INT NOT NULL PRIMARY KEY IDENTITY,
    firstname NVARCHAR (100) NOT NULL,
    lastname NVARCHAR (100) NOT NULL,
    email NVARCHAR(100) NOT NULL UNIQUE,
    phone NVARCHAR(100) NOT NULL,
    address NVARCHAR(100) NOT NULL,
    company NVARCHAR(100) NOT NULL,
    notes NVARCHAR (max) NOT NULL,
    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO customers (firstname, lastname, email, phone, address, company, notes) VALUES
('Aaditya','Sutar','aaditya@gmail.com','9579883194','Mumbai','Google','Good Customer'),
('Srushti','Kalambe','srushti@gmail.com','8830155702','Mumbai','Oracle','Good Customer');