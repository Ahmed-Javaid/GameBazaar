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

import com.GameBazaar.model.SellerTransactionHistory;
import com.GameBazaar.service.SellerTransactionHistoryService;

@RestController
public class SellerTransactionHistoryController {

    @Autowired
    private SellerTransactionHistoryService sellerTransactionHistoryService;

    @GetMapping("/sellertransactionhistory")
    public List<SellerTransactionHistory> retrieveAllSellerTransactionHistory() {
        return sellerTransactionHistoryService.findAll();
    }

    @GetMapping("/sellertransactionhistory/{sellerID}/{transactionID}")
    public SellerTransactionHistory retrieveSellerTransactionHistory(@PathVariable int sellerID, @PathVariable int transactionID) {
        return sellerTransactionHistoryService.findOne(sellerID, transactionID);
    }

    @PostMapping("/sellertransactionhistory")
    public SellerTransactionHistory createSellerTransactionHistory(@RequestBody SellerTransactionHistory sellerTransactionHistory) {
        return sellerTransactionHistoryService.save(sellerTransactionHistory);
    }

    @DeleteMapping("/sellertransactionhistory/{sellerID}/{transactionID}")
    public void deleteSellerTransactionHistory(@PathVariable int sellerID, @PathVariable int transactionID) {
        sellerTransactionHistoryService.deleteById(sellerID, transactionID);
    }

    @PutMapping("/sellertransactionhistory/{sellerID}/{transactionID}")
    public SellerTransactionHistory updateSellerTransactionHistory(@RequestBody SellerTransactionHistory sellerTransactionHistory,
            @PathVariable int sellerID, @PathVariable int transactionID) {
        sellerTransactionHistory.setSellerID(sellerID); // Ensure the ID in the request body matches the path variable
        sellerTransactionHistory.setTransactionID(transactionID);
        return sellerTransactionHistoryService.updateSellerTransactionHistory(sellerTransactionHistory);
    }
}
