package com.GameBazaar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GameBazaar.model.Reviews;
import com.GameBazaar.service.ReviewsService;

@RestController
public class ReviewsController {

    @Autowired
    private ReviewsService reviewsService;

    @GetMapping("/reviews")
    public List<Reviews> retrieveAllReviews() {
        return reviewsService.findAll();
    }

    @GetMapping("/reviews/{id}")
    public Reviews retrieveReview(@PathVariable int id) {
        return reviewsService.findOne(id);
    }

    @PostMapping("/reviews")
    public Reviews createReview(@RequestBody Reviews review) {
        return reviewsService.save(review);
    }

    @DeleteMapping("/reviews/{id}")
    public void deleteReview(@PathVariable int id) {
        reviewsService.deleteById(id);
    }

    @PutMapping("/reviews/{id}")
    public Reviews updateReview(@RequestBody Reviews review, @PathVariable int id) {
        review.setReviewID(id); // Ensure the ID in the request body matches the path variable
        return reviewsService.updateReview(review);
    }
}
