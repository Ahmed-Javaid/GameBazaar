package com.GameBazaar.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.GameBazaar.model.User;

public interface userDao extends JpaRepository<User, Integer> {
    
}
