package com.meesho.MeeshoApp.dto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import com.meesho.MeeshoApp.model.Customer;
import com.meesho.MeeshoApp.model.OrderItem;

public class OrderData {
	
	
	private Date orderDate;
	
	private Customer customer;
	
	private List<OrderItem> orderItem = new ArrayList<OrderItem>();

	public OrderData() {
		super();
		
	}

	public OrderData(Customer customer, List<OrderItem> orderItem) {
		super();
		this.customer = customer;
		this.orderItem = orderItem;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(List<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}

	@Override
	public String toString() {
		return "OrderData [orderDate=" + orderDate + ", customer=" + customer + ", orderItem=" + orderItem + "]";
	}
	
	
	
	

}
