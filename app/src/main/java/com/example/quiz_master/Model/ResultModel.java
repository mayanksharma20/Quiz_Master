package com.example.quiz_master.Model;


import com.example.quiz_master.views.ResultFragment;

public class ResultModel {

    private int correct ,wrong, notAnswered;

    public ResultModel(){}

    public int getWrong() {
        return wrong;
    }

    public int getCorrect() {
        return correct;
    }

    public int getNotAnswered() {
        return notAnswered;
    }
}