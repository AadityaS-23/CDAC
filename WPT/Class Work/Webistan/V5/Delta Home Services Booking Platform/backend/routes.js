
const express = require('express');
const router = express.Router();
const controllers = require('./controllers');


router.post('/api/orders', controllers.createOrder);
router.get('/api/orders', controllers.getOrders);
router.put('/api/orders/:id', controllers.updateOrder);
router.delete('/api/orders/:id', controllers.deleteOrder);

module.exports = router; 