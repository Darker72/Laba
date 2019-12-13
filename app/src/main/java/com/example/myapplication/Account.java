package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Account extends AppCompatActivity {
    private List<Tovar> states = new ArrayList();
    ListView countriesList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        setInitialData();
        // получаем элемент ListView
        countriesList = (ListView) findViewById(R.id.countriesList);
        // создаем адаптер
        TovarAdapter tovarAdapter = new TovarAdapter(this, R.layout.listitem_row, states);
        // устанавливаем адаптер
        countriesList.setAdapter(tovarAdapter);

        String name = getIntent().getStringExtra("username");
        int photo = getIntent().getIntExtra("img", 0);
        ImageView pic = (ImageView)findViewById(R.id.imageView);
        pic.setImageResource(photo);
        TextView infoTextView = (TextView)findViewById(R.id.textViewHello);
        infoTextView.setText("Hello, " + name + ", there is your items");
        Toast.makeText(getApplicationContext(), "Welcome back!", Toast.LENGTH_LONG).show();
        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                // получаем выбранный пункт
                Tovar selectedState = (Tovar) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Был выбран пункт " + selectedState.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        };
        countriesList.setOnItemClickListener(itemListener);
    }

    private void setInitialData() {

        states.add(new Tovar("Процессор", "Описание процессора ", R.mipmap.processor));
        states.add(new Tovar("Блок питания", "Описание блока питания", R.mipmap.blockpit));
        states.add(new Tovar("Колонки", "Описание колонок", R.mipmap.kolon));
        states.add(new Tovar("Корпус", "Описание корпуса", R.mipmap.korpus));
        states.add(new Tovar("Клавиатура", "Описание клавиатуры", R.mipmap.keybord));
        states.add(new Tovar("Монитор", "Описание монитора", R.mipmap.monitor));
        states.add(new Tovar("Оперативная память", "Описание оперативной памяти", R.mipmap.operativ));
        states.add(new Tovar("Видеокарта", "Описание видеокарты", R.mipmap.videokarta));

    }
}
