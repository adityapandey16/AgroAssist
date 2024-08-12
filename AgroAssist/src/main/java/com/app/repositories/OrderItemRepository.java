package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    // Add any custom query methods if needed
}
