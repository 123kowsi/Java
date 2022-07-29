package com.kowsalya.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kowsalya.dao.RestDao;
import com.kowsalya.model.RestModel;


@RestController
@RequestMapping("springmvc")
public class Restcontroller {  
	@Autowired
	private RestDao empDao;
//	
//	@GetMapping("/getAllCustomer")
//	public ResponseEntity<String> getAllCustomer(){
//		
//		return empDao.allCustomer();
//	}
	@RequestMapping("/empform")  
    public String showform(Model m){  
    	m.addAttribute("command", new RestModel());
    	return "empform";
	}
 
}  