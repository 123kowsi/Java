package com.kowsalya.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kowsalya.dao.CustomerDao;
import com.kowsalya.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerDao cusDao;


	@Override
	public String addcustomer(Customer cus) {
		if (cusDao.addcustomer(cus)) {
			return "added succesfully";
		} 
		return "not added";
	}

	@Override
	public String deletecustomer(int id) {
		if (cusDao.deletecustomer(id)) {
			return "Deleted Successfully";
		} 
		return "error deleting";
	}

	@Override
	public String updatecustomer(Customer cus) {
		if (cusDao.updatecustomer(cus)) {
			return "Updated Successfully";
		}
		return "Its new user...Added successfully ";
	}

	@Override
	public Customer getcustomer(int id) {
		return cusDao.getcustomer(id);
	}

	@Override
	public List<Customer> getallcustomer() {
		return cusDao.getallcustomer();
	}
}
