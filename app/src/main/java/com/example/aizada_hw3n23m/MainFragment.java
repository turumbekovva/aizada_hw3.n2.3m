package com.example.aizada_hw3n23m;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends Fragment {

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savadInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_main, container, false);
        }
    }
