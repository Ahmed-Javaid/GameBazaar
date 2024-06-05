package com.GameBazaar.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.GameBazaar.model.CreditCardPayment;

public interface CreditCardPaymentDao extends JpaRepository<CreditCardPayment, Integer> {

}
