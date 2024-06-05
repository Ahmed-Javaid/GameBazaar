package com.GameBazaar.service;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.GameBazaar.Dao.userDao;
import com.GameBazaar.model.user;

@Service
public class userService {
    
    @Autowired
	private userDao userDao;
//method that retrieve all users from the list  
	public List<user> findAll() {
		return userDao.findAll();
	}

//method that add the user in the list   
	public user save(user user) {
		userDao.save(user);
		return user;
	}

//method that find a particular user from the list  
	public user findOne(int id) {
		return userDao.findById(id).get();
	}

	// method that delete a user resource
	public void deleteById(int id) {
		user entity = userDao.findById(id).get();
		userDao.delete(entity);
	}
	// Method to update an existing user
	public user updateUser(user updatedUser) {
		userDao.save(updatedUser);
		return updatedUser;
	}
}
