package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Add any custom query methods if needed
}
