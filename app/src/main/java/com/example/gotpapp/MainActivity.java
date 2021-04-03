package com.example.gotpapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tmpl_menu);
    }
    public void clickRS(View view) {
        //Gambar Rumah Sakit di Click
        Intent i = new Intent(this, RS.class);
        startActivity(i);

    }
}