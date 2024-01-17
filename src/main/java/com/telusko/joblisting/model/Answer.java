package com.telusko.joblisting.model;

public class Answer {
    private String text;
    private boolean isCorrect;

    // Constructeurs
    public Answer() {
    }

    public Answer(String text, boolean isCorrect) {
        this.text = text;
        this.isCorrect = isCorrect;
    }

    // Getters et Setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    // toString, equals, hashCode si nécessaire
    @Override
    public String toString() {
        return "Answer{" +
                "text='" + text + '\'' +
                ", isCorrect=" + isCorrect +
                '}';
    }
}
