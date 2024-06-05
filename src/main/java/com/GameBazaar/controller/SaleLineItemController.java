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

import com.GameBazaar.model.SalelineItem;
import com.GameBazaar.service.SaleLineItemService;

@RestController
public class SaleLineItemController {

    @Autowired
    private SaleLineItemService saleLineItemService;

    @GetMapping("/salelineitems")
    public List<SalelineItem> retrieveAllSaleLineItems() {
        return saleLineItemService.findAll();
    }

    @GetMapping("/salelineitems/{id}")
    public SalelineItem retrieveSaleLineItem(@PathVariable int id) {
        return saleLineItemService.findOne(id);
    }

    @PostMapping("/salelineitems")
    public SalelineItem createSaleLineItem(@RequestBody SalelineItem salelineItem) {
        return saleLineItemService.save(salelineItem);
    }

    @DeleteMapping("/salelineitems/{id}")
    public void deleteSaleLineItem(@PathVariable int id) {
        saleLineItemService.deleteById(id);
    }

    @PutMapping("/salelineitems/{id}")
    public SalelineItem updateSaleLineItem(@RequestBody SalelineItem salelineItem, @PathVariable int id) {
        salelineItem.setId(id); // Ensure the ID in the request body matches the path variable
        return saleLineItemService.updateSalelineItem(salelineItem);
    }
}
