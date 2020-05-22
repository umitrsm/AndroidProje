package com.example.androidproje;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class EtkinlikEkleActivity extends AppCompatActivity  {
    Button bitis,bas,hatirlat,ekle;
    Context context = this;
    TextView bitissa,bassa,hatirlatsa;
    EditText ad,detay,adres;
    String nisim,ntarih,nbassa,nbitsa,nhatsa,nhatirlatma,nadres,ndetay;
    veriKaynagi vk = new veriKaynagi(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etkinlik_ekle);
        adres = (EditText) findViewById(R.id.adresi);
        ad = (EditText) findViewById(R.id.isim);
        detay = (EditText) findViewById(R.id.detayi);
        ekle = (Button) findViewById(R.id.ekle);
        bas = (Button) findViewById(R.id.baslangic);
        bitis = (Button) findViewById(R.id.bitis);
        hatirlat = (Button) findViewById(R.id.hatirlat);
        hatirlatsa = (TextView) findViewById(R.id.hatirlatsa);
        bitissa = (TextView) findViewById(R.id.bitissa);
        bassa = (TextView) findViewById(R.id.baslangicsa);
        bas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar takvim = Calendar.getInstance();
                int saat = takvim.get(Calendar.HOUR_OF_DAY);
                int dakika = takvim.get(Calendar.MINUTE);

                TimePickerDialog tpd = new TimePickerDialog(context,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                                // hourOfDay ve minute değerleri seçilen saat değerleridir.
                                // Edittextte bu değerleri gösteriyoruz.
                                bassa.setText(hourOfDay + ":" + minute);
                            }
                        }, saat, dakika, true);
                tpd.setButton(TimePickerDialog.BUTTON_POSITIVE, "Seç", tpd);
                tpd.setButton(TimePickerDialog.BUTTON_NEGATIVE, "İptal", tpd);
                tpd.show();
            }
        });
        bitis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar takvim = Calendar.getInstance();
                int saat = takvim.get(Calendar.HOUR_OF_DAY);
                int dakika = takvim.get(Calendar.MINUTE);

                TimePickerDialog tpd = new TimePickerDialog(context,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                                // hourOfDay ve minute değerleri seçilen saat değerleridir.
                                // Edittextte bu değerleri gösteriyoruz.
                                bitissa.setText(hourOfDay + ":" + minute);
                            }
                        }, saat, dakika, true);
                tpd.setButton(TimePickerDialog.BUTTON_POSITIVE, "Seç", tpd);
                tpd.setButton(TimePickerDialog.BUTTON_NEGATIVE, "İptal", tpd);
                tpd.show();
            }
        });
        hatirlat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar takvim = Calendar.getInstance();
                int saat = takvim.get(Calendar.HOUR_OF_DAY);
                int dakika = takvim.get(Calendar.MINUTE);

                TimePickerDialog tpd = new TimePickerDialog(context,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                                // hourOfDay ve minute değerleri seçilen saat değerleridir.
                                // Edittextte bu değerleri gösteriyoruz.
                                hatirlatsa.setText(hourOfDay + ":" + minute);
                            }
                        }, saat, dakika, true);
                tpd.setButton(TimePickerDialog.BUTTON_POSITIVE, "Seç", tpd);
                tpd.setButton(TimePickerDialog.BUTTON_NEGATIVE, "İptal", tpd);
                tpd.show();
            }
        });
    ekle.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        etkinlik e = new etkinlik();
        e.setAd(ad.getText().toString());
        e.setDetay(detay.getText().toString());
        e.setBassa(bassa.getText().toString());
        e.setBitsa(bitissa.getText().toString());
        e.setAdres(adres.getText().toString());
        vk.etkinlikOlustur(e);
        }
    });
    }

}
