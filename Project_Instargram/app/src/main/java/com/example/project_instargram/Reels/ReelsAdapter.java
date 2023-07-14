package com.example.project_instargram.Reels;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_instargram.databinding.ItmeReelsRecvBinding;

import java.util.ArrayList;

public class ReelsAdapter extends RecyclerView.Adapter<ReelsAdapter.ViewHolder > {

    ItmeReelsRecvBinding binding;

    ArrayList<ReelsDTO> list;

    Context context;

    public ReelsAdapter(ArrayList<ReelsDTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItmeReelsRecvBinding.inflate(inflater,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItmeReelsRecvBinding binding;

        public ViewHolder(@NonNull ItmeReelsRecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
