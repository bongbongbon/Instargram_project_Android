package com.example.project_instargram.Profile;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project_instargram.R;
import com.example.project_instargram.common.CommonVar;
import com.example.project_instargram.databinding.FragmentProfileBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class ProfileFragment extends Fragment {

     FragmentProfileBinding binding;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentProfileBinding.inflate(inflater, container, false);
        ProfileAdapter adapter = new ProfileAdapter(this, getFragmentList());

        binding.tvProfileUsername.setText(CommonVar.loginInfo.getUsername());
        binding.tvProfileName.setText(CommonVar.loginInfo.getName());


        binding.viewPager.setAdapter(adapter);
        int[] list = {R.drawable.ic_mesh,R.drawable.ic_video,R.drawable.ic_profile};

        new TabLayoutMediator( binding.tabLayout , binding.viewPager , (tab, position) -> tab.setIcon(list[position]) ).attach();

        binding.tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                binding.viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        return binding.getRoot();


    }

    ArrayList<Fragment> getFragmentList(){
        ArrayList<Fragment> list = new ArrayList<>();
        list.add(new Fragment1());
        list.add(new Fragment2());
        list.add(new Fragment3());
        return list;
    }

}