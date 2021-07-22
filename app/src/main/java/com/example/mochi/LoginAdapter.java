package com.example.mochi;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LoginAdapter  extends FragmentPagerAdapter {


    private Context context;
    int totalTabs;

    public LoginAdapter(FragmentManager fm, Context context, int totalTabs){
        super(fm);
        this.context = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public int getCount() {
        return totalTabs;
    }

    public Fragment getItem(int position){
        switch (position){
            case 0:
                login_tab_fragment loginTabFragment = new  login_tab_fragment();
                return loginTabFragment;
            case 1:
                signup_tab_fragment  signup_tab_fragment = new signup_tab_fragment();
                return signup_tab_fragment;
            default:
                return  null;
        }

    }
}
