package com.example.androidproje;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class sqlite_katman extends SQLiteOpenHelper {

    public sqlite_katman(Context c){
        super(c,"etkinlik",null,1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table etkinlik(tarih text primary key,ad text,detay text,bassa text,bitsa text,hatsa text,hatirlama text,adres text)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists etkinlik");
    }
}
