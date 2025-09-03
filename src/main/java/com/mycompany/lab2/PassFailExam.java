/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Lab2;

/**
 *
 * @author 6237800
 */
public class PassFailExam extends PassFailActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public PassFailExam(int numQuestions, int numMissed, double minPassingScore) {
        this.numQuestions = numQuestions; 
        this.pointsEach = 100/numQuestions;
        this.numMissed = numMissed;
        setScore(100 - (numMissed * pointsEach));
        setMinPassingScore(minPassingScore);
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
    
    @Override
    public String toString() {
        return "each question counts " + pointsEach + "\nthe exam score is " + getScore() +
                "\nthe exam grade is " + getGrade();
    }
    
    
}
