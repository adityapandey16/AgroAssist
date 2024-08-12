package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    // Add any custom query methods if needed
}
