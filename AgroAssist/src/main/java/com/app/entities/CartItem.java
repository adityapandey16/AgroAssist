package com.app.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString(exclude = "cart")
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cart_item")
public class CartItem extends BaseEntity {

	@Column(name = "product_quantity")
	int productQuantity;
	
	
	//CartItem Relationship with the Product : Many-To-One
	//Owning Side(Foreign Key) : CartItem (product_id)
	//Inverse Side (Non-Owning Side): Product (cartItems)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="product_id")
	private Product product;
	
	//CartItem Relationship with the Cart : Many-To-One
	//Owning Side(Foreign Key) : CartItem (cart_id)
	//Inverse Side (Non-Owning Side): Cart (cartItems)
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "cart_id")
	private Cart cart;
	
}
