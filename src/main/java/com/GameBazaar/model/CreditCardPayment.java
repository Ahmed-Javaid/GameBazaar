package com.GameBazaar.model;

import jakarta.persistence.*;

@Entity
@Table(name = "CreditCardPayment")
public class CreditCardPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PaymentID")
    private int paymentID;

    @Column(name = "CVC")
    private String cvc;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "expiry_date")
    private java.sql.Date expiryDate;

    // Constructors, getters, and setters
    public CreditCardPayment() {}

    public CreditCardPayment(String cvc, String cardNumber, java.sql.Date expiryDate) {
        this.cvc = cvc;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    // Getters and setters
    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public java.sql.Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(java.sql.Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}

