/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Lab2;

/**
 *
 * @author 6237800
 */
public class FinalExam extends GradedActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public FinalExam(int numQuestions, int numMissed) {
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;
        pointsEach = 100/numQuestions;
        setScore(100 - (numMissed * pointsEach));
    }
    
    public double getPointsEach() {
        return pointsEach;
    }
    
    public int getNumMissed() {
        return numMissed;
    }

    @Override
    public String toString() {
        return "each question counts " + getPointsEach() + "\nthe exam score is " + getScore() +
                "\nthe exam grade is " + getGrade();
    }
    
}
