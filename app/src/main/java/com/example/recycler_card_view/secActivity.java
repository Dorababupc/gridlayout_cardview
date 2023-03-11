package com.example.recycler_card_view;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class secActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        ImageView img;
        TextView txt1,txt2;
        img=findViewById(R.id.imageIn);
        txt1=findViewById(R.id.text1In);
        txt2=findViewById(R.id.text2In);
        img.setImageResource(getIntent().getIntExtra("image",0));
        txt1.setText(getIntent().getStringExtra("upperText"));
        txt2.setText(getIntent().getStringExtra("lowerText"));


    }
}
