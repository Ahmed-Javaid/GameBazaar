package com.GameBazaar.model;

import jakarta.persistence.*;

@Entity
@Table(name = "CustomerTransactionHistory")
@IdClass(CustomerTransactionHistory.class)
public class CustomerTransactionHistory {
    @Id
    @Column(name = "CustomerID")
    private int customerID;

    @Id
    @Column(name = "TransactionID")
    private int transactionID;

    // Constructors, getters, and setters
    public CustomerTransactionHistory() {}

    public CustomerTransactionHistory(int customerID, int transactionID) {
        this.customerID = customerID;
        this.transactionID = transactionID;
    }

    // Getters and setters
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }
}
