package com.example.pertemuan9a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView nimm,namaa,kampuss;
    EditText teks1,teks2,teks3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nimm = findViewById(R.id.nim);
        namaa = findViewById(R.id.nama);
        kampuss = findViewById(R.id.kampus);
        teks1 = findViewById(R.id.txt1);
        teks2 = findViewById(R.id.txt2);
        teks3 = findViewById(R.id.txt3);
    }
    public void Tampilkan (View v){
        nimm.setText("NIM : " + teks1.getText());
        namaa.setText("Nama : " + teks2.getText());
        kampuss.setText("Kampus : " + teks3.getText());
    }
}
