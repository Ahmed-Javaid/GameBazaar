package com.GameBazaar.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Reviews")
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ReviewID")
    private int reviewID;

    @ManyToOne
    @JoinColumn(name = "UserID", referencedColumnName = "id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "GameID", referencedColumnName = "id")
    private Game game;

    @Column(name = "Rating")
    private float rating;

    // Constructors, getters, and setters
    public Reviews() {}

    public Reviews(User user, Game game, float rating) {
        this.user = user;
        this.game = game;
        this.rating = rating;
    }

    // Getters and setters
    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
