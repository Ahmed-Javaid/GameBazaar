package com.GameBazaar.model;

import jakarta.persistence.*;

@Entity
@Table(name = "UserLibrary")
public class UserLibrary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "GameID")
    private int gameID;

    @Column(name = "UserID")
    private int userID;

    public UserLibrary() {}

    public UserLibrary(int gameID, int userID) {
        this.gameID = gameID;
        this.userID = userID;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
