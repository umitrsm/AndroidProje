package com.example.androidproje;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.List;

public class EtkinlikActivity extends ListActivity {
veriKaynagi vk = new veriKaynagi(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etkinlik);
        List<etkinlik> etkinlikList = vk.listele();
        ArrayAdapter<etkinlik> adapter = new ArrayAdapter<etkinlik>(this,android.R.layout.simple_list_item_1,etkinlikList);
       setListAdapter(adapter);
    }
}
