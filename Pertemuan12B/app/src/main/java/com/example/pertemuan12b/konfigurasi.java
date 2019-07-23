package com.example.pertemuan12b;

public class konfigurasi {
    //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
//Pada tutorial Kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer
//dimana File PHP tersebut berada
//PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String URL_ADD="https://pegawai.terimajasa.com/tambahpgw.php";
    public static final String URL_GET_ALL = "https://pegawai.terimajasa.com/tampilsemuapgw.php";
    public static final String URL_GET_EMP = "https://pegawai.terimajasa.com/tampilpgw.php?id=";
    public static final String URL_UPDATE_EMP = "https://pegawai.terimajasa.com/updatepgw.php";
    public static final String URL_DELETE_EMP = "https://pegawai.terimajasa.com/hapuspgw.php?id=";
    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "name";
    public static final String KEY_EMP_POSISI = "position"; //desg itu variabel untuk posisi
    public static final String KEY_EMP_GAJIH = "salary"; //salary itu variabel untuk gajih
    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "name";
    public static final String TAG_POSISI = "position";//desg
    public static final String TAG_GAJIH = "salary";
    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";
}
