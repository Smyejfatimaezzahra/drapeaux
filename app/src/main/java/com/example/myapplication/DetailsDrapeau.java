package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import beans.Drapeau;
import service.DrapeauService;

public class DetailsDrapeau extends AppCompatActivity {
    private TextView pays;
    private TextView desc;
    private ImageView image;
    private DrapeauService ds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_drapeau);
        Intent intent = getIntent();
        int id = Integer.parseInt(intent.getStringExtra("idd"));
        ds=DrapeauService.getInstance();
        desc=findViewById(R.id.desc);
        pays=findViewById(R.id.pays);
        image=findViewById(R.id.imaged);
        Drapeau d=ds.findById(id);
        desc.setText(d.getDesc());
        pays.setText(d.getPays());
        image.setImageResource(d.getImage());

    }
}