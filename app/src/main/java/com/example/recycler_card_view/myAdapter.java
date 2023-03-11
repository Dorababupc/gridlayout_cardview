package com.example.recycler_card_view;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<holder> {
    ArrayList<Model> list;
    Context context;
    public myAdapter(ArrayList<Model> list, Context context){

        this.list=list;
        this.context=context;
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
        final Model temp=list.get(position);
          holder.txt1.setText(list.get(position).getTop());
          holder.txt2.setText(list.get(position).getBelow());
          holder.img.setImageResource(list.get(position).getImage());
          holder.img.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  Intent intent=new Intent(context,secActivity.class);
                  intent.putExtra("upperText",temp.getTop());
                  intent.putExtra("lowerText",temp.getBelow());
                  intent.putExtra("image",temp.getImage());
                  intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                  context.startActivity(intent);
              }
          });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
