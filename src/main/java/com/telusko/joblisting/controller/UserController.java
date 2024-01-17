package com.telusko.joblisting.controller;

import com.telusko.joblisting.model.User;
import com.telusko.joblisting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        // Votre logique pour la validation des données et l'enregistrement de l'utilisateur
        // Assurez-vous de valider les données d'entrée avant d'enregistrer l'utilisateur
        userService.saveUser(user);
        return ResponseEntity.ok("User registered successfully.");
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody User user) {
        // Votre logique pour l'authentification de l'utilisateur
        // Assurez-vous de valider les données d'entrée avant d'authentifier l'utilisateur
        User existingUser = userService.findByUsername(user.getUsername());
        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
            return ResponseEntity.ok("Login successful.");
        } else {
            return ResponseEntity.badRequest().body("Invalid username or password.");
        }
    }
}
