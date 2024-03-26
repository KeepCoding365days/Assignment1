package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void page1(View v){
        Intent i=new Intent(getApplicationContext(), Page1.class);
        startActivity(i);

    }
    public void Finish(View v){
        finishAffinity();
    }
}