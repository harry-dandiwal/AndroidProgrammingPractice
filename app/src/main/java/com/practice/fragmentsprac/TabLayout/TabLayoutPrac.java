package com.practice.fragmentsprac.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.practice.fragmentsprac.Viewpager_FragmentsStateAdaptor.*;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.google.android.material.tabs.TabLayout;
import com.practice.fragmentsprac.R;

public class TabLayoutPrac extends AppCompatActivity {

    TabLayout tabLayout;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablayoutprac);

        tabLayout=(TabLayout) findViewById(R.id.tabLayout);
        frameLayout=(FrameLayout) findViewById(R.id.frame_tabLayout);

        //adding options to tablayout dynamically
        TabLayout.Tab tab1 = tabLayout.newTab();
        tab1.setText("Home");
        tab1.setIcon(R.drawable.tablayout_home);
        tabLayout.addTab(tab1);

        TabLayout.Tab tab2 = tabLayout.newTab();
        tab2.setText("Chat");
        tab2.setIcon(R.drawable.tablayout_chat);
        tabLayout.addTab(tab2);

        TabLayout.Tab tab3 = tabLayout.newTab();
        tab3.setText("Call");
        tab3.setIcon(R.drawable.tablayout_call);
        tabLayout.addTab(tab3);

        //the default fragment that shows up when the activity runs
        FragOne f1= new FragOne();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.add(R.id.frame_tabLayout, f1).commit();

        //adding event listners to the tabs for actions when selected
        //in this case, on select, they will open new fragments

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                Fragment fragment=null;

                switch (tab.getPosition()){
                    case 0: fragment = new FragOne();
                    break;

                    case 1: fragment = new FragTwo();
                        break;

                    case 2: fragment = new FragThree();
                        break;

                }
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.frame_tabLayout, fragment).commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}