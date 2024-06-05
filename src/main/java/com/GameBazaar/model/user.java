package com.GameBazaar.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class user {
    @Id
    private Integer id;
    private String FirstName;
    private String LastName;
    private String email;
    private String DOB;
    private String  username;
    private String password;
    private String contactNumber;

    public user() {
        super();
    }

    public user(Integer id, String firstName, String lastName, String email, String DOB, String username, String password, String contactNumber) {
        super();
        this.id = id;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.email = email;
        this.DOB = DOB;
        this.username = username;
        this.password = password;
        this.contactNumber = contactNumber;
    }

    // Getter and Setter methods for all fields

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // Override toString() method

    @Override
    public String toString() {
        return String.format("User [id=%s, FirstName=%s, LastName=%s, email=%s, DOB=%s, username=%s, password=%s, contactNumber=%s]",
                id, FirstName, LastName, email, DOB, username, password, contactNumber);
    }

}
