package com.example.project_instargram.Home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project_instargram.R;
import com.example.project_instargram.common.CommonConn;
import com.example.project_instargram.common.CommonVar;
import com.example.project_instargram.databinding.FragmentHomeBinding;

import java.util.ArrayList;


public class HomeFragment extends Fragment {
    FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater , container , false);
        binding.recvHome1.setAdapter(new HomeAdapter(getList(), getContext()));
        binding.recvHome1.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        binding.recvHome2.setAdapter(new HomeAdapter1(getList(), getContext()));
        binding.recvHome2.setLayoutManager(new LinearLayoutManager(getContext()));

        return binding.getRoot();
    }


    public void select(){


    }

    public ArrayList<HomeDTO> getList(){
        ArrayList<HomeDTO> list = new ArrayList<>();
        list.add(new HomeDTO(R.drawable.img_imgres1, CommonVar.loginInfo.getId()));
        list.add(new HomeDTO(R.drawable.img_imgres2, "happyness_ha"));
        list.add(new HomeDTO(R.drawable.img_imgres3, "life_10"));
        list.add(new HomeDTO(R.drawable.img_imgres4, "good_mornig107"));
        list.add(new HomeDTO(R.drawable.img_imgres5, "merong1"));
        list.add(new HomeDTO(R.drawable.img_imgres6, "eng_eng"));
        return list;
    }
}