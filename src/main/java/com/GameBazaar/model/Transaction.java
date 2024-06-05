package com.GameBazaar.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transactionID")
    private int transactionID;

    @ManyToOne
    @JoinColumn(name = "itemID", referencedColumnName = "id")
    private Game item;

    @Column(name = "dateOfTransaction")
    private java.sql.Date dateOfTransaction;

    // Constructors, getters, and setters
    public Transaction() {}

    public Transaction(Game item, java.sql.Date dateOfTransaction) {
        this.item = item;
        this.dateOfTransaction = dateOfTransaction;
    }

    // Getters and setters
    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public Game getItem() {
        return item;
    }

    public void setItem(Game item) {
        this.item = item;
    }

    public java.sql.Date getDateOfTransaction() {
        return dateOfTransaction;
    }

    public void setDateOfTransaction(java.sql.Date dateOfTransaction) {
        this.dateOfTransaction = dateOfTransaction;
    }
}
