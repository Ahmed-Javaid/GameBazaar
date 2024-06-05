package com.GameBazaar.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GameBazaar.Dao.AdminDao;
import com.GameBazaar.model.Admin;

@Service
public class AdminService {

    @Autowired
	private AdminDao adminDao;

	// Method that retrieves all admins from the list  
	public List<Admin> findAll() {
		return adminDao.findAll();
	}

	// Method that adds the admin in the list   
	public Admin save(Admin admin) {
		adminDao.save(admin);
		return admin;
	}

	// Method that finds a particular admin from the list  
	public Admin findOne(int id) {
		return adminDao.findById(id).get();
	}

	// Method that deletes an admin resource
	public void deleteById(int id) {
		Admin entity = adminDao.findById(id).get();
		adminDao.delete(entity);
	}

	// Method to update an existing admin
	public Admin updateAdmin(Admin updatedAdmin) {
		adminDao.save(updatedAdmin);
		return updatedAdmin;
	}
}
