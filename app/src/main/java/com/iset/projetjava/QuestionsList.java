package com.iset.projetjava;

public class QuestionsList {
    private String question, option1, option2, option3, option4;
    private String userSelectedAnswer;
    private String answer;

    public QuestionsList(String question, String option1, String option2, String option3, String option4, String userSelectedAnswer, String answer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.userSelectedAnswer = userSelectedAnswer;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public String getUserSelectedAnswer() {
        return userSelectedAnswer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setUserSelectedAnswer(String userSelectedAnswer) {
        this.userSelectedAnswer = userSelectedAnswer;
    }
}