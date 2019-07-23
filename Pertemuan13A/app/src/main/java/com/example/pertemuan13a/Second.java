package com.example.pertemuan13a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    EditText nim,nama;
    TextView hasil1,hasil2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        nim = findViewById(R.id.txt1);
        nama = findViewById(R.id.txt2);
        hasil1 = findViewById(R.id.lblhasil);
        hasil2 = findViewById(R.id.lblhasil1);
    }
    public void print (View v ){
        hasil1.setText("NIM Anda : " + nim.getText());

        hasil2.setText("Nama Anda : " + nama.getText());
    }
}
