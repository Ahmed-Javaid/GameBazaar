package com.GameBazaar.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.GameBazaar.Dao.UserLibraryDao;
import com.GameBazaar.model.UserLibrary;

@Service
public class UserLibraryService {

    @Autowired
    private UserLibraryDao userLibraryDao;

    // Method that retrieves all user libraries from the list  
    public List<UserLibrary> findAll() {
        return userLibraryDao.findAll();
    }

    // Method that adds a user library to the list   
    public UserLibrary save(UserLibrary userLibrary) {
        return userLibraryDao.save(userLibrary);
    }

    // Method that finds a particular user library from the list  
    public UserLibrary findOne(int id) {
        return userLibraryDao.findById(id).orElse(null);
    }

    // Method that deletes a user library resource
    public void deleteById(int id) {
        userLibraryDao.deleteById(id);
    }

    // Method to update an existing user library
    public UserLibrary updateUserLibrary(UserLibrary updatedUserLibrary) {
        return userLibraryDao.save(updatedUserLibrary);
    }
}
