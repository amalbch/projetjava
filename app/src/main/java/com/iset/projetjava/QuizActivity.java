package com.iset.projetjava;

import static android.R.color.white;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


public class QuizActivity extends AppCompatActivity {
private  TextView questions ;
private  TextView question ;
   // private  TextView answer;
private AppCompatButton option1,option2,option3,option4;
private AppCompatButton nextBtn;
private Timer quizTimer ;
private int TotalTimeInMins ;
private  int Seconde =0;
private  List <QuestionsList>questionsLists;
private  int currentQuestionPosition =0 ;
private String selectedOptionByuser ="";
    private boolean incorrectAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        final ImageView backBtn = findViewById(R.id.backBtn);
        final TextView timer = findViewById(R.id.timer);
        final TextView selectedtopicname = findViewById(R.id.topicName);

        questions = findViewById(R.id.questions);
        question = findViewById(R.id.question);
        option1 = findViewById(R.id.option1);
        option2 =findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        nextBtn = findViewById(R.id.nextBtn);


        final String getselectedTopicName = getIntent().getStringExtra("selectedTopic");
        selectedtopicname.setText(getselectedTopicName);
        questionsLists =QuestionsBank.getQuestions(getselectedTopicName);
        startTime(timer);
        questions.setText((currentQuestionPosition+1)+"/"+questionsLists.size());
        questions.setText(questionsLists.get(0).getQuestion());
        option1.setText(questionsLists.get(0).getOption1());
        option2.setText(questionsLists.get(0).getOption2());
        option3.setText(questionsLists.get(0).getOption3());
        option4.setText(questionsLists.get(0).getOption4());

option1.setOnClickListener(new View.OnClickListener() {
    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View v) {
        if (selectedOptionByuser.isEmpty()){
            selectedOptionByuser = option1.getText().toString();
            option1.setBackgroundResource(R.drawable.round_back_red10);
            option1.setTextColor(white);
            getWallpaper();
            questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByuser);
        }

    }
});

        option2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if (selectedOptionByuser.isEmpty()){
                    selectedOptionByuser = option2.getText().toString();
                    option2.setBackgroundResource(R.drawable.round_back_red10);
                    option2.setTextColor(white);
                    revealAnswer();
                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByuser);
                }

            }
        });
        option3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if (selectedOptionByuser.isEmpty()){
                    selectedOptionByuser = option3.getText().toString();
                    option3.setBackgroundResource(R.drawable.round_back_red10);
                    option3.setTextColor(white);
                    revealAnswer();
                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByuser);
                }
            }
        });
        option4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if (selectedOptionByuser.isEmpty()){
                    selectedOptionByuser = option4.getText().toString();
                    option4.setBackgroundResource(R.drawable.round_back_red10);
                    option4.setTextColor(white);
                    revealAnswer();
                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByuser);
                }
            }
        });
       nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
if (selectedOptionByuser.isEmpty()){
    Toast.makeText(QuizActivity.this,"please select an option",Toast.LENGTH_SHORT).show();
}else { changeNextQuestion();}}

        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quizTimer.purge();
                quizTimer.cancel();
                startActivity(new Intent(QuizActivity.this, MainActivity.class));
                finish();
            }
        });
    }

    private void revealAnswer() {
    }

    private void changeNextQuestion(){
            currentQuestionPosition++;
            if (currentQuestionPosition<questionsLists.size() ){
            selectedOptionByuser="";
            option1.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            option1.setTextColor(Color.parseColor("#1F6BB83"));

            option2.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            option2.setTextColor(Color.parseColor("#1F6BB83"));

            option3.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            option3.setTextColor(Color.parseColor("#1F6BB83"));

            option4.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            option4.setTextColor(Color.parseColor("#1F6BB83"));
            questions.setText((currentQuestionPosition+1)+"/"+questionsLists.size());
            questions.setText(questionsLists.get(currentQuestionPosition).getQuestion());
            option1.setText(questionsLists.get(currentQuestionPosition).getOption1());
            option2.setText(questionsLists.get(currentQuestionPosition).getOption2());
            option3.setText(questionsLists.get(currentQuestionPosition).getOption3());
            option4.setText(questionsLists.get(currentQuestionPosition).getOption4());
            }
else{
    Intent intent = new Intent(QuizActivity.this,QuizResults.class);
    intent.putExtra("Correct",getCorrectAnswers());
    intent.putExtra("inCorrect",getIncorrectAnswers());
    startActivity(intent);
    finish();

        }
    }

     private void startTime (TextView timeTextView){
         quizTimer = new Timer();
         quizTimer.scheduleAtFixedRate(new TimerTask() {
             private boolean incorrectAnswers;

             @Override
             public void run() {
                 if (Seconde == 0) {
                     TotalTimeInMins--;
                     Seconde = 59;
                 } else if (Seconde == 0 && TotalTimeInMins == 0) {
                     quizTimer.purge();
                     quizTimer.cancel();
                 }
                 Toast.makeText(QuizActivity.this, "Time Over", Toast.LENGTH_SHORT).show();
                 Intent intent = new Intent(QuizActivity.this, QuizResults.class);
                 intent.putExtra("Correct", getCorrectAnswers());
                 intent.putExtra("inCorrect", getInCorrectAnswers());
                 startActivity(intent);
                 finish();
             }


             void startTime(TextView timeTextView) {
                 quizTimer = new Timer();
                 quizTimer.scheduleAtFixedRate(new TimerTask() {
                     @Override
                     public void run() {
                         if (Seconde == 0) {
                             TotalTimeInMins--;
                             Seconde = 59;
                         } else if (Seconde == 0 && TotalTimeInMins == 0) {
                             quizTimer.purge();
                             quizTimer.cancel();
                             Toast.makeText(QuizActivity.this, "Time Over", Toast.LENGTH_SHORT).show();
                             Intent intent = new Intent(QuizActivity.this, QuizResults.class);
                             intent.putExtra("Correct", getCorrectAnswers());
                             intent.putExtra("inCorrect", getInCorrectAnswers());
                             startActivity(intent);
                             finish();
                         } else {
                             Seconde--;
                         }

                         runOnUiThread(new Runnable() {
                             @Override
                             public void run() {
                                 String finalMinutes = String.valueOf(TotalTimeInMins);
                                 String finalSeconds = String.valueOf(Seconde);

                                 if (finalMinutes.length() == 1) {
                                     finalMinutes = "0" + finalMinutes;
                                 }
                                 if (finalSeconds.length() == 1) {
                                     finalSeconds = "0" + finalSeconds;
                                 }

                                 timeTextView.setText(finalMinutes + "" + finalSeconds);
                             }
                         });
                     }
                 }, 1000, 1000);
             }

             private int getCorrectAnswers() {
                 int correctAnswers = 0;
                 for (int i = 0; i < questionsLists.size(); i++) {
                     final String getuserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
                     final String getAnswer = questionsLists.get(i).getAnswer();
                     if (getuserSelectedAnswer.equals(getAnswer)) {
                         correctAnswers++;
                     }
                 }
                 return correctAnswers;
             }


             private int getInCorrectAnswers() {
                 int correctAnswers = 0;
                 for (int i = 0; i < questionsLists.size(); i++) {
                     final String getuserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
                     final String getAnswer = questionsLists.get(i).getAnswer();
                     if (!getuserSelectedAnswer.equals(getAnswer)) {
                         correctAnswers++;
                     }
                 }
                 return correctAnswers;
             }
             @Override

             public void OnBackPressed() {
          QuizActivity.super.onBackPressed();
                 quizTimer.purge();
                 quizTimer.cancel();
                 startActivity(new Intent(QuizActivity.this, MainActivity.class));
                 finish();
             }


             @SuppressLint("ResourceAsColor")
             private void revealAnswer() {
                 final String getAnswer = questionsLists.get(currentQuestionPosition).getAnswer();
                 if (option1.getText().toString().equals(getAnswer)) {
                     option1.setBackgroundResource(R.drawable.round_back_green10);
                     option1.setTextColor(white);
                 } else if (option2.getText().toString().equals(getAnswer)) {
                     option2.setBackgroundResource(R.drawable.round_back_green10);
                     option2.setTextColor(white);

                 } else if (option3.getText().toString().equals(getAnswer)) {
                     option3.setBackgroundResource(R.drawable.round_back_green10);
                     option3.setTextColor(white);

                 } else if (option4.getText().toString().equals(getAnswer)) {
                     option4.setBackgroundResource(R.drawable.round_back_green10);
                     option4.setTextColor(white);

                 }
             }

             public boolean getIncorrectAnswers() {
                 return incorrectAnswers;
             }

             public void setIncorrectAnswers(boolean incorrectAnswers) {
                 this.incorrectAnswers = incorrectAnswers;
             }
         });}

    public boolean getIncorrectAnswers() {
        return incorrectAnswers;
    }

    public boolean getCorrectAnswers() {

        boolean correctAnswers;
        correctAnswers = true;
        return correctAnswers;
    }
}