package com.example.proyek1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import android.widget.Toolbar;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_STORAGE = 100;
    ListView liatView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Apilkasi Catatan !!!");
        liatView = findViewById(R.id.View);
        liatView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(MainActivity.this, InsertAndViewActivity.class);
        Map<String, Object> data = (Map<String, Object>)parent.getAdapter().getItem(position);
        intent.putExtra("filename", data.get("name").toString());
        Toast.makeText(MainActivity.this, "You Clicked " + data.get("name").toString(), Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
        });

        liatView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
    @Override

    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        Map<String, Object> data = (Map<String, Object>)parent.getAdapter().getItem(position);
        tampilkanDialogKonfirmasiHapusCatatan(data.get("name").toString());
        return true;
        }
        });
}
    @Override
    protected void onResume(){
        super.onResume();
        if (Build.VERSION.SDK_INT >= 23){
            if(periksaIzinPenyimpanan()){
                mengambilListFilePadaFolder();
            }
        } else {
            mengambilListFilePadaFolder();
        }
    }

    public boolean periksaIzinPenyimpanan(){
    if (Build.VERSION.SDK_INT >= 23){
        if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) ==
                PackageManager.PERMISSION_GRANTED){
            return true;
        } else {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_CODE_STORAGE);
            return false;
        }
    }   else {
        return true;
    }
    }
    @Override
    public  void  onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[]grantResult){
        super .onRequestPermissionsResult(requestCode,permissions,grantResult);
        switch (requestCode){
            case REQUEST_CODE_STORAGE:
                if (grantResult[0] == PackageManager.PERMISSION_GRANTED ){
                    mengambilListFilePadaFolder();
                }
                break;
        }

    }
    void mengambilListFilePadaFolder(){
        String path = Environment.getExternalStorageDirectory().toString() + "kominfo.proyek1";
        File directory = new File(path);

        if (directory.exists()){
            File [] files = directory.listFiles();
            String[] filenames = new String[files.length];
            String [] dateCreated = new  String[files.length];
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM YYYY HH:mm:ss");
            ArrayList <Map<String,Object>> itemDataList = new ArrayList<Map<String, Object>>();

            for (int i = 0; i < files.length; i++){
                filenames[i] = files[i].getName();
                Date lastModedate = new Date (files[i].lastModified());
                dateCreated[i] = simpleDateFormat.format(lastModedate);
                Map<String, Object> listItemMap = new HashMap<>();
                listItemMap.put("name", filenames[i]);
                listItemMap.put("date", dateCreated[i]);
                itemDataList.add(listItemMap);
            }

            SimpleAdapter simpleAdapter = new SimpleAdapter(this, itemDataList,
                    android.R.layout.simple_list_item_2,
                    new  String[]{"name", "date"},
                    new int[]{android.R.id.text1,
                            android.R.id.text2});
            liatView.setAdapter(simpleAdapter);
            simpleAdapter.notifyDataSetChanged();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_tambah:
                Intent intent = new Intent(this, InsertAndViewActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    void tampilkanDialogKonfirmasiHapusCatatan(final String filename){
        new AlertDialog.Builder(this)
                .setTitle("Hapus Catatan ini ?")
                .setMessage("Apakah Anda yakin ingin menghapus catatan "+filename+"?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int wichButton) {
                        hapusFile(filename);
                    }
                }).setNegativeButton(android.R.string.no, null).show();
    }

    void hapusFile(String filename){
        String path = Environment.getExternalStorageDirectory().toString() + "/kominfo.proyek1";
        File file = new File(path, filename);
        if(file.exists()){
            file.delete();
        }
        mengambilListFilePadaFolder();
    }
}




