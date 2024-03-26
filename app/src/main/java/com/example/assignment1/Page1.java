package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Page1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
    }
    public void LogIn(View v){
        Intent i= new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(i);
    }
   public void page2(View v){
        Intent i=new Intent(getApplicationContext(), Page2.class);
        startActivity(i);
   }
}