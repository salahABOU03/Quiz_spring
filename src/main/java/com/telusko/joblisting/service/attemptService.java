package com.telusko.joblisting.service;

import com.telusko.joblisting.repository.AttemptRepository ;

import com.telusko.joblisting.model.Attempt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class attemptService {

    private final AttemptRepository attemptRepository;

    @Autowired
    public attemptService(AttemptRepository attemptRepository) {
        this.attemptRepository = attemptRepository;
    }

    public Attempt createAttempt(Attempt attempt) {
        // Ajoutez ici toute logique de validation ou de traitement nécessaire avant de sauvegarder l'attempt
        return attemptRepository.save(attempt);
    }

    public List<Attempt> getAllAttempts() {
        return attemptRepository.findAll();
    }


}
