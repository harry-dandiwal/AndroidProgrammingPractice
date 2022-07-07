package com.practice.fragmentsprac.Viewpager_FragmentsStateAdaptor;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyAdaptor extends FragmentStateAdapter {
    public MyAdaptor(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }


   //we can provide the cases or conditions here based on the position this method brings in
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 0: FragOne fragOne = new FragOne();
            return fragOne;
            case 1: FragTwo fragTwo = new FragTwo();
            return fragTwo;
            case 2: FragThree fragThree = new FragThree();
            return fragThree;
            default: return null;
        }
    }

    //number of fragments to slide
    @Override
    public int getItemCount() {
        return 3;
    }
}
