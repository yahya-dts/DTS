package com.example.pertemuan10a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pindahinternal (View v){
        Intent i = new Intent(MainActivity. this,Internal.class);
        startActivity(i);
    }
    public void pindaheksternal (View v){
        Intent e = new Intent(MainActivity.this, Eksternal.class);
        startActivity(e);
    }
}