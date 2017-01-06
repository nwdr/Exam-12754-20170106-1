package com.webssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webssm.entities.Customer;
import com.webssm.mapper.CustomerMapper;
import com.webssm.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

	@Override
	public Customer getByFirstName(String firstName) {
		return customerMapper.getByFirstName(firstName);
	}

}
