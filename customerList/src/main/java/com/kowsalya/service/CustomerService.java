package com.kowsalya.service;

import java.util.List;
import com.kowsalya.model.Customer;

public interface CustomerService {
	
	String addcustomer(Customer cus);

	String deletecustomer(int id);

	String updatecustomer(Customer cus);

	Customer getcustomer(int id);

	List<Customer> getallcustomer();
}
