package com.example.androidproje;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AyarlarActivity extends AppCompatActivity {

    String[] zilSesi = {"1 SAAT ÖNCE","2 SAAT ÖNCE","3 SAAT ÖNCE"};
    String[] hatirlatma = {"GÜNLÜK","HAFTALIK","AYLIK"};
    Spinner spin1,spin2;
    ArrayAdapter<String> adapZil,adapHat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayarlar);
        spin1 = (Spinner) findViewById(R.id.spin);
        spin2 = (Spinner) findViewById(R.id.spin2);
        adapZil = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,zilSesi);
        adapHat = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,hatirlatma);
        adapZil.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapHat.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(adapZil);
        spin2.setAdapter(adapHat);
    }
}
