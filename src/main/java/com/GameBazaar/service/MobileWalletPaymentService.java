package com.GameBazaar.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.GameBazaar.Dao.MobileWalletPaymentDao;
import com.GameBazaar.model.MobileWalletPayment;

@Service
public class MobileWalletPaymentService {
    @Autowired
    private MobileWalletPaymentDao mobileWalletPaymentDao;

    // Method that retrieves all mobile wallet payments from the list  
    public List<MobileWalletPayment> findAll() {
        return mobileWalletPaymentDao.findAll();
    }

    // Method that adds a mobile wallet payment to the list   
    public MobileWalletPayment save(MobileWalletPayment mobileWalletPayment) {
        return mobileWalletPaymentDao.save(mobileWalletPayment);
    }

    // Method that finds a particular mobile wallet payment from the list  
    public MobileWalletPayment findOne(int id) {
        return mobileWalletPaymentDao.findById(id).orElse(null);
    }

    // Method that deletes a mobile wallet payment resource
    public void deleteById(int id) {
        mobileWalletPaymentDao.deleteById(id);
    }

    // Method to update an existing mobile wallet payment
    public MobileWalletPayment updateMobileWalletPayment(MobileWalletPayment updatedMobileWalletPayment) {
        return mobileWalletPaymentDao.save(updatedMobileWalletPayment);
    }
}
