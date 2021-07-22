package com.example.mochi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GetHelpActivity extends AppCompatActivity {

    private RecyclerView courseRV;

    // Arraylist for storing data
    private ArrayList<com.example.mochi.PeopleModel> peopleModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gethelp);
        courseRV = findViewById(R.id.idRVCourse);

        // here we have created new array list and added data to it.
        peopleModelArrayList = new ArrayList<>();
        peopleModelArrayList.add(new com.example.mochi.PeopleModel("Dr. Rashid","B.A in psychology","9999999999" ));
        peopleModelArrayList.add(new com.example.mochi.PeopleModel("Dr. Jim Parsons","M.s. in Psychology","9125938927" ));
        peopleModelArrayList.add(new com.example.mochi.PeopleModel("Dr. Jennifer Paige","Ph.d. in Psychology","93621836723" ));
        peopleModelArrayList.add(new com.example.mochi.PeopleModel("Dr. Henry Jekyll","Psy.D.","8239479987" ));
        peopleModelArrayList.add(new com.example.mochi.PeopleModel("Dr. Sarah Lynch", "M.A. in Psychology","2384637293"));
        peopleModelArrayList.add(new com.example.mochi.PeopleModel("Dr. Jim Parsons","B.A in psychology","3283894627" ));
        peopleModelArrayList.add(new com.example.mochi.PeopleModel("Dr. Yuri Zhivago","Psy.D.","3839264738" ));
        peopleModelArrayList.add(new com.example.mochi.PeopleModel("Dr. Lao","M.s. in Psychology","7483937485" ));
        peopleModelArrayList.add(new com.example.mochi.PeopleModel("Dr. Andrew Manson","Psy.D.","6473847656" ));
        peopleModelArrayList.add(new com.example.mochi.PeopleModel("Dr. Wellington Yueh", "M.S. in Psychology","7384756478"));
        peopleModelArrayList.add(new com.example.mochi.PeopleModel("Dr. Hastie Lanyon","B.A in psychology","3728346573" ));
        peopleModelArrayList.add(new com.example.mochi.PeopleModel("Dr. Stevens","Psy.D.","3748374659" ));

        // we are initializing our adapter class and passing our arraylist to it.
        com.example.mochi.PeopleAdapter peopleAdapter = new com.example.mochi.PeopleAdapter(this, peopleModelArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(peopleAdapter);
    }
    public void meditationPart(View view)
    {
        startActivity((new Intent(this, MeditationActivity.class)));
    }
    public void homePart(View view)
    {
        startActivity((new Intent(this, MainActivity.class)));
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