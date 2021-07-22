package com.example.mochi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AnalysisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
    }

    public void goBack( View view){
        Intent intent =  new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void goForward( View view){
        Intent intent =  new Intent(this, com.example.mochi.Analysis_Q1Activity.class);
        startActivity(intent);
        finish();
    }
    public void meditationPart(View view)
    {
        startActivity((new Intent(this, MeditationActivity.class)));
        finish();
    }
    public void getHelpPart(View view)
    {
        startActivity((new Intent(this, GetHelpActivity.class)));
        finish();
    }

    public void dailyAffirmationPart(View view)
    {
        startActivity((new Intent(this, DailyAffirmationActivity.class)));
        finish();
    }
    public void homePart(View view)
    {
        startActivity((new Intent(this, MainActivity.class)));
        finish();
    }
}

