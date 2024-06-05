package com.GameBazaar.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.GameBazaar.Dao.CustomerTransactionHistoryDao;
import com.GameBazaar.model.CustomerTransactionHistory;
@Service
public class CustomerTransactionHistoryService {
    @Autowired
    private CustomerTransactionHistoryDao customerTransactionHistoryDao;

    // Method that retrieves all customer transaction histories from the list
    public List<CustomerTransactionHistory> findAll() {
        return customerTransactionHistoryDao.findAll();
    }

    // Method that adds a customer transaction history to the list
    // Method that finds a particular customer transaction history from the list
    public CustomerTransactionHistory findOne(Integer id) {
        return customerTransactionHistoryDao.findById(id).orElse(null);
    }

    // Method that deletes a customer transaction history resource
    public void deleteById(Integer id) {
        customerTransactionHistoryDao.deleteById(id);
    }

    // Method to update an existing customer transaction history
    public CustomerTransactionHistory updateCustomerTransactionHistory(CustomerTransactionHistory updatedCustomerTransactionHistory) {
        return customerTransactionHistoryDao.save(updatedCustomerTransactionHistory);
    }
}
