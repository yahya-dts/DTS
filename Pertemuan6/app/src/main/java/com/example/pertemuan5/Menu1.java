package com.example.pertemuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Menu1 extends AppCompatActivity {
    // deklarasi object java
    Button BtnMerah,BtnKuning;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()== R.id.menu11){
        startActivity(new Intent(this,Menu11.class));
    }
        else if (item.getItemId()== R.id.menu22){
                startActivity(new Intent(this,Menu22.class));
    }
        else if (item.getItemId()== R.id.menu33){
                startActivity(new Intent(this,Menu33.class));
    }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        //hubungkan object java dengan ID XML
        BtnMerah = findViewById(R.id.Btn1);
        BtnKuning = findViewById(R.id.Btn2);

    }
    // code merubah warna
    public void Rubah_Warna(View v) {
        BtnMerah.setBackgroundColor(Color.RED);
    }
        public void Warna_Kuning(View v){
            BtnKuning.setBackgroundColor(Color.YELLOW);

    }
}
