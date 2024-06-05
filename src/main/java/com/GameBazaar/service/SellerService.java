package com.GameBazaar.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.GameBazaar.Dao.SellerDao;
import com.GameBazaar.model.Seller;

@Service
public class SellerService {

    @Autowired
    private SellerDao sellerDao;

    // Method that retrieves all sellers from the list  
    public List<Seller> findAll() {
        return sellerDao.findAll();
    }

    // Method that adds a seller to the list   
    public Seller save(Seller seller) {
        return sellerDao.save(seller);
    }

    // Method that finds a particular seller from the list  
    public Seller findOne(int id) {
        return sellerDao.findById(id).orElse(null);
    }

    // Method that deletes a seller resource
    public void deleteById(int id) {
        sellerDao.deleteById(id);
    }

    // Method to update an existing seller
    public Seller updateSeller(Seller updatedSeller) {
        return sellerDao.save(updatedSeller);
    }
}
