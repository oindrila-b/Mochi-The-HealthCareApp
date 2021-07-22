package com.example.mochi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Analysis_HappyUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_if_happy);
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