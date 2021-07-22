package com.example.mochi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MeditationActivity extends AppCompatActivity {

    private RecyclerView courseRV;

    // Arraylist for storing data
    private ArrayList<com.example.mochi.CourseModel> courseModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation);
        courseRV = findViewById(R.id.idRVCourse);

        // here we have created new array list and added data to it.
        courseModelArrayList = new ArrayList<>();
        courseModelArrayList.add(new com.example.mochi.CourseModel("Starry Nights", R.drawable.play_button));
        courseModelArrayList.add(new com.example.mochi.CourseModel("Spring Blue", R.drawable.play_button));
        courseModelArrayList.add(new com.example.mochi.CourseModel("Summer Daze", R.drawable.play_button));
        courseModelArrayList.add(new com.example.mochi.CourseModel("Milky Way", R.drawable.play_button));
        courseModelArrayList.add(new com.example.mochi.CourseModel("Night High", R.drawable.play_button));
        courseModelArrayList.add(new com.example.mochi.CourseModel("Inside Me", R.drawable.play_button));
        courseModelArrayList.add(new com.example.mochi.CourseModel("Waterfall", R.drawable.play_button));

        // we are initializing our adapter class and passing our arraylist to it.
        com.example.mochi.CourseAdapter courseAdapter = new com.example.mochi.CourseAdapter(this, courseModelArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(courseAdapter);
    }
    public void homePart(View view)
    {
        startActivity((new Intent(this, MainActivity.class)));
        finish();
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

}