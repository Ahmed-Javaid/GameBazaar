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

import com.GameBazaar.model.Transaction;
import com.GameBazaar.service.TransactionService;

@RestController
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/transactions")
    public List<Transaction> retrieveAllTransactions() {
        return transactionService.findAll();
    }

    @GetMapping("/transactions/{id}")
    public Transaction retrieveTransaction(@PathVariable int id) {
        return transactionService.findOne(id);
    }

    @PostMapping("/transactions")
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.save(transaction);
    }

    @DeleteMapping("/transactions/{id}")
    public void deleteTransaction(@PathVariable int id) {
        transactionService.deleteById(id);
    }

    @PutMapping("/transactions/{id}")
    public Transaction updateTransaction(@RequestBody Transaction transaction, @PathVariable int id) {
        transaction.setTransactionID(id); // Ensure the ID in the request body matches the path variable
        return transactionService.updateTransaction(transaction);
    }
}
