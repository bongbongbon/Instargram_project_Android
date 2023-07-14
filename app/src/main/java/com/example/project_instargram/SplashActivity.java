package com.example.project_instargram;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.project_instargram.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {
    ActionBar actionBar;
    ActivitySplashBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        new Handler().postDelayed(() -> {
            Intent intent = new Intent(this,LoginActivity.class);
            startActivity(intent);
            finish();
        } , 1000 * 3);


    }
}