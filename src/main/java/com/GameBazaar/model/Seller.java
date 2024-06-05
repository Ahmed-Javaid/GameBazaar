package com.GameBazaar.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Seller")
public class Seller {

    @Id
    @Column(name = "SellerID")
    private int sellerID;

    @Column(name = "UserID")
    private int userID;

    public Seller() {}

    public Seller(int sellerID, int userID) {
        this.sellerID = sellerID;
        this.userID = userID;
    }

    // Getters and Setters
    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
