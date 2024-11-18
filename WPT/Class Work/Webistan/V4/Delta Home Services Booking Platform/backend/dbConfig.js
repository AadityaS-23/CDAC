import mysql from 'mysql';

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

export default db;
