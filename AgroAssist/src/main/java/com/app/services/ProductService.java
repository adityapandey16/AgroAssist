package com.app.services;

import java.util.List;
import com.app.entities.Product;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    void deleteProduct(Long id);
    // Other product-specific methods
}
