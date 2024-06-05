package com.GameBazaar.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.GameBazaar.Dao.SalelineitemDao;
import com.GameBazaar.model.SalelineItem;

@Service
public class SaleLineItemService {

    @Autowired
    private SalelineitemDao salelineItemDao;

    // Method that retrieves all sale line items from the list  
    public List<SalelineItem> findAll() {
        return salelineItemDao.findAll();
    }

    // Method that adds a sale line item to the list   
    public SalelineItem save(SalelineItem salelineItem) {
        return salelineItemDao.save(salelineItem);
    }

    // Method that finds a particular sale line item from the list  
    public SalelineItem findOne(int id) {
        return salelineItemDao.findById(id).orElse(null);
    }

    // Method that deletes a sale line item resource
    public void deleteById(int id) {
        salelineItemDao.deleteById(id);
    }

    // Method to update an existing sale line item
    public SalelineItem updateSalelineItem(SalelineItem updatedSalelineItem) {
        return salelineItemDao.save(updatedSalelineItem);
    }
}
