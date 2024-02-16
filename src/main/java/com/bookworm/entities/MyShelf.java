package com.bookworm.entities;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity 
public class MyShelf {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shelfId;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id" )
    private Customer customerId;
   
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Product productId;
    
    private String tranType;
    private LocalDate  productExpiryDate;
    private boolean isActive;
    
	public Long getShelfId() {
		return shelfId;
	}
	public void setShelfId(Long shelfId) {
		this.shelfId = shelfId;
	}
	public Product getProduct() {
		return productId;
	}
	public void setProduct(Product productId) {
		this.productId = productId;
	}
	public String getTranType() {
		return tranType;
	}
	public void setTranType(String tranType) {
		this.tranType = tranType;
	}
	public LocalDate getProductExpiryDate() {
		return productExpiryDate;
	}
	public void setProductExpiryDate(LocalDate localDate) {
		this.productExpiryDate = localDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public Customer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "MyShelf [shelfId=" + shelfId + ", customerId=" + customerId + ", productId=" + productId + ", tranType="
				+ tranType + ", productExpiryDate=" + productExpiryDate + ", isActive=" + isActive + "]";
	}
	

}
