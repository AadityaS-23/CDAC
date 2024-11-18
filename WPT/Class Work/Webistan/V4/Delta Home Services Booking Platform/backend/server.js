import express from 'express';
import bodyParser from 'body-parser';
import cors from 'cors';
import routes from './routes.js';

const app = express();
const PORT = 3000;

// Middleware
app.use(cors());
app.use(bodyParser.json());
app.use(routes);

app.listen(PORT, () => {
    console.log(`Server running on port ${PORT}`);
});
