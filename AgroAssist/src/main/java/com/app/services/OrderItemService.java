package com.app.services;

import java.util.List;
import com.app.entities.OrderItem;

public interface OrderItemService {
    List<OrderItem> getAllOrderItems();
    OrderItem getOrderItemById(Long id);
    OrderItem createOrderItem(OrderItem orderItem); // New method
    OrderItem updateOrderItem(Long id, OrderItem orderItem);
    void deleteOrderItem(Long id);
}
