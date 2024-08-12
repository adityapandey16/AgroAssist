package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product  extends BaseEntity{

	@Column(name = "product_name", length = 50)
	 private String productName;
	 
	@Column(name = "product_description", length = 500)
	 private String productDescription;
	 
	@Column(name="quantity")
	 private int quantity;
	
	@Column(name="product_price")
	 private double productPrice;
	 
	@Column(name="product_discount")
	 private double productDiscount;
	 
	@Column(name="product_rating")
	 private int productRating;
	 
	@Column(name="product_image", length = 100)
	 private String productImage;
	 
	
	//Product Relationship with the CartItem : One-To-Many
	//Owning Side(Foreign Key) : CartItem (product_id)
	//Inverse Side (Non-Owning Side): Product (cartItems)
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CartItem> cartItems =  new ArrayList<>();
	
	
	
	//Product Relationship with the Category : Many-To-One
	//Owning Side(Foreign Key) : Product (category_id)
	//Inverse Side (Non-Owning Side): Category (products)
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "category_id")
	 private Category category;
	
	
	
	//Product Relationship with the OrderItem : One-To-Many
	//Owning Side(Foreign Key) : OrderItem (product_id)
	//Inverse Side (Non-Owning Side): Product (OrderItems)
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> orderItems = new ArrayList<>();
	
	
	
	
	//Helper Method To Set The Category 
	public void setCategory(Category category) {
		this.category = category;
	}
	
    // Helper method to remove the association with the current category
    public void removeCategory() {
        if (this.category != null) {
            this.category.getProducts().remove(this); 
            this.category = null; 
         }
      }
	
	//Helper Method To Add Product To The Cart
    public void addToCart(Cart cart, int quantity) {
        CartItem cartItem = new CartItem();
        cartItem.setCart(cart);
        cartItem.setProduct(this);
        cartItem.setProductQuantity(quantity);
        this.cartItems.add(cartItem);
    }
	
    // Helper method to remove a CartItem by Cart
    public void removeCartItemByCart(Cart cart) {
        CartItem itemToRemove = null;
        for (CartItem cartItem : this.cartItems) {
            if (cartItem.getCart().equals(cart)) {
                itemToRemove = cartItem;
                break;
            }
        }
        if (itemToRemove != null) {
            itemToRemove.setProduct(null);
            itemToRemove.setCart(null);
            this.cartItems.remove(itemToRemove);
        }
    }

    
    // Helper Method to add an OrderItem
    public void addOrderToProduct(Order order, int quantity) {
        OrderItem orderItem = new OrderItem();
        orderItem.setOrder(order);
        orderItem.setProduct(this);
        orderItem.setQuantity(quantity);
        this.orderItems.add(orderItem);
        order.getOrderItems().add(orderItem);
    }

    // Helper Method to remove an OrderItem
    public void removeOrderFromProduct(Order order) {
        OrderItem itemToRemove = null;
        for (OrderItem orderItem : this.orderItems) {
            if (orderItem.getOrder().equals(order)) {
                itemToRemove = orderItem;
                break;
            }
        }
        if (itemToRemove != null) {
            this.orderItems.remove(itemToRemove);
            itemToRemove.setOrder(null);
            itemToRemove.setProduct(null);
            order.getOrderItems().remove(itemToRemove);
        }
    }
	
}
