package com.bookworm.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Cart {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int cartId;
	
@OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
private List<Product> product;
@OneToOne(fetch = FetchType.EAGER, cascade =  CascadeType.ALL)
private Customer customer;
private int quantity;


public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public List<Product> getProduct() {
	return product;
}
public void setProduct(List<Product> product) {
	this.product = product;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
@Override
public String toString() {
	return "Cart [cartId=" + cartId + ", product=" + product + ", customer=" + customer + ", quantity=" + quantity
			+ "]";
}



}
