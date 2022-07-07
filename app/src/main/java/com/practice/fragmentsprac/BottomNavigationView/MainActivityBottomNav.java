package com.practice.fragmentsprac.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.practice.fragmentsprac.R;

public class MainActivityBottomNav extends AppCompatActivity {

   BottomNavigationView bnv;
   FrameLayout fl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bottom_nav);

        fl=(FrameLayout) findViewById(R.id.bottomnav_frame);
        bnv=(BottomNavigationView) findViewById(R.id.bottomnav);

        //default frame when activity runs intitally

        getSupportFragmentManager().beginTransaction().replace(R.id.bottomnav_frame, new btmnav_home()).commit();



        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                //gets the id of the menu item and replaces the fragments in the frame based on the click on the menu items

                switch (item.getItemId()){
                    case R.id.home: getSupportFragmentManager().beginTransaction().replace(R.id.bottomnav_frame, new btmnav_home()).commit();
                    break;
                    case R.id.profile: getSupportFragmentManager().beginTransaction().replace(R.id.bottomnav_frame, new btmnav_profile()).commit();
                    break;
                    case R.id.settings: getSupportFragmentManager().beginTransaction().replace(R.id.bottomnav_frame, new btmnav_settings()).commit();
                    break;
                }
                return true;
            }
        });

    }
}