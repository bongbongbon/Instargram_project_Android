package com.example.project_instargram.Profile;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class ProfileAdapter extends FragmentStateAdapter {

    ArrayList<Fragment> list;

    public ProfileAdapter(@NonNull Fragment fragment, ArrayList<Fragment> list) {
        super(fragment);
        this.list = list;
    }

    @NonNull
    @Override
    public Fragment createFragment(int i) {
        return list.get(i);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
