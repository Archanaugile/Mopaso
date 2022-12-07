package com.Technosignia.mopaso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.mopaso.dao.CustomerRepository;
import com.Technosignia.mopaso.entity.Customer;
import com.Technosignia.mopaso.service.CustomerService;


@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	@PostMapping("/customer")
	public Customer crateCustomer(@RequestBody Customer customer) {
	
		return customerService.createCustomer(customer); 
	}
	
	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer customer,@RequestParam Long id) {
		return customerService.updateCustomer(customer,id);
		
}
	}

