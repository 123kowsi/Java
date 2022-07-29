package com.kowsalya.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.kowsalya.dao.EmpDao;

@Controller
public class RestController {
	@Autowired  
    EmpDao dao;
	@RequestMapping("/add")
	public RedirectView add() {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("http://localhost:8080/SpringMVCCRUDSimple/empform");
		return redirectView;
	}
	@RequestMapping("/view")
	public RedirectView view() {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("http://localhost:8080/SpringMVCCRUDSimple/viewemp");
		return redirectView;
	}
	@RequestMapping("/edit/{id}")
	public RedirectView edit() {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("http://localhost:8080/SpringMVCCRUDSimple/editemp/{id}");
		return redirectView;
	}
	@RequestMapping("/delete/{id}")
	public RedirectView delete() {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("http://localhost:8080/SpringMVCCRUDSimple/deleteemp/{id}");
		return redirectView;
	}

}
