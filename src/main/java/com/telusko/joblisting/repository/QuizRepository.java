package com.telusko.joblisting.repository;

import com.telusko.joblisting.model.Quiz;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface QuizRepository extends MongoRepository<Quiz, String> {
    List<Quiz> findByTitleContaining(String keyword);
}
