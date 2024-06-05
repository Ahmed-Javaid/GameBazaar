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

import com.GameBazaar.model.CustomerTransactionHistory;
import com.GameBazaar.service.CustomerTransactionHistoryService;

@RestController
public class CustomerTransactionHistoryController {

    @Autowired
    private CustomerTransactionHistoryService customerTransactionHistoryService;

    @GetMapping("/customer-transaction-history")
    public List<CustomerTransactionHistory> retrieveAllCustomerTransactionHistory() {
        return customerTransactionHistoryService.findAll();
    }

    @GetMapping("/customer-transaction-history/{id}")
    public CustomerTransactionHistory retrieveCustomerTransactionHistory(@PathVariable Integer id) {
        return customerTransactionHistoryService.findOne(id);
    }

    @PostMapping("/customer-transaction-history")
    public CustomerTransactionHistory createCustomerTransactionHistory(@RequestBody CustomerTransactionHistory customerTransactionHistory) {
        return customerTransactionHistoryService.updateCustomerTransactionHistory(customerTransactionHistory);
    }

    @DeleteMapping("/customer-transaction-history/{id}")
    public void deleteCustomerTransactionHistory(@PathVariable Integer id) {
        customerTransactionHistoryService.deleteById(id);
    }

    @PutMapping("/customer-transaction-history/{id}")
    public CustomerTransactionHistory updateCustomerTransactionHistory(@RequestBody CustomerTransactionHistory customerTransactionHistory, @PathVariable Integer id) {
        customerTransactionHistory.setCustomerID(id); // Ensure the ID in the request body matches the path variable
        return customerTransactionHistoryService.updateCustomerTransactionHistory(customerTransactionHistory);
    }
}
