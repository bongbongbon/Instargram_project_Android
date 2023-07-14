package com.example.project_instargram;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;


import com.example.project_instargram.Home.HomeFragment;
import com.example.project_instargram.Profile.ProfileFragment;
import com.example.project_instargram.Reels.ReelsFragment;
import com.example.project_instargram.Search.SearchFragment;

public class MainActivity extends AppCompatActivity {

    com.example.project_instargram.databinding.ActivityMainBinding binding;

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = com.example.project_instargram.databinding.ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        actionBar = getSupportActionBar();
        actionBar.hide();

        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.container , new HomeFragment()).commit();

        binding.bottomNavigation.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.page_1){
                manager.beginTransaction().replace(R.id.container , new HomeFragment()).commit();
            }else if (item.getItemId() == R.id.page_2) {
                manager.beginTransaction().replace(R.id.container , new SearchFragment()).commit();
            }else if (item.getItemId() == R.id.page_3) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
                startActivity(intent);
            } else if (item.getItemId() == R.id.page_4) {
                manager.beginTransaction().replace(R.id.container, new ReelsFragment()).commit();
            } else if (item.getItemId() == R.id.page_5) {
                manager.beginTransaction().replace(R.id.container, new ProfileFragment()).commit();

            }
            return true;
        });

    }
}