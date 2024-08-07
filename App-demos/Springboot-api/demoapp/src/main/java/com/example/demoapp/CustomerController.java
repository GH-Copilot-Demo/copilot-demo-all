package com.example.demoapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demoapp.models.Customer;

@Controller
public class CustomerController {

    // define a method to get customer details
    @RequestMapping("/customer")
    @ResponseBody
    public Customer getCustomer() {
        Customer customer = new Customer("John", "Doe", "123 Main St", "San Francisco", "CA", "94105", "415-555-1212");
        return customer;
    }


}
