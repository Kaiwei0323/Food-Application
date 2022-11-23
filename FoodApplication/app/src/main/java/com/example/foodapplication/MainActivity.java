package com.example.foodapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String FOOD_NAME = "com.example.foodapplication.FOOD_NAME";

    EditText food_input;

    private Button search;
    private Button logout;
    private Button saved;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        food_input = (EditText) findViewById(R.id.editTextTextPersonName);

        search = (Button) findViewById(R.id.button);
        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                opensearchResult();
            }
        });
    }
    public void opensearchResult(){
        Intent intent = new Intent(this, searchResult.class);
        String food_name = food_input.getText().toString();
        intent.putExtra(FOOD_NAME, food_name);
        startActivity(intent);
    }
}