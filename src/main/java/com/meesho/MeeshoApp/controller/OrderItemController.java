package com.meesho.MeeshoApp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.meesho.MeeshoApp.dto.OrderItemData;
import com.meesho.MeeshoApp.services.OrderItemServices;

@RestController
@RequestMapping("/orderItems")
public class OrderItemController {

	@Autowired
	private OrderItemServices orderItemService;

	@GetMapping
	public List<OrderItemData> findAll() {
		return orderItemService.findAll();
	}
	
	@GetMapping("/orderItem/{id}")
	public OrderItemData findById(@PathVariable Long id) {
		return orderItemService.findById(id);
	}

	@PostMapping("/orderItem")
	public OrderItemData create(@RequestBody OrderItemData orderItemData) {
		return orderItemService.create(orderItemData);
	}

	@DeleteMapping("/orderItem/{id}")
	public boolean delete(@PathVariable Long id) {
		return orderItemService.delete(id);
	}
	
	@PutMapping("/orderItem/{id}")
		public OrderItemData update(@PathVariable Long id, @RequestBody OrderItemData orderItemData) {
		return orderItemService.update(id, orderItemData);
	}

}
