package org.example.Repositories;

import org.example.Models.Customer;

import java.util.*;

public class CustomerRepository {
    private final List<Customer> customers = new ArrayList<>();

    public List<Customer> getCustomers() { return customers; }

    public void addCustomer(Customer customer) {
        if (customer != null) {
            customers.add(customer);
        }
    }
}
