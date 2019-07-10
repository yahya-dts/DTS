package com.example.pertemuan7b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // deklarsi global
    EditText Input;
    TextView Out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // panggil object dengan id
        Input = findViewById(R.id.Txt_Input);
        Out = findViewById(R.id.Lbl_Out);

    }
    public void Show (View v){
        Out.setText("Nama anda : " + Input.getText());

    }
}
