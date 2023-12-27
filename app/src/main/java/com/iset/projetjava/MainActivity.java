package com.iset.projetjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private  String selectedTopicName ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LinearLayout Sport = findViewById(R.id.sportlayout);
        final LinearLayout geographie = findViewById(R.id.Géographielayout);
        final LinearLayout Politique = findViewById(R.id.Politiquelayout);
                                final LinearLayout  Technologie = findViewById(R.id.Technologielayout);
                                        final Button StartBtn =findViewById(R.id.startquizbtn);
                                        Sport.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                selectedTopicName =" Sport ";
                                                Sport.setBackgroundResource(R.drawable.round_back_white_strok10);
                                                geographie.setBackgroundResource(R.drawable.round_back_white10);
                                                Politique.setBackgroundResource(R.drawable.round_back_white10);
                                                Technologie.setBackgroundResource(R.drawable.round_back_white10);


                                            }
                                        });
        geographie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName ="  Géographie ";
                geographie.setBackgroundResource(R.drawable.round_back_white_strok10);
                Sport.setBackgroundResource(R.drawable.round_back_white10);
                Politique.setBackgroundResource(R.drawable.round_back_white10);
                Technologie.setBackgroundResource(R.drawable.round_back_white10);


            }
        });
        Politique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName ="   Politique ";
                Politique.setBackgroundResource(R.drawable.round_back_white_strok10);
                Sport.setBackgroundResource(R.drawable.round_back_white10);
                geographie.setBackgroundResource(R.drawable.round_back_white10);
                Technologie.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        Technologie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    selectedTopicName ="Technologie ";
                    Technologie.setBackgroundResource(R.drawable.round_back_white_strok10);
                    Sport.setBackgroundResource(R.drawable.round_back_white10);
                geographie.setBackgroundResource(R.drawable.round_back_white10);
                    Politique.setBackgroundResource(R.drawable.round_back_white10);

            }
        });
        StartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this,"Please select the topic",Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new  Intent(MainActivity.this,QuizActivity.class);
                    intent.putExtra("selectedTopic",selectedTopicName);
                    startActivity(intent);
                }

            }
        });



    }
}