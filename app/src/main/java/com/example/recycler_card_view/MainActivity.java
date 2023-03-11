package com.example.recycler_card_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Model> list=new ArrayList<>();
        list=enque(list);
        view=(RecyclerView) findViewById(R.id.recview);
        view.setLayoutManager(new GridLayoutManager(this,2));
        view.setAdapter(new myAdapter(list,getApplicationContext()));
    }
    public ArrayList<Model> enque(ArrayList<Model> list){
        Model temp=new Model();
        temp.setTop("this is 3G");
        temp.setBelow("enjoy the uninterrupted music");
        temp.setImage(R.drawable.ic_baseline_child_friendly_24);
        list.add(temp);
        temp.setTop("this is 3G");
        temp.setBelow("enjoy the uninterrupted music");
        temp.setImage(R.drawable.ic_baseline_child_friendly_24);
        list.add(temp);
        temp.setTop("this is 3G");
        temp.setBelow("enjoy the uninterrupted music");
        temp.setImage(R.drawable.ic_baseline_child_friendly_24);
        list.add(temp);
        temp.setTop("this is 3G");
        temp.setBelow("enjoy the uninterrupted music");
        temp.setImage(R.drawable.ic_baseline_child_friendly_24);
        list.add(temp);
        temp.setTop("this is 3G");
        temp.setBelow("enjoy the uninterrupted music");
        temp.setImage(R.drawable.ic_baseline_child_friendly_24);
        list.add(temp);
        temp.setTop("this is 3G");
        temp.setBelow("enjoy the uninterrupted music");
        temp.setImage(R.drawable.ic_baseline_child_friendly_24);
        list.add(temp);
        temp.setTop("this is 3G");
        temp.setBelow("enjoy the uninterrupted music");
        temp.setImage(R.drawable.ic_baseline_child_friendly_24);
        list.add(temp);
        temp.setTop("this is 3G");
        temp.setBelow("enjoy the uninterrupted music");
        temp.setImage(R.drawable.ic_baseline_child_friendly_24);
        list.add(temp);temp.setTop("this is 3G");
        temp.setBelow("enjoy the uninterrupted music");
        temp.setImage(R.drawable.ic_baseline_child_friendly_24);
        list.add(temp);temp.setTop("this is 3G");
        temp.setBelow("enjoy the uninterrupted music");
        temp.setImage(R.drawable.ic_baseline_child_friendly_24);
        list.add(temp);
        temp.setTop("this is 3G");
        temp.setBelow("enjoy the uninterrupted music");
        temp.setImage(R.drawable.ic_baseline_child_friendly_24);
        list.add(temp);


        return list;
    }
}