package com.kowsalya.dao;

import java.util.List;

import com.kowsalya.model.Customer;

public interface CustomerDao {
	
	Boolean addcustomer(Customer cus);

	Boolean deletecustomer(int id);

	Boolean updatecustomer(Customer cus);

	Customer getcustomer(int id);

	List<Customer> getallcustomer();
}
