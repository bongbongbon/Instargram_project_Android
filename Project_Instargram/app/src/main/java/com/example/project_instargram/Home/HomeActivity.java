package com.example.project_instargram.Home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.project_instargram.R;
import com.example.project_instargram.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    ActivityHomeBinding binding;

    HomeDTO dto ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityHomeBinding.inflate(getLayoutInflater());

        dto = (HomeDTO) getIntent().getSerializableExtra("dto");
        getSupportActionBar().hide();

        binding.imgvProfile.setImageResource(dto.getImgRes());
        binding.imgvStoryClick.setImageResource(dto.getImgRes());
        binding.tvId.setText(dto.getId());


        binding.imgvClose.setOnClickListener(v -> {
            finish();
        });
        setContentView(binding.getRoot());
    }
}