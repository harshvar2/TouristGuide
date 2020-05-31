package com.harsh.application.TourGuide;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the view pager that wil allow the user to swipe in beetween fragments

        ViewPager viewPager=findViewById(R.id.viewpager);

        //Create an adapter that knows which fragment should be shown on each page
        FragmentAdapter adapter =new FragmentAdapter(this,getSupportFragmentManager() );
        viewPager.setAdapter(adapter);

        //Find the tab layout that shows the tabs
        TabLayout tablayout= (TabLayout) findViewById(R.id.tabs);

        tablayout.setupWithViewPager(viewPager);


    }
}
