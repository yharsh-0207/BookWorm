package com.bookworm.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class InvoiceDetail {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long invoice_detail_id;
	@ManyToOne
    @JoinColumn(name = "invoice_id")
	private Invoice invoice_id;
	@ManyToOne
    @JoinColumn(name = "product_id")
	private Product product_id;
	private int quantity;
	private double base_price;
	private double sale_price;
	private char transaction_type;
	private int rent_days;
	
	
	public long getInvoice_detail_id() {
		return invoice_detail_id;
	}
	public void setInvoice_detail_id(long invoice_detail_id) {
		this.invoice_detail_id = invoice_detail_id;
	}
	public Invoice getInvoice_id() {
		return invoice_id;
	}
	public void setInvoice_id(Invoice invoice_id) {
		this.invoice_id = invoice_id;
	}
	public Product getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Product product_id) {
		this.product_id = product_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getBase_price() {
		return base_price;
	}
	public void setBase_price(double base_price) {
		this.base_price = base_price;
	}
	public double getSale_price() {
		return sale_price;
	}
	public void setSale_price(double sale_price) {
		this.sale_price = sale_price;
	}
	public char getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(char transaction_type) {
		this.transaction_type = transaction_type;
	}
	public int getRent_days() {
		return rent_days;
	}
	public void setRent_days(int rent_days) {
		this.rent_days = rent_days;
	}
}
