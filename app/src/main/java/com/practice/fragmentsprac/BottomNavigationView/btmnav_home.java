package com.practice.fragmentsprac.BottomNavigationView;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.practice.fragmentsprac.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link btmnav_home#newInstance} factory method to
 * create an instance of this fragment.
 */
public class btmnav_home extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_btmnav_home, container, false);
    }
}