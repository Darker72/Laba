package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText editTextLogin, editTextPass;
    private Button proceedMainLock;
    private int img;
    private ArrayList<User> userArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createUsers();
        //    addListenerOnButton();
    }

    private ArrayList<User> createUsers() {
        userArrayList.add(new User("Bill", "123", img = R.mipmap.bill_user_round));
        userArrayList.add(new User("Steve", "456", img = R.mipmap.ic_launcher_round));
        userArrayList.add(new User("Azimov", "789", img = R.mipmap.ic_launcher_round));
        return userArrayList;
    }

    public void onClick(View v) {
        editTextLogin = (EditText) findViewById(R.id.nameMainLock);
        editTextPass = (EditText) findViewById(R.id.passwordMainLock);
        proceedMainLock = (Button) findViewById(R.id.proceedMainLock);
        boolean flag = false;
        for (int i = 0; i < userArrayList.size(); i++) {
            if (editTextLogin.getText().toString().equals(userArrayList.get(i).getLogin()) && editTextPass.getText().toString().equals(userArrayList.get(i).getPassword())) {
                flag = true;
                Intent intUser = new Intent(".Account");
                intUser.putExtra("username", editTextLogin.getText().toString());
                intUser.putExtra("img", userArrayList.get(i).getPhoto());
                startActivity(intUser);
            }

        }
        if (!flag)
            Toast.makeText(getApplicationContext(), "Wrong Name or Password!", Toast.LENGTH_LONG).show();
    }
    /*public void addListenerOnButton() {
        editTextLogin = (EditText)findViewById(R.id.nameMainLock);
        editTextPass = (EditText)findViewById(R.id.passwordMainLock);
        proceedMainLock = (Button)findViewById(R.id.proceedMainLock);
        proceedMainLock.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean flag = false;
                for (int i = 0; i < userArrayList.size(); i++) {
                    if(editTextLogin.getText().toString().equals(userArrayList.get(i).getLogin()) && editTextPass.getText().toString().equals(userArrayList.get(i).getPassword()))
                    {
                        flag = true;
                        Intent intUser = new Intent(".Account");
                        intUser.putExtra("username", editTextLogin.getText().toString());
                        intUser.putExtra("img", userArrayList.get(i).getPhoto());
                        startActivity(intUser);
                    }

    } if(!flag) Toast.makeText(getApplicationContext(), "Wrong Name or Password!", Toast.LENGTH_LONG).show();
            }
          }
        );
    }*/
}
