package com.example.mochi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class DailyAffirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affirmation);

        ViewPager viewPager = findViewById(R.id.viewPager);
        com.example.mochi.ImageAdapter imageAdapter = new com.example.mochi.ImageAdapter(this);
        viewPager.setAdapter(imageAdapter);

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

    public void homePart(View view)
    {
        startActivity((new Intent(this, MainActivity.class)));
        finish();
    }
    public void getAnalysisPart(View view)
    {
        startActivity((new Intent(this, AnalysisActivity.class)));
        finish();
    }

}
