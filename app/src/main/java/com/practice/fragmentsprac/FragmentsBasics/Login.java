package com.practice.fragmentsprac.FragmentsBasics;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.practice.fragmentsprac.R;


public class Login extends Fragment {

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_login, container, false);

        TextView login_tv=(TextView)view.findViewById(R.id.login_id);

        login_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getParentFragmentManager().beginTransaction().replace(R.id.main_frame, new Register()).commit();
            }
        });



        return view;
    }
}