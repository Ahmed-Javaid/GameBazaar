package com.GameBazaar.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.GameBazaar.Dao.ReviewsDao;
import com.GameBazaar.model.Reviews;

@Service
public class ReviewsService {

    @Autowired
    private ReviewsDao reviewsDao;

    // Method that retrieves all reviews from the list  
    public List<Reviews> findAll() {
        return reviewsDao.findAll();
    }

    // Method that adds a review to the list   
    public Reviews save(Reviews review) {
        return reviewsDao.save(review);
    }

    // Method that finds a particular review from the list  
    public Reviews findOne(int id) {
        return reviewsDao.findById(id).orElse(null);
    }

    // Method that deletes a review resource
    public void deleteById(int id) {
        reviewsDao.deleteById(id);
    }

    // Method to update an existing review
    public Reviews updateReview(Reviews updatedReview) {
        return reviewsDao.save(updatedReview);
    }
}
