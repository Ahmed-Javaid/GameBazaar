package com.GameBazaar.model;

import jakarta.persistence.*;

@Entity
@Table(name = "MobileWalletPayment")
public class MobileWalletPayment {
    @Id
    @Column(name = "PaymentID")
    private int paymentID;

    @Column(name = "AccountID")
    private int accountID;

    // Constructors, getters, and setters
    public MobileWalletPayment() {}

    public MobileWalletPayment(int accountID) {
        this.accountID = accountID;
    }

    // Getters and setters
    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }
}
