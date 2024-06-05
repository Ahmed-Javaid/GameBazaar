package com.GameBazaar.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.GameBazaar.Dao.PaymentDao;
import com.GameBazaar.model.Payment;

@Service
public class PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    // Method that retrieves all payments from the list  
    public List<Payment> findAll() {
        return paymentDao.findAll();
    }

    // Method that adds a payment to the list   
    public Payment save(Payment payment) {
        return paymentDao.save(payment);
    }

    // Method that finds a particular payment from the list  
    public Payment findOne(int id) {
        return paymentDao.findById(id).orElse(null);
    }

    // Method that deletes a payment resource
    public void deleteById(int id) {
        paymentDao.deleteById(id);
    }

    // Method to update an existing payment
    public Payment updatePayment(Payment updatedPayment) {
        return paymentDao.save(updatedPayment);
    }
}
