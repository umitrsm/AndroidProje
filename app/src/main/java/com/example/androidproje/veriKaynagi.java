package com.example.androidproje;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class veriKaynagi {
    SQLiteDatabase db;
    sqlite_katman bdb;
    public veriKaynagi(Context c){
        bdb = new sqlite_katman(c);
    }
    public void ac(){
        db=bdb.getWritableDatabase();
                    }
    public void kapat(){
        bdb.close();
                    }
}

