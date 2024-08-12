package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
@Getter
@Setter
@ToString(exclude = { "cart" ,"orders"})
@NoArgsConstructor
public class User extends BaseEntity {
	
	@Column(length = 20)
	private String name;
	
	@Column(length = 30, unique = true)
	private String email;
	
	@Column(length = 400)
	private String password;
	
	@Column(length = 20)
	private String phone;
	
	@Column(name = "address", length = 300)
	private String address;
	
	@Column(length = 20)
	private String role;
	
	//User Relationship with the Cart : One-To-One
	//Owning Side(Foreign Key) : Cart (user_id)
	//Inverse Side (Non-Owning Side): User (cart)
	@JsonIgnore
	@OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
	private Cart cart;
	
	//User Relationship with the Order : One-To-Many
	//Owning Side(Foreign Key) : Order (user_id)
	//Inverse Side (Non-Owning Side): User (orders)
	@JsonIgnore
	@OneToMany(mappedBy = "user",fetch =FetchType.LAZY,cascade = CascadeType.ALL )
	private List<Order> orders=new ArrayList<Order>();
	
	//HELPER METHOD : Between User And Cart
	//Helper Method to set the cart and remove it
	public void setCart(Cart cart) {
	    if (cart == null) {
	        if (this.cart != null) {
	            this.cart.setUser(null);
	        }
	    } else {
	        cart.setUser(this);
	    }
	    this.cart = cart;
	}

	public void removeCart() {
	    if (this.cart != null) {
	        this.cart.setUser(null);
	        this.cart = null;
	    }
	}

	//HELPER METHOD : Between User and Order
	//Helper Method to set the order and remove it 
	public void addOrder(Order order) {
	    this.orders.add(order);
	    order.setUser(this);
	}

	public void removeOrder(Order order) {
	    this.orders.remove(order);
	    order.setUser(null);
	}

	
}
