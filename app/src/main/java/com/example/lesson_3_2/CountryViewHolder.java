package com.example.lesson_3_2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CountryViewHolder extends RecyclerView.ViewHolder {


    private TextView tv_country;


    public CountryViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_country = itemView.findViewById(R.id.tv_ct);
    }

    public void bind(String name_country){
        tv_country.setText(name_country);
    }
}
