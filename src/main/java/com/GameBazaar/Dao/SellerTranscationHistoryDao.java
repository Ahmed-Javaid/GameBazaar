package com.GameBazaar.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.GameBazaar.model.*;

public interface SellerTranscationHistoryDao extends JpaRepository<SellerTransactionHistory, Integer> {

}
