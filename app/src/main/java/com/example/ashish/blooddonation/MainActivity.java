package com.example.ashish.blooddonation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.start;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void login(View v)
    {
       Intent intent=new Intent(this,Login.class);
        startActivity(intent);

    }
    public  void signup(View v)
    {
        Intent intent=new Intent(this,SignUp.class);
        startActivity(intent);

    }
}
