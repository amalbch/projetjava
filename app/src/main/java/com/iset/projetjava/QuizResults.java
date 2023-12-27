package com.iset.projetjava;

import static com.iset.projetjava.R.id.startquizbtn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);
        final AppCompatButton startNewBtn = findViewById(R.id.startquizbtn);

        final TextView correctAnswer = findViewById(R.id.correctAnswer);
        final  TextView incorrectAnswers = findViewById(R.id.incorrectAnswer);
        final int getCorrectAnswers =getIntent().getIntExtra("correct",0);
        final int getInCorrectAnswers =getIntent().getIntExtra("Incorrect",0);
correctAnswer.setText(String.valueOf(getCorrectAnswers));
      incorrectAnswers.setText(String.valueOf(getInCorrectAnswers));

startNewBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(QuizResults.this,MainActivity.class));
        finish();
    }
});
    }
   public void onBackPressed () {

       super.onBackPressed();
       startActivity(new Intent(QuizResults.this, MainActivity.class));
       finish();
   }
}