
package com.example.pertemuan15;

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

        username = findViewById(R.id.edit1);
        password = findViewById(R.id.edit2);
    }
    public void login (View v){
        // String ambil
        String userkey = username.getText().toString();
        String passkey = password.getText().toString();
        //jika login berhasil
        if (userkey.equals("admin") && passkey.equals("admin")){
        Intent berhasil = new Intent(Login.this, MenuUtama.class);
        startActivity(berhasil);
        Toast.makeText(getApplicationContext(), " LOGIN SUKSES",
            Toast.LENGTH_SHORT).show();
    finish();
    } else {
            // login gagal pendek
        //Toast.makeText(this, "Username dan Password Salah",
                //Toast.LENGTH_SHORT).show();
            // jika login gagal yang panjang
            AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
            builder.setMessage("Username atau Password Anda Salah !!!")
                    .setNegativeButton("Retry", null).create().show();
           }
    }
    public void logout (View v){
        finish();
    }
}
