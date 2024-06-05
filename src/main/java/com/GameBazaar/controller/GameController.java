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

import com.GameBazaar.model.Game;
import com.GameBazaar.service.GameService;

@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/games")
    public List<Game> retrieveAllGames() {
        return gameService.findAll();
    }

    @GetMapping("/games/{id}")
    public Game retrieveGame(@PathVariable int id) {
        return gameService.findOne(id);
    }

    @PostMapping("/games")
    public Game createGame(@RequestBody Game game) {
        return gameService.save(game);
    }

    @DeleteMapping("/games/{id}")
    public void deleteGame(@PathVariable int id) {
        gameService.deleteById(id);
    }

    @PutMapping("/games/{id}")
    public Game updateGame(@RequestBody Game game, @PathVariable int id) {
        game.setId(id); // Ensure the ID in the request body matches the path variable
        return gameService.updateGame(game);
    }
}
