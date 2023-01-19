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

import com.meesho.MeeshoApp.dto.CustomerData;
import com.meesho.MeeshoApp.services.CustomerServices;



@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerServices customerService;

	@GetMapping("/findall")
	public List<CustomerData> findAll() {
		return customerService.findAll();
	}

	@GetMapping("/findone/{id}")
	public CustomerData findById(@PathVariable Long id) {
		return customerService.findById(id);
	}

	@PostMapping("/create")
	public CustomerData create(@RequestBody CustomerData customerData) {
		return customerService.create(customerData);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable Long id) {
		return customerService.delete(id);
	}
	
	@PutMapping("/update/{id}")
	public CustomerData update(@PathVariable Long id, @RequestBody CustomerData customerData) {
		return customerService.update(id, customerData);
	}
}