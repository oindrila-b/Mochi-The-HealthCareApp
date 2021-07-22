package com.example.mochi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Analysis_Q1Activity extends AppCompatActivity {
    public static double grade=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.analysis_q1);
    }
    public void youHappy(View view){
        Intent intent = new Intent(this, com.example.mochi.Analysis_HappyUserActivity.class);
        intent.putExtra("grade",grade);
        startActivity(intent);
        finish();

    }
    public void youSad1(View view){
        Intent intent = new Intent(this, com.example.mochi.Analysis_Q2Activity.class);
        grade=1.0;
        intent.putExtra("grade",grade);
        startActivity(intent);
        finish();


    }
    public void youSad2(View view){
        Intent intent = new Intent(this, com.example.mochi.Analysis_Q2Activity.class);
        grade=2.0;
        intent.putExtra("grade",grade);
        startActivity(intent);
        finish();


    }
}
