package com.GameBazaar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "Admin")
public class Admin {

    @Id
    @Column(name = "AdminID")
    private int adminID;

    @Column(name = "UserID")
    private int userID;

    public Admin() {}

    public Admin(int adminID, int userID) {
        this.adminID = adminID;
        this.userID = userID;
    }

    // Getters and Setters
    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
