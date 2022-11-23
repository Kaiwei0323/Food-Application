package com.example.foodapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class searchResult extends AppCompatActivity {
    private Button home;
    private Button bu1;
    private Button bu2;
    private Button bu3;
    private Button bu4;
    private Button bu5;
    private Button bu6;
    private Button bu7;
    private Button bu8;
    private Button bu9;
    private Button bu10;
;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
        Intent intent = getIntent();
        String food_name = intent.getStringExtra(MainActivity.FOOD_NAME);

        home = (Button) findViewById(R.id.button2);
        bu1 = (Button) findViewById(R.id.button5);
        bu2 = (Button) findViewById(R.id.button6);
        bu3 = (Button) findViewById(R.id.button7);
        bu4 = (Button) findViewById(R.id.button8);
        bu5 = (Button) findViewById(R.id.button9);
        bu6 = (Button) findViewById(R.id.button10);
        bu7 = (Button) findViewById(R.id.button11);
        bu8 = (Button) findViewById(R.id.button12);
        bu9 = (Button) findViewById(R.id.button13);
        bu10 = (Button) findViewById(R.id.button14);
        bu1.setText(food_name);
        bu2.setText(food_name);
        bu3.setText(food_name);
        bu4.setText(food_name);
        bu5.setText(food_name);
        bu6.setText(food_name);
        bu7.setText(food_name);
        bu8.setText(food_name);
        bu9.setText(food_name);
        bu10.setText(food_name);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });


    }
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}