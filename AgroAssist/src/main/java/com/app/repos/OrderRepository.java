package com.app.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Order;
import com.app.entities.User;
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	Optional<Order> findById(Long orderId);
	List<Order> findAllByUser(User user);
}
