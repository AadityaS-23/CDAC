
const mysql = require('mysql');

const db = mysql.createConnection({
    host: 'localhost',
    user: 'root', 
    password: 'cdac', 
    database: 'services'
});

db.connect(err => {
    if (err) throw err;
    console.log('Services Database Successfully Connected.......');
});

module.exports = db;