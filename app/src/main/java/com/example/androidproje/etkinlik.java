package com.example.androidproje;
enum Hatirlatma {
    gunluk,haftalik,aylik;
        }
public class etkinlik {
    String ad;
    String detay;
    String bassa;
    String bitsa;
    String hatsa;
    Hatirlatma hatirlama;
    String adres;

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

    public Hatirlatma getHatirlama() {
        return hatirlama;
    }

    public void setHatirlama(Hatirlatma hatirlama) {
        this.hatirlama = hatirlama;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }


}