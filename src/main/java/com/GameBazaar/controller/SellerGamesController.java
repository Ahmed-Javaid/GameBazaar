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

import com.GameBazaar.model.SellerGames;
import com.GameBazaar.service.SellerGamesService;

@RestController
public class SellerGamesController {

    @Autowired
    private SellerGamesService sellerGamesService;

    @GetMapping("/sellergames")
    public List<SellerGames> retrieveAllSellerGames() {
        return sellerGamesService.findAll();
    }

    @GetMapping("/sellergames/{sellerID}/{gameID}")
    public SellerGames retrieveSellerGame(@PathVariable int sellerID, @PathVariable int gameID) {
        return sellerGamesService.findOne(sellerID, gameID);
    }

    @PostMapping("/sellergames")
    public SellerGames createSellerGame(@RequestBody SellerGames sellerGames) {
        return sellerGamesService.save(sellerGames);
    }

    @DeleteMapping("/sellergames/{sellerID}/{gameID}")
    public void deleteSellerGame(@PathVariable int sellerID, @PathVariable int gameID) {
        sellerGamesService.deleteById(sellerID, gameID);
    }

    @PutMapping("/sellergames/{sellerID}/{gameID}")
    public SellerGames updateSellerGame(@RequestBody SellerGames sellerGames,
            @PathVariable int sellerID, @PathVariable int gameID) {
        sellerGames.setSellerID(sellerID); // Ensure the ID in the request body matches the path variable
        sellerGames.setGameID(gameID);
        return sellerGamesService.updateSellerGames(sellerGames);
    }
}
