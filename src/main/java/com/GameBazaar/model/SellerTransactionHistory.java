package com.GameBazaar.model;

import jakarta.persistence.*;

@Entity
@Table(name = "SellerTransactionHistory")
@IdClass(SellerTransactionHistory.class)
public class SellerTransactionHistory {
    @Id
    @Column(name = "SellerID")
    private int sellerID;

    @Id
    @Column(name = "TransactionID")
    private int transactionID;

    // Constructors, getters, and setters
    public SellerTransactionHistory() {}

    public SellerTransactionHistory(int sellerID, int transactionID) {
        this.sellerID = sellerID;
        this.transactionID = transactionID;
    }

    // Getters and setters
    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }
}
