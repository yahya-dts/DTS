package com.example.pertemuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Menu33 extends AppCompatActivity {
    //deklarasi variabel global disini
    EditText Text_Nama;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu33);

        //panggil object berdasarkan ID
        Text_Nama = findViewById(R.id.Txt_Nama);
        Hasil = findViewById(R.id.Lbl_Hasil);
    }
    public void Tampil_Hasil (View v){
        Hasil.setText("Nama Anda Adalah : "+Text_Nama.getText());
    }
}
