package com.example.aizada_hw3n23m;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DoramaAdapter extends RecyclerView.Adapter<DoramaViewHolder>{
    private ArrayList<String> doramaList;

    public DoramaAdapter(ArrayList<String> doramaList) {
        this.doramaList = doramaList;
    }

    @NonNull
    @Override
    public DoramaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DoramaViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.itam_dorama, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DoramaViewHolder holder, int position) {

        holder.bind(doramaList.get(position));

    }

    @Override
    public int getItemCount() {
        return doramaList.size();
    }
}


