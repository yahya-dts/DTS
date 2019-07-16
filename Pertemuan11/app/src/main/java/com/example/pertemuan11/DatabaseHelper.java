package com.example.pertemuan11;

import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;
import android.content.ContentValues;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;


public class DatabaseHelper extends SQLiteOpenHelper {
    public static String DATABASE_NAME = "kampus.db";
    private static final int DATABASE_VERSION = 1;
    private static final String QUERY_CREATE = "CREATE TABLE mahasiswa(nim INTEGER PRIMARY KEY AUTOINCREMENT, nama_mhs TEXT);";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        Log.d("table", QUERY_CREATE);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //jalankan query buat tabel
        db.execSQL(QUERY_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //jalankan query apabila terdapat tabel mahasiswa disaat pertama kali launch
        db.execSQL("DROP TABLE IF EXISTS 'mahasiswa'");
        onCreate(db);
    }

    public long insertData(String input) {
        // Coding insert data ke table
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("nama_mhs", input);
        long insert = db.insert("mahasiswa", null, values);
        return insert;
    }

    public ArrayList<String> getAllDataList() {
        // Coding view data dari table
        ArrayList<String> dataArrayList = new ArrayList<String>();
        String cache="";
        String selectQuery = "SELECT  * FROM 'mahasiswa'";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);

        // looping semua data pada dan dimasukkan ke arraylist
        if (c.moveToFirst()) {
            do {
                cache = c.getString(c.getColumnIndex("nama_mhs"));
                dataArrayList.add(cache);
            } while (c.moveToNext());
            Log.d("array", dataArrayList.toString());
        }
        return dataArrayList;
    }
}