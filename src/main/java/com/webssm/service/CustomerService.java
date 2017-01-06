package com.webssm.service;

import com.webssm.entities.Customer;

public interface CustomerService {
    Customer getByFirstName(String firstName);
}
