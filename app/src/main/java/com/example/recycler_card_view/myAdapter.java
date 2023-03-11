package com.example.recycler_card_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<holder> {
    ArrayList<Model> list;

    public myAdapter(ArrayList<Model> list){
        this.list=list;
    }
    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.singlecardview,parent,false);
        return (new holder(view));
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
          holder.txt1.setText(list.get(position).getTop());
          holder.txt2.setText(list.get(position).getBelow());
          holder.img.setImageResource(list.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
