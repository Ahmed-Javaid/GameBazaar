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

import com.GameBazaar.model.Admin;
import com.GameBazaar.service.AdminService;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/admins")
    public List<Admin> retrieveAllAdmins() {
        return adminService.findAll();
    }

    @GetMapping("/admins/{id}")
    public Admin retrieveAdmin(@PathVariable int id) {
        return adminService.findOne(id);
    }

    // Method that posts a new admin detail
    @PostMapping("/admins")
    public Admin createAdmin(@RequestBody Admin admin) {
        Admin savedAdmin = adminService.save(admin);
        return savedAdmin;
    }

    // Method that deletes an admin resource
    @DeleteMapping("/admins/{id}")
    public void deleteAdmin(@PathVariable int id) throws Exception {
        try {
            adminService.deleteById(id);
        } catch (Exception e) { // runtime exception
            throw new Exception("Not found id: " + id);
        }
    }

    // Method to update an existing admin
    @PutMapping("/admins/{id}")
    public Admin updateAdmin(@RequestBody Admin admin, @PathVariable int id) {
        Admin existingAdmin = adminService.findOne(id);
        if (existingAdmin == null) {
            throw new RuntimeException("Admin not found with id: " + id);
        }
        admin.setAdminID(id); // Ensure the ID in the request body matches the path variable
        return adminService.updateAdmin(admin);
    }
}
