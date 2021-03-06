package com.example.androidproje;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

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
    public void etkinlikOlustur(etkinlik e){
      //  etkinlik e = new etkinlik();
      //  e.setAd(isim);
      //  e.setDetay(detay);
      //  e.setBassa(bassa);
      //  e.setBitsa(bitsa);
     //   e.setHatsa(hatsa);
      //  e.setHatirlama(hatirlatma);
     //   e.setAdres(adres);

        ContentValues val = new ContentValues();
        val.put("ad",e.getAd());
        val.put("detay",e.getDetay());
        val.put("bassa",e.getBassa());
        val.put("bitsa",e.getBitsa());
        val.put("hatsa",e.getHatsa());
        val.put("hatirlatma",e.getHatirlama());
        val.put("adres",e.getAdres());
       db.insert("etkinlik",null,val);
    }
    public List<etkinlik> listele(){
        List<etkinlik> etkinliks = new ArrayList<etkinlik>();
        String kolon[] = {"ad","detay","bassa","bitsa","hatsa","hatirlatma","adres"};
        Cursor c = db.query("etkinlik",kolon,null,null,null,null,null);
        c.moveToFirst();
        while (!c.isAfterLast()){
            int id = c.getInt(0);
            String isim = c.getString(1);
            String detay = c.getString(2);
            String bassa =  c.getString(3);
            String bitsa = c.getString(4);
            String hatsa = c.getString(5);
            String hatirlatma = c.getString(6);
            String adres = c.getString(7);
            etkinlik e = new etkinlik();
            e.setAd(isim);
            e.setDetay(detay);
            e.setBassa(bassa);
            e.setBitsa(bitsa);
            e.setHatsa(hatsa);
            e.setHatirlama(hatirlatma);
            e.setAdres(adres);
            etkinliks.add(e);
        }
        return etkinliks;
    }
    public void etkinlikSil(etkinlik e){
    int id = e.getId();
    db.delete("etkinlik","id="+id,null);
    }
}

