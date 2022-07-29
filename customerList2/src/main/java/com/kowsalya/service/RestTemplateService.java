package com.kowsalya.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.kowsalya.model.Customer;

@Service
public class RestTemplateService {

	RestTemplate restTemplate = new RestTemplate();

	private static final String get_All_Customer_URL = "http://localhost:8080/customer/getall";
	private static final String Create_Customer_URL = "http://localhost:8080/customer/add";
	private static final String Get_Customer_By_Id_URL = "http://localhost:8080/customer/getbyid/{id}";
	private static final String UPDATE_Customer_URL = "http://localhost:8080/customer/update";
	private static final String DELETE_Customer_URL = "http://localhost:8080/customer/delete/{id}";

	public ResponseEntity<String> allCustomer() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		// headers.add("Authorization", headerValue);

		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<String> response = restTemplate.exchange(get_All_Customer_URL, HttpMethod.GET, entity,
				String.class);

		return response;
	}

	public ResponseEntity<Customer> createCustomer(Customer customer) {

		return restTemplate.postForEntity(Create_Customer_URL, customer, Customer.class);

	}

	public Customer getCustomerById(int id) {
		Map<String, Integer> param = new HashMap<String, Integer>();
		param.put("id", id);
		return restTemplate.getForObject(Get_Customer_By_Id_URL, Customer.class, param);
	}

	public void updateCustomer(Customer customer) {
		restTemplate.put(UPDATE_Customer_URL, customer);
	}

	public void deleteCustomer(int id) {
		Map<String, Integer> param = new HashMap<String, Integer>();
		param.put("id", id);
		restTemplate.delete(DELETE_Customer_URL, param);
	}

}
