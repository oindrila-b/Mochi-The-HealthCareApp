package com.example.mochi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Analysis_reportActivity extends AppCompatActivity {
    private static double grade=0;
    private static ImageView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.analysis_report);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            grade = bundle.getDouble("grade");
        }
        result=findViewById(R.id.result);
        if(grade<=5){
            result.setImageResource(R.drawable.music_meditation);

        }else if(grade<=10){
            result.setImageResource(R.drawable.daily_aff);
        }else{
            result.setImageResource(R.drawable.help);
        }
    }

    public void analysisResult(View view){
        if(grade<=5){
            startActivity((new Intent(this, MeditationActivity.class)));
            finish();

        }else if(grade<=10){
            startActivity((new Intent(this, DailyAffirmationActivity.class)));
            finish();
        }else{
            startActivity((new Intent(this, GetHelpActivity.class)));
            finish();
        }
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