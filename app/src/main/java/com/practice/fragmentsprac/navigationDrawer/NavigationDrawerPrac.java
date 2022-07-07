package com.practice.fragmentsprac.navigationDrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;


import com.google.android.material.navigation.NavigationView;
import com.practice.fragmentsprac.R;
import com.practice.fragmentsprac.Viewpager_FragmentsStateAdaptor.FragOne;
import com.practice.fragmentsprac.Viewpager_FragmentsStateAdaptor.FragThree;
import com.practice.fragmentsprac.Viewpager_FragmentsStateAdaptor.FragTwo;

public class NavigationDrawerPrac extends AppCompatActivity {

    Toolbar toolBar;
    NavigationView navView;
    DrawerLayout drawerLay;

    ActionBarDrawerToggle myToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_navigation_drawer_prac);


        toolBar=(Toolbar) findViewById(R.id.nav_drawer_toolbar);
        navView=(NavigationView) findViewById(R.id.nav_drawer_view);
        drawerLay=(DrawerLayout) findViewById(R.id.nav_drawer_layout);

        //to create a toggle to open the drawerLayout
        myToggle = new ActionBarDrawerToggle(this, drawerLay, toolBar,R.string.open, R.string.close);

        //toggle will be listened by drawerLayout
        drawerLay.addDrawerListener(myToggle);
        myToggle.syncState();

        //add functionality to navigation menu on drawer
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nd_profile:
                        getSupportFragmentManager().beginTransaction().add(R.id.nav_drawer_screen, new FragOne()).commit();
                        drawerLay.closeDrawer(GravityCompat.START); //used to move the drawerLayout to its intial stage
                        break;

                        case R.id.nd_msg:
                        getSupportFragmentManager().beginTransaction().add(R.id.nav_drawer_screen, new FragTwo()).commit();
                            drawerLay.closeDrawer(GravityCompat.START);
                            break;

                    case R.id.nd_setting:
                        getSupportFragmentManager().beginTransaction().add(R.id.nav_drawer_screen, new FragThree()).commit();
                        drawerLay.closeDrawer(GravityCompat.START);
                        break;
                }
                return true;
            }
        });

    }
}