package com.telusko.joblisting.service;

import com.telusko.joblisting.model.Quiz;
import com.telusko.joblisting.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    private final QuizRepository quizRepository;

    @Autowired
    public QuizService(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    public Quiz getQuizById(String id) {
        return quizRepository.findById(id).orElse(null);
    }

    public Quiz createQuiz(Quiz quiz) {
        // Ajoutez ici la logique de validation ou de traitement avant d'enregistrer le quiz
        return quizRepository.save(quiz);
    }

    public Quiz updateQuiz(String id, Quiz updatedQuiz) {
        Quiz existingQuiz = getQuizById(id);
        if (existingQuiz != null) {
            // Mettez à jour les propriétés du quiz existant avec les nouvelles valeurs
            existingQuiz.setTitle(updatedQuiz.getTitle());
            existingQuiz.setProfessor(updatedQuiz.getProfessor());
            existingQuiz.setQuestions(updatedQuiz.getQuestions());
            // Ajoutez ici d'autres propriétés à mettre à jour selon vos besoins

            // Enregistrez le quiz mis à jour dans la base de données
            return quizRepository.save(existingQuiz);
        } else {
            return null; // Quiz non trouvé
        }
    }

    public boolean deleteQuiz(String id) {
        Quiz existingQuiz = getQuizById(id);
        if (existingQuiz != null) {
            quizRepository.delete(existingQuiz);
            return true;
        } else {
            return false; // Quiz non trouvé
        }
    }
}
