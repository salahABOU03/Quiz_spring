package com.telusko.joblisting.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "attempts")
public class Attempt {
    @Id
    private String id;
    private User student;
    private Quiz quiz;
    private List<Answer> answers;

    // Constructeurs
    public Attempt() {
    }

    public Attempt(User student, Quiz quiz, List<Answer> answers) {
        this.student = student;
        this.quiz = quiz;
        this.answers = answers;
    }

    // Getters et Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getStudent() {
        return student;
    }

    public void setStudent(User student) {
        this.student = student;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    // toString, equals, hashCode si nécessaire
    @Override
    public String toString() {
        return "Attempt{" +
                "id='" + id + '\'' +
                ", student=" + student +
                ", quiz=" + quiz +
                ", answers=" + answers +
                '}';
    }
}
