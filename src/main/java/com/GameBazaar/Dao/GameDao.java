package com.GameBazaar.Dao;

import com.GameBazaar.model.CustomerTransactionHistory;
import com.GameBazaar.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameDao extends JpaRepository<Game, Integer> {

}
