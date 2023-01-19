package com.meesho.MeeshoApp.dto;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.meesho.MeeshoApp.model.Orders;
import com.meesho.MeeshoApp.model.Product;

public class OrderItemData {
	
private Long itemId;
	
 	@OneToOne(cascade = CascadeType.ALL)
    private Product product;
 	private Long quantity; 
    @ManyToOne
    private Orders orders;
    
	public OrderItemData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderItemData(Product product, Long quantity, Orders orders) {
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
		return "OrderItemData [itemId=" + itemId + ", product=" + product + ", quantity=" + quantity + ", orders="
				+ orders + "]";
	}
	
	
    
    


}
