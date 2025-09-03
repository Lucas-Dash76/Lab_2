/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Lab2;

/**
 *
 * @author 6237800
 */
public class Essay extends GradedActivity {
    private double grammar;
    private double spelling;
    private double correctLength;
    private double content;
    
    public void setScore(double grammar, double spelling, double length, double content) {
        setScore(grammar + spelling + length + content);
    }

    public double getGrammar() {
        return grammar;
    }

    public void setGrammar(double grammar) {
        this.grammar = grammar;
    }

    public double getSpelling() {
        return spelling;
    }

    public void setSpelling(double spelling) {
        this.spelling = spelling;
    }

    public double getCorrectLength() {
        return correctLength;
    }

    public void setCorrectLength(double correctLength) {
        this.correctLength = correctLength;
    }

    public double getContent() {
        return content;
    }

    public void setContent(double content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "total points: " + getScore() + "\nGrade: " + getGrade() ;
    }
    
    
}
