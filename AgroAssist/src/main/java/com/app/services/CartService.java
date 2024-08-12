package com.app.services;

import java.util.List;
import com.app.entities.Cart;

public interface CartService {
    Cart saveCart(Cart cart);
    List<Cart> getAllCarts();
    Cart getCartById(Long id);
    void deleteCart(Long id);
    // Other cart-specific methods
}
