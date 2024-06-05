package com.GameBazaar.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PaymentID")
    private int paymentID;

    @OneToOne
    @JoinColumn(name = "transactionID", referencedColumnName = "transactionID")
    private Transaction transaction;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_type")
    private String paymentType;

    @Column(name = "amount")
    private double amount;

    // Constructors, getters, and setters
    public Payment() {}

    public Payment(Transaction transaction, String paymentType, double amount) {
        this.transaction = transaction;
        this.paymentType = paymentType;
        this.amount = amount;
    }

    // Getters and setters
    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
