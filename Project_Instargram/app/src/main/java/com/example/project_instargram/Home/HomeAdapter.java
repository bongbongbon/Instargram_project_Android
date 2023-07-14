package com.example.project_instargram.Home;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_instargram.databinding.ItemHomeRecvBinding;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    ItemHomeRecvBinding binding;

    ArrayList<HomeDTO> list;

    Context context;

    public HomeAdapter(ArrayList<HomeDTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemHomeRecvBinding.inflate(inflater, parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.imgvProfile.setImageResource(list.get(i).getImgRes());
        h.binding.tvId.setText(list.get(i).getId());

        h.binding.imgvProfile.setOnClickListener(v -> {
            Intent intent = new Intent(context, HomeActivity.class);
            intent.putExtra("dto" ,list.get(i));
            context.startActivity(intent);

        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ItemHomeRecvBinding binding;
        public ViewHolder(@NonNull ItemHomeRecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
