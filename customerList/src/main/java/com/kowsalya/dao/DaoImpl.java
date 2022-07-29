package com.kowsalya.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kowsalya.model.Customer;
import com.kowsalya.repository.CustomerRepository;

@Repository
public class DaoImpl implements CustomerDao {

	@Autowired
	private CustomerRepository customerRepository;
	

	@Override
	public Boolean addcustomer(Customer customer) {
		if (customerRepository.save(customer) != null) {
			return true;
		}
		return false;
	}

	@Override
	public Boolean deletecustomer(int id) {
		if (customerRepository.existsById(id)) {
			customerRepository.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public Boolean updatecustomer(Customer customer) {
		if (customerRepository.existsById(customer.getId())) {
			customerRepository.save(customer);
			return true;
		}
		customerRepository.save(customer);
		return false;
	}

	@Override
	public Customer getcustomer(int id) {
		Customer cus = customerRepository.findById(id).get();
		return cus;
	}

	@Override
	public List<Customer> getallcustomer() {
		List<Customer> allcus= customerRepository.findAll();
		System.out.println(allcus);
		return allcus;
	}
}
