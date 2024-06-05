package com.GameBazaar.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Game")
public class Game {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "SellerID")
    private int sellerID;

    @Column(name = "quantity")
    private int quantity;

    public Game() {}

    public Game(int id, String name, int sellerID, int quantity) {
        this.id = id;
        this.name = name;
        this.sellerID = sellerID;
        this.quantity = quantity;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
