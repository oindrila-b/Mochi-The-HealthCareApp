package com.example.mochi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Analysis_Q2Activity extends AppCompatActivity {
    public static double grade=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.analysis_q2);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
             grade = bundle.getDouble("grade");
        }

    }
    public void option1(View view)
    {
        Intent intent = new Intent(this,Analysis_Q3Activity.class);
        grade=grade+1.0;
        intent.putExtra("grade",grade);
        startActivity(intent);
        finish();
    }
    public void option2(View view)
    {
        Intent intent = new Intent(this,Analysis_Q3Activity.class);
        grade=grade+2.0;
        intent.putExtra("grade",grade);
        startActivity(intent);
        finish();
    }
    public void option3(View view)
    {
        Intent intent = new Intent(this,Analysis_Q3Activity.class);
        grade=grade+4.0;
        intent.putExtra("grade",grade);
        startActivity(intent);
        finish();
    }
}
