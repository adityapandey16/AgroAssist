package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
@Table(name="order_table")
public class Order extends BaseEntity{
    
	private LocalDate order_date;
	
	private Double total_amount;
	
	private LocalDate deliveryDate;
	
	//Order Relationship with the User : Many-To-One
	//Owning Side(Foreign Key) : Order (user_id)
	//Inverse Side (Non-Owning Side): User (orders)
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id" , nullable = false)
	private User user;
	
	
	//Order Relationship with the OrderItem : One-To-Many
	//Owning Side(Foreign Key) : OrderItem (order_id)
	//Inverse Side (Non-Owning Side): Order (OrderItems)
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> orderItems = new ArrayList<>();
    
    // Helper Method to add an OrderItem
    public void addOrderItem(Product product, int quantity) {
        OrderItem orderItem = new OrderItem();
        orderItem.setOrder(this);
        orderItem.setProduct(product);
        orderItem.setQuantity(quantity);
        this.orderItems.add(orderItem);
        product.getOrderItems().add(orderItem);
    }
    
    // Helper Method to remove an OrderItem
    public void removeOrderItem(Product product) {
        OrderItem itemToRemove = null;
        for (OrderItem orderItem : this.orderItems) {
            if (orderItem.getProduct().equals(product)) {
                itemToRemove = orderItem;
                break;
            }
        }
        if (itemToRemove != null) {
            this.orderItems.remove(itemToRemove);
            itemToRemove.setOrder(null);
            itemToRemove.setProduct(null);
            product.getOrderItems().remove(itemToRemove);
        }
    }
    
    // Helper method to assign a User to the Order
    public void assignUser(User user) {
        this.user = user;
        user.getOrders().add(this);
    }
    
    // Helper method to remove association with the User
    public void removeUser() {
        if (this.user != null) {
            this.user.getOrders().remove(this);
            this.user = null;
        }
    }
    
    
}
