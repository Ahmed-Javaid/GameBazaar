package com.GameBazaar.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GameBazaar.Dao.CustomerDao;
import com.GameBazaar.model.Customer;

@Service
public class CustomerService {
    
    @Autowired
	private CustomerDao customerDao;

	// Method that retrieves all customers from the list  
	public List<Customer> findAll() {
		return customerDao.findAll();
	}

	// Method that adds a customer to the list   
	public Customer save(Customer customer) {
		customerDao.save(customer);
		return customer;
	}

	// Method that finds a particular customer from the list  
	public Customer findOne(int id) {
		return customerDao.findById(id).get();
	}

	// Method that deletes a customer resource
	public void deleteById(int id) {
		Customer entity = customerDao.findById(id).get();
		customerDao.delete(entity);
	}

	// Method to update an existing customer
	public Customer updateCustomer(Customer updatedCustomer) {
		customerDao.save(updatedCustomer);
		return updatedCustomer;
	}

}

