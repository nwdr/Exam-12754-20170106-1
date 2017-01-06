package com.webssm.mapper;

import com.webssm.entities.Customer;

public interface CustomerMapper extends BaseMapper<Customer,Integer> {
	Customer getByFirstName(String firstName);
}
