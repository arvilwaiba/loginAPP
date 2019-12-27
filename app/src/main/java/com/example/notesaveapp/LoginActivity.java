package com.example.notesaveapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class LoginActivity extends AppCompatActivity {

    TextView welcome,userName;
    RecyclerView recyclerView;
    ArrayAdapter arrayAdapter;
    RecyclerView myRecyclerview;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        welcome=findViewById(R.id.welcomeTextView);
        recyclerView=findViewById(R.id.myRecyclerlerView);
        myRecyclerview=findViewById(R.id.myRecyclerlerView);

        String [] names={"Arvil","waiba","Ram","Shyam","Arvil","waiba","Ram","Shyam","Arvil","waiba","Ram","Shyam","Arvil","waiba","Ram","Shyam"};
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new Adapter(names);
        myRecyclerview.setAdapter(adapter);
        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        welcome.setText("Welcome "+ name.toUpperCase());





    }

}
