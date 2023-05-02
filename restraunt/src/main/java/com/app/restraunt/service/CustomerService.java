package com.app.restraunt.service;

import com.app.restraunt.model.Customer;
import com.app.restraunt.model.Drink;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class CustomerService {
    private List<Customer> customers = new ArrayList<>();

    public CustomerService() {
        // initialize some customers
        customers.add(new Customer("Saurabh","email@example.com") );
        customers.add(new Customer("Sahil","sahil@example.com") );
        customers.add(new Customer("Yash","sahil@example.com") );
    }

    public List<Customer> getAllCustomers() {
        return customers;
    }

    public Customer getCustomerByEmail(String email) {
        return customers.stream()
                .filter(c -> c.getEmail().equalsIgnoreCase(email))
                .findFirst()
                .orElse(null);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
}

