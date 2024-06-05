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

import com.GameBazaar.model.Seller;
import com.GameBazaar.service.SellerService;

@RestController
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @GetMapping("/sellers")
    public List<Seller> retrieveAllSellers() {
        return sellerService.findAll();
    }

    @GetMapping("/sellers/{id}")
    public Seller retrieveSeller(@PathVariable int id) {
        return sellerService.findOne(id);
    }

    @PostMapping("/sellers")
    public Seller createSeller(@RequestBody Seller seller) {
        return sellerService.save(seller);
    }

    @DeleteMapping("/sellers/{id}")
    public void deleteSeller(@PathVariable int id) {
        sellerService.deleteById(id);
    }

    @PutMapping("/sellers/{id}")
    public Seller updateSeller(@RequestBody Seller seller, @PathVariable int id) {
        seller.setSellerID(id); // Ensure the ID in the request body matches the path variable
        return sellerService.updateSeller(seller);
    }
}
