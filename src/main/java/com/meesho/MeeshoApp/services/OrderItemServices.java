package com.meesho.MeeshoApp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meesho.MeeshoApp.dao.IOrderItemRepository;
import com.meesho.MeeshoApp.dto.OrderItemData;
import com.meesho.MeeshoApp.model.OrderItem;

	@Service
	public class OrderItemServices implements IOrderItemServices {
		
		@Autowired
	    private IOrderItemRepository orderitemRepository;

		private OrderItem getOrderItemEntity(OrderItemData orderitemData) {
	        OrderItem orderItem = new OrderItem();
	        orderItem.setItemId(orderitemData.getItemId());
	        orderItem.setProduct(orderitemData.getProduct());
	        orderItem.setQuantity(orderitemData.getQuantity());
	        orderItem.setOrders(orderitemData.getOrders());
	        return orderItem ;
	    }

	 
	    private OrderItemData getOrderItemData(OrderItem orderItem) {
	        OrderItemData orderItemData= new OrderItemData();
	        orderItemData.setItemId(orderItem.getItemId());
	        orderItemData.setProduct(orderItemData.getProduct());
	        orderItemData.setQuantity(orderItemData.getQuantity());
	        return orderItemData;
	    }

	
		
		@Override
		public List<OrderItemData> findAll() {
			List<OrderItemData> orderItemDataList=new ArrayList<>();
	        List<OrderItem> orderitems=orderitemRepository.findAll();
	        orderitems.forEach(orderitem->{orderItemDataList.add(getOrderItemData(orderitem));});
	        return orderItemDataList;
		}
		
		

		@Override
		public OrderItemData findById(Long id) {
			Optional<OrderItem> orderitemOptional = orderitemRepository.findById(id);
	        if (orderitemOptional == null) {
	            new EntityNotFoundException("Item Not Found");
	        }
	        return getOrderItemData(orderitemOptional.get());
		}




		@Override
		public OrderItemData create(OrderItemData orderItemData) {
			OrderItem orderItem=getOrderItemEntity(orderItemData);
	        return getOrderItemData(orderitemRepository.save(orderItem));
		}




		@Override
		public boolean delete(Long id) {
			boolean test=findAll().remove(findById(id));
	        orderitemRepository.deleteById(id);        
	        return test;
		}
		


		  public OrderItemData update( Long itemId,OrderItemData orderItemData) {
		        OrderItem orderItem=orderitemRepository.findById(itemId).get();
		        if(orderItem!=null) {
		        	orderItem.setProduct(orderItemData.getProduct());
		            orderItem.setQuantity(orderItemData.getQuantity());
		            orderItem.setOrders(orderItemData.getOrders());

		            orderitemRepository.save(orderItem);

		 

		            return  getOrderItemData(orderItem);
		        }
		        else {
		            return null;
		        }
	 

		    }


		
		
	}



