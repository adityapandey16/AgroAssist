package com.app.services;

import java.util.List;
import com.app.entities.Order;

public interface OrderService {
    Order saveOrder(Order order);
    List<Order> getAllOrders();
    Order getOrderById(Long id);
    void deleteOrder(Long id);
    // Other order-specific methods
}
