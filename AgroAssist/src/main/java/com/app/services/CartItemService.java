package com.app.services;

import java.util.List;
import com.app.entities.CartItem;

public interface CartItemService {
    CartItem saveCartItem(CartItem cartItem);
    List<CartItem> getAllCartItems();
    CartItem getCartItemById(Long id);
    void deleteCartItem(Long id);
    // Other cart item-specific methods
}
