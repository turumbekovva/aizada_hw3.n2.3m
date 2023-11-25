package com.example.aizada_hw3n23m;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DoramaViewHolder extends RecyclerView.ViewHolder {
        private TextView tvName;
        public DoramaViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
        }

        public void bind(String name){
            tvName.setText(name);
        }
    }


