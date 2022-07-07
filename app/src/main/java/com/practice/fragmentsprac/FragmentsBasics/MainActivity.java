package com.practice.fragmentsprac.FragmentsBasics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.practice.fragmentsprac.FragmentsBasics.Login;
import com.practice.fragmentsprac.R;

public class MainActivity extends AppCompatActivity {

    FrameLayout fl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fl=(FrameLayout)findViewById(R.id.main_frame);

        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.add(R.id.main_frame, new Login());
        ft.commit();
    }
}