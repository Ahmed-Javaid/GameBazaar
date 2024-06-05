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

import com.GameBazaar.model.CreditCardPayment;
import com.GameBazaar.service.CreditCardPaymentService;

@RestController
public class CreditCardPaymentController {

    @Autowired
    private CreditCardPaymentService creditCardPaymentService;

    @GetMapping("/creditCardPayments")
    public List<CreditCardPayment> retrieveAllCreditCardPayments() {
        return creditCardPaymentService.findAll();
    }

    @GetMapping("/creditCardPayments/{id}")
    public CreditCardPayment retrieveCreditCardPayment(@PathVariable int id) {
        return creditCardPaymentService.findOne(id);
    }

    // Method that posts a new credit card payment detail
    @PostMapping("/creditCardPayments")
    public CreditCardPayment createCreditCardPayment(@RequestBody CreditCardPayment creditCardPayment) {
        CreditCardPayment savedCreditCardPayment = creditCardPaymentService.save(creditCardPayment);
        return savedCreditCardPayment;
    }

    // Method that deletes a credit card payment resource
    @DeleteMapping("/creditCardPayments/{id}")
    public void deleteCreditCardPayment(@PathVariable int id) throws Exception {
        try {
            creditCardPaymentService.deleteById(id);
        } catch (Exception e) { // runtime exception
            throw new Exception("Not found id: " + id);
        }
    }

    // Method to update an existing credit card payment
    @PutMapping("/creditCardPayments/{id}")
    public CreditCardPayment updateCreditCardPayment(@RequestBody CreditCardPayment creditCardPayment, @PathVariable int id) {
        CreditCardPayment existingCreditCardPayment = creditCardPaymentService.findOne(id);
        if (existingCreditCardPayment == null) {
            throw new RuntimeException("Credit card payment not found with id: " + id);
        }
        creditCardPayment.setPaymentID(id); // Ensure the ID in the request body matches the path variable
        return creditCardPaymentService.updateCreditCardPayment(creditCardPayment);
    }
}
