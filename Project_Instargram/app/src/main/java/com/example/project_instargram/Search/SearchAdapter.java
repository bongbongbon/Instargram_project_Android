package com.example.project_instargram.Search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_instargram.databinding.ItemSearchRecvBinding;

import java.util.ArrayList;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.ViewHolder> {

    ItemSearchRecvBinding binding;

    ArrayList<SearchDTO> list;

    Context context;


    public SearchAdapter(ArrayList<SearchDTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemSearchRecvBinding.inflate(inflater, parent , false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.imgvImgRes1.setImageResource(list.get(i).getImgRes1());
        h.binding.imgvImgRes2.setImageResource(list.get(i).getImgRes2());
        h.binding.imgvImgRes3.setImageResource(list.get(i).getImgRes3());
        h.binding.imgvImgRes4.setImageResource(list.get(i).getImgRes4());
        h.binding.imgvImgRes5.setImageResource(list.get(i).getImgRes5());
        h.binding.imgvImgRes6.setImageResource(list.get(i).getImgRes6());
        h.binding.imgvImgRes7.setImageResource(list.get(i).getImgRes7());
        h.binding.imgvImgRes8.setImageResource(list.get(i).getImgRes8());
        h.binding.imgvImgRes9.setImageResource(list.get(i).getImgRes9());
        h.binding.imgvImgRes10.setImageResource(list.get(i).getImgRes10());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemSearchRecvBinding binding;

        public ViewHolder(@NonNull ItemSearchRecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}
