package com.GameBazaar.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.GameBazaar.Dao.GameDao;
import com.GameBazaar.model.Game;

@Service
public class GameService {

    @Autowired
    private GameDao gameDao;

    // Method that retrieves all games from the list  
    public List<Game> findAll() {
        return gameDao.findAll();
    }

    // Method that adds a game to the list   
    public Game save(Game game) {
        return gameDao.save(game);
    }

    // Method that finds a particular game from the list  
    public Game findOne(int id) {
        return gameDao.findById(id).orElse(null);
    }

    // Method that deletes a game resource
    public void deleteById(int id) {
        gameDao.deleteById(id);
    }

    // Method to update an existing game
    public Game updateGame(Game updatedGame) {
        return gameDao.save(updatedGame);
    }
}
