package com.example.dennis.supermarketapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by dennis on 5/31/16.
 */
public class InitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.init);
        addButtonOnClickListener();
        addButtonOnClickListener1();
    }

    public void addButtonOnClickListener(){ //links to diamond page
        Button button;
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InitActivity.this, SignupActitivity.class);
                startActivity(intent);
            }
        });
    }
    public void addButtonOnClickListener1(){ //links to Gold page
        Button button;

        button = (Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InitActivity.this, Login.class);
                startActivity(intent);
            }
        });
    }

    }
