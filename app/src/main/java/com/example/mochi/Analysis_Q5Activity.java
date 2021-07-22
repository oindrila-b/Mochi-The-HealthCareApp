package com.example.mochi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Analysis_Q5Activity extends AppCompatActivity {
    public static double grade=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.analysis_q5);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            grade = bundle.getDouble("grade");
        }
    }
    public void option1(View view)
    {
        Intent intent = new Intent(this,Analysis_reportActivity.class);
        grade= grade+3;
        intent.putExtra("grade",grade);
        startActivity(intent);
        finish();
    }
    public void option2(View view)
    {
        Intent intent = new Intent(this,Analysis_reportActivity.class);
        grade=grade+3;
        intent.putExtra("grade",grade);
        startActivity(intent);
        finish();
    }
    public void option3(View view)
    {
        Intent intent = new Intent(this,Analysis_reportActivity.class);
        grade= grade+5;
        intent.putExtra("grade",grade);
        startActivity(intent);
        finish();;
    }
    public void option4(View view)
    {
        Intent intent = new Intent(this,Analysis_reportActivity.class);
        grade=grade+2;
        intent.putExtra("grade",grade);
        startActivity(intent);
        finish();
    }
    public void option5(View view)
    {
        Intent intent = new Intent(this,Analysis_reportActivity.class);
        grade=grade+1;
        intent.putExtra("grade",grade);
        startActivity(intent);
        finish();
    }
}