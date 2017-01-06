package com.webssm.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.*;

import com.webssm.entities.Customer;

@Component("customerValidator")
public class CustomerValidator implements Validator {
    public boolean supports(Class<?> aClass) {
        return aClass == Customer.class;
    }

    public void validate(Object o, Errors errors) {
        Customer customer = (Customer) o;
        if (customer.getFirst_name() == null) {
            errors.rejectValue("firstName","firstName为空");
        }
        if (customer.getLast_name() == null) {
            errors.rejectValue("lastName", "lastName为空");
        }
    }
}
