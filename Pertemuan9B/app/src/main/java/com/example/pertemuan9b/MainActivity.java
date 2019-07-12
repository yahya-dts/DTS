package com.example.pertemuan9b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Mendeklarasikan list var dan menginisialisasi array tipe data string
    private ListView lvItem;
    private String[] mancanegara = new String[]{
            "Indonesia","Malaysia","Singapore",
            "Italia","Inggris","Belanda",
            "Argentina","Jepang","Mesir"
            ,"Uganda","Jerman","Korea Selatan",
            "Banjarmasin", "Martapura","Rantawan",
            "Amuntai"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("ListView Sederhana"); // tampil judul

        // membinding atau memformat data
        lvItem = findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1
                , mancanegara);
        //menset data ke dalam list view
        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Memilih :" + mancanegara[position],
                Toast.LENGTH_LONG)
                .show();
            }
        });
    }
}
