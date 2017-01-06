package com.webssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webssm.entities.Customer;
import com.webssm.service.CustomerService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private CustomerService customerService;
	
    @RequestMapping(path = "/{first_name}", method= RequestMethod.GET)
    public Customer login(@PathVariable("first_name") String first_name) {
    	return customerService.getByFirstName(first_name);
    }
}
