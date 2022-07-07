package com.practice.fragmentsprac.TabLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ChatAppAdaptorProto extends FragmentStateAdapter {
    public ChatAppAdaptorProto(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        //cases to return frags based on the position
        //this is applicable in the case of ViewPager2

        switch (position){
            case 0: FragCall fcall= new FragCall();
            return fcall;
            case 1: FragChat fchat= new FragChat();
            return fchat;
            case 2: FragStatus fStatus= new FragStatus();
            return fStatus;
            default: return null;
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
