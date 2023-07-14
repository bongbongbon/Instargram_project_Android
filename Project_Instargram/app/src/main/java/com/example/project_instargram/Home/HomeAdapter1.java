package com.example.project_instargram.Home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_instargram.databinding.ItemHomeRecv2Binding;


import java.util.ArrayList;

public class HomeAdapter1 extends RecyclerView.Adapter<HomeAdapter1.ViewHolder> {

    ItemHomeRecv2Binding binding;

    ArrayList<HomeDTO> list;

    Context context;

    public HomeAdapter1(ArrayList<HomeDTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemHomeRecv2Binding.inflate(inflater, parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
    }

    @Override
    public int getItemCount() {
        return 10;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ItemHomeRecv2Binding binding;
        public ViewHolder(@NonNull ItemHomeRecv2Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
