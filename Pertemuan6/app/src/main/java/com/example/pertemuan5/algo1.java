package com.example.pertemuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class algo1 extends AppCompatActivity {
    //deklarasi variabel global
    EditText Text_Angka;
    TextView Akar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algo1);
        // panggil object berdasarkan id

        Text_Angka = findViewById(R.id.Txt_Angka);
        Akar = findViewById(R.id.Lbl_Akar);
    }
    public void Tampil_Akar (View v){
        int angka,x,y;
        angka=Integer.parseInt(Text_Angka.getText().toString());
        x=0;
        y=x*x;
        while (y !=angka){
            x=x+1;
            y=x*x;

        }
        Akar.setText("Hasil Akar Dari : " +angka+ " Adalah " + x);

    }
}
