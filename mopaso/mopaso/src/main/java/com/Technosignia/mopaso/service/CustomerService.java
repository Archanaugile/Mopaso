package com.Technosignia.mopaso.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.mopaso.dao.CustomerRepository;
import com.Technosignia.mopaso.entity.Customer;

@Service
public class CustomerService {

	
	@Autowired
	CustomerRepository customerReository;
	
	public Customer createCustomer(Customer customer){
		
		
	return customerReository.save(customer);
}
	
	public Customer updateCustomer(Customer customer,Long id) {
		
		Optional<Customer>opCust=customerReository.findById(id);
		Customer cust=opCust.get();
		
		cust.setName(customer.getName());
		cust.setAddress(customer.getAddress());
		cust.setContact(customer.getContact());
		cust.setEmail(customer.getEmail());
		return customerReository.save(cust);
	}
	
}


