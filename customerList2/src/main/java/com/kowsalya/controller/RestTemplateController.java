package com.kowsalya.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kowsalya.model.Customer;
import com.kowsalya.service.RestTemplateService;

@RestController
@RequestMapping("RestTemplate")
public class RestTemplateController {
	
	@Autowired
	private RestTemplateService restTemplateService;
	
	@GetMapping("/getAllCustomer")
	public ResponseEntity<String> getAllCustomer(){
		
		return restTemplateService.allCustomer();
	}
	@PostMapping("/addCustomer")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
		
		return restTemplateService.createCustomer(customer);
	}
	
	@GetMapping("/getCustomer/{id}")
	public Customer getCustomerById(@PathVariable int id){
		
		return restTemplateService.getCustomerById(id);
	}
	@PutMapping("/updateCustomer")
	public void updateCustomer(@RequestBody Customer customer){
		
		restTemplateService.updateCustomer(customer);
	}
	@DeleteMapping("/deleteCustomer/{id}")
	public void deleteCustomer(@PathVariable int id){
		restTemplateService.deleteCustomer(id);
	}

}
