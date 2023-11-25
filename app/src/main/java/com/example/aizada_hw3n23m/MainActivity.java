package com.example.aizada_hw3n23m;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvDorama;
    private ArrayList<String> doramaList = new ArrayList<>();
    private DoramaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData();
        initAdapter();
    }

    private void initAdapter() {
        adapter = new DoramaAdapter(doramaList);
        rvDorama.setAdapter(adapter);
    }

    private void loadData() {
        doramaList.add("Истинная красота");
        doramaList.add("Счастье");
        doramaList.add("Милый дом");
        doramaList.add("Подснежиник");
        doramaList.add("Бесполезная ложь ");
        doramaList.add("Взбодрись");
        doramaList.add("Связь");
        doramaList.add("Во имя семьи");
        doramaList.add("Шаманка Га Ду Шим");

    }

    private void initView() {
        rvDorama = findViewById(R.id.rv_dorama);

    }



}