package com.example.project_instargram.Search;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project_instargram.R;
import com.example.project_instargram.databinding.FragmentSearchBinding;

import java.util.ArrayList;


public class SearchFragment extends Fragment {

    FragmentSearchBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSearchBinding.inflate(inflater, container, false);
        binding.recvSearch1.setAdapter(new SearchAdapter(getList(), getContext()));
        binding.recvSearch1.setLayoutManager(new LinearLayoutManager(getContext()));

        return binding.getRoot();
    }

    public ArrayList<SearchDTO> getList(){
        ArrayList<SearchDTO> list = new ArrayList<>();
            list.add(
                    new SearchDTO(R.drawable.img_imgres1,
                            R.drawable.img_imgres2,
                            R.drawable.img_imgres3,
                            R.drawable.img_imgres4,
                            R.drawable.img_imgres5,
                            R.drawable.img_imgres6,
                            R.drawable.img_imgres7,
                            R.drawable.img_imgres8,
                            R.drawable.img_imgres9,
                            R.drawable.img_imgres10));

                    list.add(
                        new SearchDTO(R.drawable.img_imgres1,
                                R.drawable.img_imgres2,
                                R.drawable.img_imgres3,
                                R.drawable.img_imgres4,
                                R.drawable.img_imgres5,
                                R.drawable.img_imgres6,
                                R.drawable.img_imgres7,
                                R.drawable.img_imgres8,
                                R.drawable.img_imgres9,
                                R.drawable.img_imgres10));

    return list;
    }


}