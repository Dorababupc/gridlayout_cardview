package com.example.recycler_card_view;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class holder extends RecyclerView.ViewHolder {
    ImageView img;
    TextView txt1,txt2;
    public holder(@NonNull View itemView) {
        super(itemView);
        img=itemView.findViewById(R.id.image);
        txt1=itemView.findViewById(R.id.txt1);
        txt2=itemView.findViewById(R.id.txt2);
    }
}
