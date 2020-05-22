package com.example.androidproje;
enum Hatirlatma {
    gunluk,haftalik,aylik;
        }
public class etkinlik {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;
    String tarih;
    String ad;
    String detay;
    String bassa;
    String bitsa;
    String hatsa;
    String hatirlama;
    String adres;

    public etkinlik(int id, String tarih, String ad, String detay, String bassa, String bitsa, String hatsa, String hatirlama, String adres) {
        this.id = id;
        this.tarih = tarih;
        this.ad = ad;
        this.detay = detay;
        this.bassa = bassa;
        this.bitsa = bitsa;
        this.hatsa = hatsa;
        this.hatirlama = hatirlama;
        this.adres = adres;
    }

    public etkinlik() {
    }

    public etkinlik(int id, String ad) {
        this.id = id;
        this.ad = ad;
    }
    public String toString(){
        return ""+id+"  "+ad;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getDetay() {
        return detay;
    }

    public void setDetay(String detay) {
        this.detay = detay;
    }

    public String getBassa() {
        return bassa;
    }

    public void setBassa(String bassa) {
        this.bassa = bassa;
    }

    public String getBitsa() {
        return bitsa;
    }

    public void setBitsa(String bitsa) {
        this.bitsa = bitsa;
    }

    public String getHatsa() {
        return hatsa;
    }

    public void setHatsa(String hatsa) {
        this.hatsa = hatsa;
    }

    public String getHatirlama() {
        return hatirlama;
    }

    public void setHatirlama(String hatirlama) {
        this.hatirlama = hatirlama;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }


}
