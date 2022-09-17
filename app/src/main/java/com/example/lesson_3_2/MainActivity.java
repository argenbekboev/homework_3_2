package com.example.lesson_3_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_ct);

        arrayList.add("Kyrgyzstan");
        arrayList.add("Russia");
        arrayList.add("Kazakhstan");
        arrayList.add("United State America");
        arrayList.add("China");
        arrayList.add("Thailand");
        arrayList.add("Germany");
        arrayList.add("Argentina");
        arrayList.add("Belarus");
        arrayList.add("Luxembourg");
        arrayList.add("United Kingdom");
        arrayList.add("Switzerland");
        arrayList.add("Mongolia");
        arrayList.add("Greece");
        arrayList.add("France");
        arrayList.add("Egypt");
        arrayList.add("Frog");
        arrayList.add("Chile");
        arrayList.add("Colombia");
        arrayList.add("Canada");


        CountryAdapter countryAdapter = new CountryAdapter(arrayList);

        recyclerView.setAdapter(countryAdapter);

    }
}