package com.example.androidproje;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CalendarView calendarView;
    TextView myDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarView = (CalendarView) findViewById(R.id.calen);
        myDate = (TextView) findViewById(R.id.date);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String date = (dayOfMonth) + "/" +(month) + "/" + (year);
                myDate.setText(date);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.ayar:
                Intent ayar = new Intent(MainActivity.this, AyarlarActivity.class);
                startActivity(ayar);

            case R.id.etkinlik:
                Intent etkinlik = new Intent(MainActivity.this, EtkinlikActivity.class);
                startActivity(etkinlik);
            case R.id.ekle:
                Intent ekle = new Intent(MainActivity.this, EtkinlikEkleActivity.class);
                startActivity(ekle);
        }
        return super.onOptionsItemSelected(item);
    }
}