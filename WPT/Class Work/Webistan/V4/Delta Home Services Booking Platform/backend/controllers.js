import db from './dbConfig.js';

// create
export const createOrder = (req, res) => {
    const { service_type, service_date, service_time } = req.body;
    const query = 'INSERT INTO orders (service_type, service_date, service_time) VALUES (?, ?, ?)';
    db.query(query, [service_type, service_date, service_time], (err, result) => {
        if (err) return res.status(500).json({ error: err });
        res.status(201).json({ order_id: result.insertId, service_type, service_date, service_time });
    });
};

// read
export const getOrders = (req, res) => {
    const query = 'SELECT * FROM orders';
    db.query(query, (err, results) => {
        if (err) return res.status(500).json({ error: err });
        res.json(results);
    });
};

// update
export const updateOrder = (req, res) => {
    const { id } = req.params;
    const { service_type, service_date, service_time } = req.body;
    const query = 'UPDATE orders SET service_type = ?, service_date = ?, service_time = ? WHERE order_id = ?';
    db.query(query, [service_type, service_date, service_time, id], (err, result) => {
        if (err) return res.status(500).json({ error: err });
        res.json({ message: 'Order updated successfully' });
    });
};

// delete
export const deleteOrder = (req, res) => {
    const { id } = req.params;
    const query = 'DELETE FROM orders WHERE order_id = ?';
    db.query(query, [id], (err, result) => {
        if (err) return res.status(500).json({ error: err });
        res.json({ message: 'Order deleted successfully' });
    });
};
