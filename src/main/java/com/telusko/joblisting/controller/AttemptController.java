package com.telusko.joblisting.controller;

import com.telusko.joblisting.model.Attempt;
import  com.telusko.joblisting.service.attemptService; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attempts")
public class AttemptController {

    private final attemptService attemptService;

    @Autowired
    public AttemptController(attemptService attemptService) {
        this.attemptService = attemptService;
    }

    @PostMapping
    public ResponseEntity<Attempt> createAttempt(@RequestBody Attempt attempt) {
        Attempt createdAttempt = attemptService.createAttempt(attempt);
        return new ResponseEntity<>(createdAttempt, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Attempt>> getAllAttempts() {
        List<Attempt> attempts = attemptService.getAllAttempts();
        return new ResponseEntity<>(attempts, HttpStatus.OK);
    }


}

