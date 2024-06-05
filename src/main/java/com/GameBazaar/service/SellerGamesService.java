package com.GameBazaar.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.GameBazaar.Dao.SellerGamesDao;
import com.GameBazaar.model.SellerGames;

@Service
public class SellerGamesService {

    @Autowired
    private SellerGamesDao sellerGamesDao;

    // Method that retrieves all seller games from the list  
    public List<SellerGames> findAll() {
        return sellerGamesDao.findAll();
    }

    // Method that adds a seller game to the list   
    public SellerGames save(SellerGames sellerGames) {
        return sellerGamesDao.save(sellerGames);
    }

    // Method that finds a particular seller game from the list  
    public SellerGames findOne(int sellerID, int gameID) {
        return sellerGamesDao.findById(sellerID).orElse(null);
    }

    // Method that deletes a seller game resource
    public void deleteById(int sellerID, int gameID) {
        sellerGamesDao.deleteById(sellerID);
    }

    // Method to update an existing seller game
    public SellerGames updateSellerGames(SellerGames updatedSellerGames) {
        return sellerGamesDao.save(updatedSellerGames);
    }
}
