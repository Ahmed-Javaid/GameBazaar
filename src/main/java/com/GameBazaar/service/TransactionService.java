package com.GameBazaar.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.GameBazaar.Dao.TransactionDao;
import com.GameBazaar.model.Transaction;

@Service
public class TransactionService {

    @Autowired
    private TransactionDao transactionDao;

    // Method that retrieves all transactions from the list  
    public List<Transaction> findAll() {
        return transactionDao.findAll();
    }

    // Method that adds a transaction to the list   
    public Transaction save(Transaction transaction) {
        return transactionDao.save(transaction);
    }

    // Method that finds a particular transaction from the list  
    public Transaction findOne(int id) {
        return transactionDao.findById(id).orElse(null);
    }

    // Method that deletes a transaction resource
    public void deleteById(int id) {
        transactionDao.deleteById(id);
    }

    // Method to update an existing transaction
    public Transaction updateTransaction(Transaction updatedTransaction) {
        return transactionDao.save(updatedTransaction);
    }
}
