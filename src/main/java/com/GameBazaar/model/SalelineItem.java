package com.GameBazaar.model;

import jakarta.persistence.*;

@Entity
@Table(name = "SalelineItem")
public class SalelineItem {
    @Id
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "GameID", referencedColumnName = "id")
    private Game game;

    @Column(name = "price")
    private double price;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "RentalDuration")
    private java.sql.Date rentalDuration;

    // Constructors, getters, and setters
    public SalelineItem() {}

    public SalelineItem(int id, Game game, double price, int quantity, java.sql.Date rentalDuration) {
        this.id = id;
        this.game = game;
        this.price = price;
        this.quantity = quantity;
        this.rentalDuration = rentalDuration;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public java.sql.Date getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(java.sql.Date rentalDuration) {
        this.rentalDuration = rentalDuration;
    }
}
