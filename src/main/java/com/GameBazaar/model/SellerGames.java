package com.GameBazaar.model;

import jakarta.persistence.*;

@Entity
@Table(name = "SellerGames")
@IdClass(SellerGames.class)
public class SellerGames {
    @Id
    @Column(name = "SellerID")
    private int sellerID;

    @Id
    @Column(name = "GameID")
    private int gameID;

    // Constructors, getters, and setters
    public SellerGames() {}

    public SellerGames(int sellerID, int gameID) {
        this.sellerID = sellerID;
        this.gameID = gameID;
    }

    // Getters and setters
    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }
}
