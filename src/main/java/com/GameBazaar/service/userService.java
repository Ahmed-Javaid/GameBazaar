package com.GameBazaar.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GameBazaar.Dao.userDao;
import com.GameBazaar.model.User;

@Service
public class userService {
    
    @Autowired
	private userDao userDao;
//method that retrieve all users from the list  
	public List<User> findAll() {
		return userDao.findAll();
	}

//method that add the user in the list   
	public User save(User user) {
		userDao.save(user);
		return user;
	}

//method that find a particular user from the list  
	public User findOne(int id) {
		return userDao.findById(id).get();
	}

	// method that delete a user resource
	public void deleteById(int id) {
		User entity = userDao.findById(id).get();
		userDao.delete(entity);
	}
	// Method to update an existing user
	public User updateUser(User updatedUser) {
		userDao.save(updatedUser);
		return updatedUser;
	}
}
