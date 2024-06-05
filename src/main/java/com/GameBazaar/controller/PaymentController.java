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

import com.GameBazaar.model.Payment;
import com.GameBazaar.service.PaymentService;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payments")
    public List<Payment> retrieveAllPayments() {
        return paymentService.findAll();
    }

    @GetMapping("/payments/{id}")
    public Payment retrievePayment(@PathVariable int id) {
        return paymentService.findOne(id);
    }

    @PostMapping("/payments")
    public Payment createPayment(@RequestBody Payment payment) {
        return paymentService.save(payment);
    }

    @DeleteMapping("/payments/{id}")
    public void deletePayment(@PathVariable int id) {
        paymentService.deleteById(id);
    }

    @PutMapping("/payments/{id}")
    public Payment updatePayment(@RequestBody Payment payment, @PathVariable int id) {
        payment.setPaymentID(id); // Ensure the ID in the request body matches the path variable
        return paymentService.updatePayment(payment);
    }
}
