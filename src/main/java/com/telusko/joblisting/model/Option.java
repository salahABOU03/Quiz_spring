package com.telusko.joblisting.model;

import org.springframework.data.annotation.Id;

public class Option {
    @Id
    private String id;

    private String text;
    private boolean isCorrect;

    // Getters et setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "Option{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", isCorrect=" + isCorrect +
                '}';
    }
}

