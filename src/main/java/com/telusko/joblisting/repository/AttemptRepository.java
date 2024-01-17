package com.telusko.joblisting.repository;

import com.telusko.joblisting.model.Attempt;
import com.telusko.joblisting.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttemptRepository extends MongoRepository<Attempt, String> {

    List<Attempt> findByStudent(User student);

    List<Attempt> findByQuizId(String quizId);

    List<Attempt> findByStudentAndQuizId(User student, String quizId);

    
}
