
const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');
const routes = require('./routes'); 

const app = express();
const PORT = 3000;

//middleware
app.use(cors());
app.use(bodyParser.json());

//route use karne ke liye
app.use(routes);


app.listen(PORT, () => {
    console.log(`Server running on port ${PORT}`);
});