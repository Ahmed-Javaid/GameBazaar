package com.GameBazaar.Dao;

import com.GameBazaar.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDao extends JpaRepository<Payment, Integer> {

}
