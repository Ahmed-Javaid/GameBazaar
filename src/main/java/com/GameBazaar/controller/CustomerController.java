package com.GameBazaar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GameBazaar.model.Customer;
import com.GameBazaar.service.CustomerService;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> retrieveAllCustomers() {
        return customerService.findAll();
    }

    @GetMapping("/customers/{id}")
    public Customer retrieveCustomer(@PathVariable int id) {
        return customerService.findOne(id);
    }

    // Method that posts a new customer detail
    @PostMapping("/customers")
    public Customer createCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = customerService.save(customer);
        return savedCustomer;
    }

    // Method that deletes a customer resource
    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(@PathVariable int id) throws Exception {
        try {
            customerService.deleteById(id);
        } catch (Exception e) { // runtime exception
            throw new Exception("Not found id: " + id);
        }
    }

    // Method to update an existing customer
    @PutMapping("/customers/{id}")
    public Customer updateCustomer(@RequestBody Customer customer, @PathVariable int id) {
        Customer existingCustomer = customerService.findOne(id);
        if (existingCustomer == null) {
            throw new RuntimeException("Customer not found with id: " + id);
        }
        customer.setCustomerID(id); // Ensure the ID in the request body matches the path variable
        return customerService.updateCustomer(customer);
    }
}
