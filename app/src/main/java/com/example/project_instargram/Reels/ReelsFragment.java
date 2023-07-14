package com.example.project_instargram.Reels;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project_instargram.R;
import com.example.project_instargram.databinding.FragmentReelsBinding;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class ReelsFragment extends Fragment {

    FragmentReelsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentReelsBinding.inflate(inflater, container ,false);
        binding.reelsRecv.setAdapter(new ReelsAdapter(getList(), getContext()));
        binding.reelsRecv.setLayoutManager(new LinearLayoutManager(getContext()));

        return binding.getRoot();
    }

    public ArrayList<ReelsDTO> getList(){
        ArrayList<ReelsDTO> list = new ArrayList<>();
        list.add(new ReelsDTO());

        return list;
    }
}