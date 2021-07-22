package com.example.mochi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth=FirebaseAuth.getInstance();

        ImageButton dailyAffirmation = findViewById(R.id.dailyAffirmation);
        ImageButton analysis = findViewById(R.id.analysis);
        ImageButton meditation = findViewById(R.id.relaxingMusic);
        ImageButton getHelp = findViewById(R.id.getHelp);


    }
    public void meditationPart(View view)
    {
        startActivity((new Intent(this, MeditationActivity.class)));
    }
    public void getHelpPart(View view)
    {
        startActivity((new Intent(this, GetHelpActivity.class)));
    }

    public void dailyAffirmationPart(View view)
    {
        startActivity((new Intent(this, DailyAffirmationActivity.class)));
    }
    public void getAnalysisPart(View view)
    {
        startActivity((new Intent(this, AnalysisActivity.class)));
    }
    public void logoutPart(View view)
    {
        firebaseAuth.signOut();
        startActivity((new Intent(this, LoginActivity.class)));
        finish();
    }

}