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

import com.GameBazaar.model.UserLibrary;
import com.GameBazaar.service.UserLibraryService;

@RestController
public class UserLibraryController {

    @Autowired
    private UserLibraryService userLibraryService;

    @GetMapping("/userLibraries")
    public List<UserLibrary> retrieveAllUserLibraries() {
        return userLibraryService.findAll();
    }

    @GetMapping("/userLibraries/{id}")
    public UserLibrary retrieveUserLibrary(@PathVariable int id) {
        return userLibraryService.findOne(id);
    }

    @PostMapping("/userLibraries")
    public UserLibrary createUserLibrary(@RequestBody UserLibrary userLibrary) {
        return userLibraryService.save(userLibrary);
    }

    @DeleteMapping("/userLibraries/{id}")
    public void deleteUserLibrary(@PathVariable int id) {
        userLibraryService.deleteById(id);
    }

    @PutMapping("/userLibraries/{id}")
    public UserLibrary updateUserLibrary(@RequestBody UserLibrary userLibrary, @PathVariable int id) {
        userLibrary.setId(id); // Ensure the ID in the request body matches the path variable
        return userLibraryService.updateUserLibrary(userLibrary);
    }
}
