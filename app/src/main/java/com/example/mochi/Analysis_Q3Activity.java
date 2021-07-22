package com.example.mochi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Analysis_Q3Activity extends AppCompatActivity {
    public static double grade=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.analysis_q3);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            grade = bundle.getDouble("grade");
        }
    }
    public void option1(View view)
    {
        Intent intent = new Intent(this,Analysis_Q4Activity.class);
        intent.putExtra("grade",grade);
        startActivity(intent);
        finish();
    }
    public void option2(View view)
    {
        Intent intent = new Intent(this,Analysis_Q4Activity.class);
        grade=grade+1.5;
        intent.putExtra("grade",grade);
        startActivity(intent);
        finish();
    }
    public void option3(View view)
    {
        Intent intent = new Intent(this,Analysis_Q4Activity.class);
        grade=grade+3.0;
        intent.putExtra("grade",grade);
        startActivity(intent);
        finish();
    }
}