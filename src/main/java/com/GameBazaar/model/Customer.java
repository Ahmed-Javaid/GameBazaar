package com.GameBazaar.model;


import jakarta.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @Column(name = "CustomerID")
    private int customerID;

    @Column(name = "UserID")
    private int userID;

    public Customer() {}

    public Customer(int customerID, int userID) {
        this.customerID = customerID;
        this.userID = userID;
    }

    // Getters and Setters
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
