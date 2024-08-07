package com.example.demoapp.dao;

import com.example.demoapp.models.Customer;

public class CustomerDAO {

// define a method to return sample Customer data
    public Customer getCustomerData() {
        Customer customer = new Customer("John", "Doe", "123 Main St", "San Francisco", "CA", "94105", "415-555-1212");
        return customer;
    }

    

}
