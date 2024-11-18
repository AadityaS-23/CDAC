// Import required modules
const express = require('express'); // Import the Express framework
const mysql = require('mysql'); // Import the MySQL library for database interaction
const bodyParser = require('body-parser'); // Import body-parser to parse incoming request bodies
const cors = require('cors'); // Import cors to enable Cross-Origin Resource Sharing

// Create an instance of an Express application
const app = express();
const PORT = process.env.PORT || 3000; // Set the port to listen on, defaulting to 3000 if not specified

// Middleware
app.use(cors()); // Enable CORS for all routes
app.use(bodyParser.json()); // Parse incoming JSON requests

// MySQL Connection
const db = mysql.createConnection({
    host: 'localhost', // MySQL server host
    user: 'root', // MySQL username (replace with your own)
    password: 'cdac', // MySQL password (replace with your own)
    database: 'HomeServices' // Name of the database to connect to
});

// Connect to the MySQL database
db.connect(err => {
    if (err) throw err; // If there is an error during connection, throw it
    console.log('MySQL Connected...'); // Log a success message when connected
});

// API Routes

// POST route to create a new booking
app.post('/api/orders', (req, res) => {
    // Destructure the request body to get service details
    const { service_type, service_date, service_time } = req.body;

    // SQL query to insert a new order into the database
    const query = 'INSERT INTO orders (service_type, service_date, service_time) VALUES (?, ?, ?)';
    
    // Execute the query with the provided values
    db.query(query, [service_type, service_date, service_time], (err, result) => {
        if (err) return res.status(500).json({ error: err }); // Handle any errors and respond with a 500 status
        // Respond with the newly created order details, including the generated order ID
        res.status(201).json({ order_id: result.insertId, service_type, service_date, service_time });
    });
});

// GET route to retrieve all bookings
app.get('/api/orders', (req, res) => {
    // SQL query to select all orders from the database
    const query = 'SELECT * FROM orders';
    
    // Execute the query
    db.query(query, (err, results) => {
        if (err) return res.status(500).json({ error: err }); // Handle any errors and respond with a 500 status
        // Respond with the results of the query (all orders)
        res.json(results);
    });
});

// PUT route to update an existing booking
app.put('/api/orders/:id', (req, res) => {
    const { id } = req.params; // Get the order ID from the request parameters
    const { service_type, service_date, service_time } = req.body; // Destructure the request body for updated values

    // SQL query to update the specified order in the database
    const query = 'UPDATE orders SET service_type = ?, service_date = ?, service_time = ? WHERE order_id = ?';
    
    // Execute the update query
    db.query(query, [service_type, service_date, service_time, id], (err, result) => {
        if (err) return res.status(500).json({ error: err }); // Handle any errors and respond with a 500 status
        // Respond with a success message upon successful update
        res.json({ message: 'Order updated successfully' });
    });
});

// DELETE route to remove a booking
app.delete('/api/orders/:id', (req, res) => {
    const { id } = req.params; // Get the order ID from the request parameters

    // SQL query to delete the specified order from the database
    const query = 'DELETE FROM orders WHERE order_id = ?';
    
    // Execute the delete query
    db.query(query, [id], (err, result) => {
        if (err) return res.status(500).json({ error: err }); // Handle any errors and respond with a 500 status
        // Respond with a success message upon successful deletion
        res.json({ message: 'Order deleted successfully' });
    });
});

// Start the server and listen on the specified port
app.listen(PORT, () => {
    console.log(`Server running on port ${PORT}`); // Log a message indicating the server is running
});









// const express = require('express');
// const mysql = require('mysql');
// const bodyParser = require('body-parser');
// const cors = require('cors');

// const app = express();
// const PORT = process.env.PORT || 3000;

// // Middleware
// app.use(cors());
// app.use(bodyParser.json());

// // MySQL Connection
// const db = mysql.createConnection({
//     host: 'localhost',
//     user: 'root', // replace with your MySQL username
//     password: 'cdac', // replace with your MySQL password
//     database: 'HomeServices'
// });

// db.connect(err => {
//     if (err) throw err;
//     console.log('MySQL Connected...');
// });

// // API Routes
// app.post('/api/orders', (req, res) => {
//     const { service_type, service_date, service_time } = req.body;
//     const query = 'INSERT INTO orders (service_type, service_date, service_time) VALUES (?, ?, ?)';
//     db.query(query, [service_type, service_date, service_time], (err, result) => {
//         if (err) return res.status(500).json({ error: err });
//         res.status(201).json({ order_id: result.insertId, service_type, service_date, service_time });
//     });
// });

// app.get('/api/orders', (req, res) => {
//     const query = 'SELECT * FROM orders';
//     db.query(query, (err, results) => {
//         if (err) return res.status(500).json({ error: err });
//         res.json(results);
//     });
// });

// app.put('/api/orders/:id', (req, res) => {
//     const { id } = req.params;
//     const { service_type, service_date, service_time } = req.body;
//     const query = 'UPDATE orders SET service_type = ?, service_date = ?, service_time = ? WHERE order_id = ?';
//     db.query(query, [service_type, service_date, service_time, id], (err, result) => {
//         if (err) return res.status(500).json({ error: err });
//         res.json({ message: 'Order updated successfully' });
//     });
// });

// app.delete('/api/orders/:id', (req, res) => {
//     const { id } = req.params;
//     const query = 'DELETE FROM orders WHERE order_id = ?';
//     db.query(query, [id], (err, result) => {
//         if (err) return res.status(500).json({ error: err });
//         res.json({ message: 'Order deleted successfully' });
//     });
// });

// app.listen(PORT, () => {
//     console.log(`Server running on port ${PORT}`);
// });