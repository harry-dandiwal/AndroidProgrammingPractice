package com.practice.fragmentsprac.Viewpager_FragmentsStateAdaptor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.practice.fragmentsprac.R;

public class ViewPagerPrac extends AppCompatActivity {

    ViewPager2 vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpagerprac);

        vp=(ViewPager2)findViewById(R.id.viewpager_one);

        MyAdaptor myAdaptor = new MyAdaptor(getSupportFragmentManager(), getLifecycle());
        vp.setAdapter(myAdaptor);
    }
}