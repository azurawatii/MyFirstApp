package com.taruc.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_second);

        //grab the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra("key");

        //create textView on the fly
        TextView textView = new TextView(this);
        textView.setText(message);
        setContentView(textView);
    }
}
