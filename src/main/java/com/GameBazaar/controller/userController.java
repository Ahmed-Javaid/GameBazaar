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

import com.GameBazaar.model.user;
import com.GameBazaar.Dao.userDao;
import com.GameBazaar.service.userService;

public class userController {
    @Autowired
private userService service;
@GetMapping("/users")
public List<user> retriveAllUsers() {
    return service.findAll();
}

@GetMapping("/users/{id}")
public user retriveUser(@PathVariable int id) {
    return service.findOne(id);
}

// Method that posts a new user detail
@PostMapping("/users")
public user createUser(@RequestBody user user) {
    user savedUser = service.save(user);
    return savedUser;
}

// Method that deletes a user resource
// If the user deleted successfully it returns status 200 OK otherwise 404 Not Found
@DeleteMapping("/users/{id}")
public void deleteUser(@PathVariable int id) throws Exception {
    try {
        service.deleteById(id);
    } catch (Exception e) { // runtime exception
        throw new Exception("Not found id: " + id);
    }
}

// Method to update an existing user
@PutMapping("/users/{id}")
public user updateUser(@RequestBody user user, @PathVariable int id) {
    user existingUser = service.findOne(id);
    if (existingUser == null) {
        throw new RuntimeException("User not found with id: " + id);
    }
    user.setId(id); // Ensure the ID in the request body matches the path variable
    return service.updateUser(user);
}

}
