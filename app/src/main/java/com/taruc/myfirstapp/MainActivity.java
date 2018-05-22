package com.taruc.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button buttonLogin;
    private EditText editText2, editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize views
        buttonLogin = findViewById(R.id.buttonLogin);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);

    }


    public void sendMessage(View v){
        //get message from editText
       String message =  editText2.getText().toString() + editText3.getText().toString();


        //use intent to communicate with another activity
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", message);
        startActivity(intent);
    }
}
