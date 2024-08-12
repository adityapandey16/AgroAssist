package com.app.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="orders")
public class OrderItem  extends BaseEntity{

	//private String orderId;
	
	//private String receipt;
	
	//private String status;
	
	//private int amount;
	
	//private String paymentId;
	
	//private LocalDate orderDate;
	
	//private LocalDate deliveryDate;
	
	//private String deliveryAddress;
	
	private Integer quantity;
	

	//OrderItem Relationship with the Product : Many-To-One
	//Owning Side(Foreign Key) : OrderItem (product_id)
	//Inverse Side (Non-Owning Side): Product (OrderItems)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="product_id")
	private Product product;
	
	//OrderItem Relationship with the Order : Many-To-One
	//Owning Side(Foreign Key) : OrderItem (order_id)
	//Inverse Side (Non-Owning Side): Order (OrderItems)
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "order_id")
	private Order order;
	
	
}