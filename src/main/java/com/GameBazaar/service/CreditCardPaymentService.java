package com.GameBazaar.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GameBazaar.Dao.CreditCardPaymentDao;
import com.GameBazaar.model.CreditCardPayment;
@Service
public class CreditCardPaymentService {
    @Autowired
	private CreditCardPaymentDao creditCardPaymentDao;

	// Method that retrieves all credit card payments from the list  
	public List<CreditCardPayment> findAll() {
		return creditCardPaymentDao.findAll();
	}

	// Method that adds a credit card payment to the list   
	public CreditCardPayment save(CreditCardPayment creditCardPayment) {
		creditCardPaymentDao.save(creditCardPayment);
		return creditCardPayment;
	}

	// Method that finds a particular credit card payment from the list  
	public CreditCardPayment findOne(int id) {
		return creditCardPaymentDao.findById(id).get();
	}

	// Method that deletes a credit card payment resource
	public void deleteById(int id) {
		CreditCardPayment entity = creditCardPaymentDao.findById(id).get();
		creditCardPaymentDao.delete(entity);
	}

	// Method to update an existing credit card payment
	public CreditCardPayment updateCreditCardPayment(CreditCardPayment updatedCreditCardPayment) {
		creditCardPaymentDao.save(updatedCreditCardPayment);
		return updatedCreditCardPayment;
	}
}
