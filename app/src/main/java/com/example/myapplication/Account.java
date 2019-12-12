package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Account extends AppCompatActivity {
 ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        listView=(ListView)findViewById(R.id.List);
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("android");
        stringList.add("iphone");
        stringList.add("xiaomi");
        stringList.add("nokia");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,stringList);
        listView.setAdapter(arrayAdapter);


        String name = getIntent().getStringExtra("username");
        int photo = getIntent().getIntExtra("img", 0);
        ImageView pic = (ImageView)findViewById(R.id.imageView);
        ImageView pic2 = (ImageView)findViewById(R.id.imageView2);
        pic.setImageResource(photo);
        pic2.setImageResource(photo);
        TextView infoTextView = (TextView)findViewById(R.id.textViewHello);
        infoTextView.setText("Hello, " + name);
        Toast.makeText(getApplicationContext(), "Welcome back!", Toast.LENGTH_LONG).show();
    }
}
