package com.meesho.MeeshoApp.model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "OrderItem")
@Component

public class OrderItem {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long itemId;
	
 	@OneToOne(cascade = CascadeType.ALL)
    private Product product;
 	private Long quantity;
   
    
    @ManyToOne
    private Orders orders;


	public OrderItem() {
		super();
		
	}


	public OrderItem(Long itemId, Product product, Long quantity, Orders orders) {
		super();
		this.itemId = itemId;
		this.product = product;
		this.quantity = quantity;
		this.orders = orders;
	}


	public OrderItem(Product product, Long quantity, Orders orders) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.orders = orders;
	}


	public Long getItemId() {
		return itemId;
	}


	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public Long getQuantity() {
		return quantity;
	}


	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}


	public Orders getOrders() {
		return orders;
	}


	public void setOrders(Orders orders) {
		this.orders = orders;
	}


	@Override
	public String toString() {
		return "OrderItem [itemId=" + itemId + ", product=" + product + ", quantity=" + quantity + ", orders=" + orders
				+ "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(itemId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(itemId, other.itemId);
	}
	
	


	
}