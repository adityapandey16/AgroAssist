package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString(exclude = "user")
@Table(name = "cart")
public class Cart extends BaseEntity {
    
	//Cart Relationship with the CartItem : One-To-Many
	//Owning Side(Foreign Key) : CartItem (cart_id)
	//Inverse Side (Non-Owning Side): Cart (cartItems)
	@OneToMany(mappedBy = "cart",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<CartItem>cartItems=new ArrayList<>();
	
	
	//Cart Relationship with the User : One-To-One
	//Owning Side(Foreign Key) : Cart (user_id)
	//Inverse Side (Non-Owning Side): User (cart)
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	
	//Helper Methods For Cart To Add A Product
	public void addProduct(Product product,int productQuantity)
	{
		CartItem cartItem = new CartItem();
		cartItem.setCart(this);
		cartItem.setProduct(product);
		cartItem.setProductQuantity(productQuantity);
		this.cartItems.add(cartItem);
	}
	
	//Helper Method To Remove A Product From The Cart
    public void removeProduct(Product product) {
        CartItem itemToRemove = null;
        for (CartItem cartItem : this.cartItems) {
            if (cartItem.getProduct().equals(product)) {
                itemToRemove = cartItem;
                break;
            }
        }
        if (itemToRemove != null) {
            itemToRemove.setCart(null); 
            itemToRemove.setProduct(null); 
            this.cartItems.remove(itemToRemove); 
        }
    }
    
    //Helper Method Between Cart And User 
    //To Associate A Cart With The USER :
    public void assignUser(User user) {
        this.user = user;
        user.setCart(this);
    }
   
    //To Remove Association 
    public void removeUser() {
        if (this.user != null) {
            this.user.setCart(null); // Dissociate the user from the cart
            this.user = null; // Remove the user from the cart
        }
    }

}
