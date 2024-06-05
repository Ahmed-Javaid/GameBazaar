package com.GameBazaar.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.GameBazaar.model.user;

public interface userDao extends JpaRepository<user, Integer> {
    
}
