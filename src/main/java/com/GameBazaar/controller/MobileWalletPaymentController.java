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

import com.GameBazaar.model.MobileWalletPayment;
import com.GameBazaar.service.MobileWalletPaymentService;

@RestController
public class MobileWalletPaymentController {

    @Autowired
    private MobileWalletPaymentService mobileWalletPaymentService;

    @GetMapping("/mobile-wallet-payments")
    public List<MobileWalletPayment> retrieveAllMobileWalletPayments() {
        return mobileWalletPaymentService.findAll();
    }

    @GetMapping("/mobile-wallet-payments/{id}")
    public MobileWalletPayment retrieveMobileWalletPayment(@PathVariable int id) {
        return mobileWalletPaymentService.findOne(id);
    }

    @PostMapping("/mobile-wallet-payments")
    public MobileWalletPayment createMobileWalletPayment(@RequestBody MobileWalletPayment mobileWalletPayment) {
        return mobileWalletPaymentService.save(mobileWalletPayment);
    }

    @DeleteMapping("/mobile-wallet-payments/{id}")
    public void deleteMobileWalletPayment(@PathVariable int id) {
        mobileWalletPaymentService.deleteById(id);
    }

    @PutMapping("/mobile-wallet-payments/{id}")
    public MobileWalletPayment updateMobileWalletPayment(@RequestBody MobileWalletPayment mobileWalletPayment, @PathVariable int id) {
        mobileWalletPayment.setPaymentID(id); // Ensure the ID in the request body matches the path variable
        return mobileWalletPaymentService.updateMobileWalletPayment(mobileWalletPayment);
    }
}
