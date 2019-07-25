package com.example.praktek;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.txtuser);
        password = findViewById(R.id.txtpass);
    }
    public void login (View v){
        String userkey = username.getText().toString();
        String passkey = password.getText().toString();

        if (userkey.equals("admin") && passkey.equals("admin")){
            // Jika Berhasil Login
            Toast.makeText(getApplicationContext(), "Login Berhasil",
                    Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            finish();
        }else {
            // Jika Gagal
            AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
            builder.setMessage("Username atau Password Anda Salah !!!")
                    .setNegativeButton("Ulang",null).create().show();
        }

    }
    public void keluar (View v){
        moveTaskToBack(true);
        finish();
        System.exit(0);
    }

}
