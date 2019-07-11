package com.example.pertemuan8a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Input1;
    EditText Input2;
    TextView Tampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Input1 = findViewById(R.id.bil1);
        Input2 = findViewById(R.id.bil2);
        Tampil = findViewById(R.id.hasil);

    }
    public void tambah (View v){
        if (Input1.getText().length()>0 && Input2.getText().length()>0){
            int angka1 = Integer.parseInt(Input1.getText().toString());
            int angka2 = Integer.parseInt(Input2.getText().toString());
            int hasil = angka1 + angka2;
            Tampil.setText(Integer.toString(hasil));
        } else {
            Toast toast = Toast.makeText(MainActivity.this,"Mohon Masukkan", Toast.LENGTH_LONG );
            toast.show();
        }

    }
    public  void  kurang (View v){
        if (Input1.getText().length()>0 && Input2.getText().length()>0){
            int angka1 = Integer.parseInt(Input1.getText().toString());
            int angka2 = Integer.parseInt(Input2.getText().toString());
            int hasil = angka1 - angka2;
            Tampil.setText(Integer.toString(hasil));
        } else {
            Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan", Toast.LENGTH_LONG);
            toast.show();
        }
    }
    public  void kali (View v){
        if (Input1.getText().length()>0 && Input2.getText().length()>0){
            int angka1 = Integer.parseInt(Input1.getText().toString());
            int angka2 = Integer.parseInt(Input2.getText().toString());
            int hasil = angka1 * angka2;
            Tampil.setText(Integer.toString(hasil));
        } else {
            Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan", Toast.LENGTH_LONG);
            toast.show();
        }
    }
    public  void bagi (View v){
        if (Input1.getText().length()>0 && Input2.getText().length()>0){
            int angka1 = Integer.parseInt(Input1.getText().toString());
            int angka2 = Integer.parseInt(Input2.getText().toString());
            int hasil = angka1 / angka2;
            Tampil.setText(Integer.toString(hasil));
        } else {
            Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan", Toast.LENGTH_LONG);
            toast.show();
        }
    }
    public void bersihkan (View v){
        Input1.setText("");
        Input2.setText("");
        Tampil.setText("");
    }
}
