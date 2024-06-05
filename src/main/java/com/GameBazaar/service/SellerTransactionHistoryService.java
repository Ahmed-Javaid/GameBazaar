package com.GameBazaar.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.GameBazaar.Dao.SellerTranscationHistoryDao;
import com.GameBazaar.model.SellerTransactionHistory;

@Service
public class SellerTransactionHistoryService {

    @Autowired
    private SellerTranscationHistoryDao sellerTransactionHistoryDao;

    // Method that retrieves all seller transaction history from the list  
    public List<SellerTransactionHistory> findAll() {
        return sellerTransactionHistoryDao.findAll();
    }

    // Method that adds a seller transaction history to the list   
    public SellerTransactionHistory save(SellerTransactionHistory sellerTransactionHistory) {
        return sellerTransactionHistoryDao.save(sellerTransactionHistory);
    }

    // Method that finds a particular seller transaction history from the list  
    public SellerTransactionHistory findOne(int sellerID, int transactionID) {
        return sellerTransactionHistoryDao.findById(sellerID).orElse(null);
    }

    // Method that deletes a seller transaction history resource
    public void deleteById(int sellerID, int transactionID) {
        sellerTransactionHistoryDao.deleteById(sellerID);
    }

    // Method to update an existing seller transaction history
    public SellerTransactionHistory updateSellerTransactionHistory(SellerTransactionHistory updatedSellerTransactionHistory) {
        return sellerTransactionHistoryDao.save(updatedSellerTransactionHistory);
    }
}
