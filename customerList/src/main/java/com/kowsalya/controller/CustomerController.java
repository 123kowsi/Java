package com.kowsalya.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kowsalya.model.Customer;
import com.kowsalya.service.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {
	@Autowired
	private CustomerService serv;

	@PostMapping("/add")
	public String addemployee(@RequestBody Customer emp) {
		return serv.addcustomer(emp);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteemployee(@PathVariable("id") Integer id) {
		return serv.deletecustomer(id);
	}

	@GetMapping("/getbyid/{id}")
	public Customer getemployee(@PathVariable("id") Integer id) {
		return serv.getcustomer(id);
	}

	@GetMapping("/getall")
	public List<Customer> getallemployee() {
		return serv.getallcustomer();
	}

	@RequestMapping("/update")
	public String updateemployee(@RequestBody Customer emp) {
		return serv.updatecustomer(emp);
	}
}
