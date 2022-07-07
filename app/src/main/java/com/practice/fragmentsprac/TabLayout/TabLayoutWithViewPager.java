package com.practice.fragmentsprac.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.practice.fragmentsprac.R;

public class TabLayoutWithViewPager extends AppCompatActivity {

    ViewPager2 vp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout_with_view_pager);

        vp2=(ViewPager2) findViewById(R.id.viewpager_two);

        ChatAppAdaptorProto chatAdaptor = new ChatAppAdaptorProto(getSupportFragmentManager(), getLifecycle());
        vp2.setAdapter(chatAdaptor);
    }
}