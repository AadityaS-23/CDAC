import express from 'express';
import * as controllers from './controllers.js';

const router = express.Router();

router.post('/api/orders', controllers.createOrder);
router.get('/api/orders', controllers.getOrders);
router.put('/api/orders/:id', controllers.updateOrder);
router.delete('/api/orders/:id', controllers.deleteOrder);

export default router;
