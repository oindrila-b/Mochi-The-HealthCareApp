package com.example.mochi;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.jetbrains.annotations.NotNull;

public class SplashScreen  extends AppCompatActivity {

    ImageView imageView;
    private static final int NUM_PAGES = 4;
    private ViewPager viewPager;
    private ScreenSildePageAdapter pageAdapter;
    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        firebaseAuth = FirebaseAuth.getInstance();

        FirebaseUser user = firebaseAuth.getCurrentUser();

        if (user != null) {

            startActivity(new Intent(this, MainActivity.class));
            finish();
        }
        setContentView(R.layout.activity_splash);

        imageView = findViewById(R.id.imageView);

        viewPager =  findViewById(R.id.pager);
        pageAdapter =  new ScreenSildePageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);


    }



    private class ScreenSildePageAdapter extends FragmentStatePagerAdapter {


        public ScreenSildePageAdapter(@NonNull @NotNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @NotNull
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0: FragementBackground fragment1 =
                        new FragementBackground();
                    return fragment1;
                case 1: OnBoardingFragment1 tab1 =
                        new OnBoardingFragment1();
                    return tab1;
                case 2: OnBoardingFragment2 tab2 =
                        new OnBoardingFragment2();
                    return tab2;
                case 3: OnBoardingFragment3 tab3 =
                        new OnBoardingFragment3();
                    return tab3;
            }
            return null;
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }

}

