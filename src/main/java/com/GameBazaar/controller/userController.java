package com.GameBazaar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.GameBazaar.model.User;
import com.GameBazaar.service.userService;

@RestController
public class userController {
    @Autowired
private userService service;
@GetMapping("/users")
public List<User> retriveAllUsers() {
    return service.findAll();
}

@GetMapping("/users/{id}")
public User retriveUser(@PathVariable int id) {
    return service.findOne(id);
}

// Method that posts a new user detail
@PostMapping("/users")
public User createUser(@RequestBody User user) {
    return service.save(user);
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
public User updateUser(@RequestBody User user, @PathVariable int id) {
    User existingUser = service.findOne(id);
    if (existingUser == null) {
        throw new RuntimeException("User not found with id: " + id);
    }
    user.setId(id); // Ensure the ID in the request body matches the path variable
    return service.updateUser(user);
}

}
