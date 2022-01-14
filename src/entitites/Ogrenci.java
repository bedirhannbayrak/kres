package entitites;

public class Ogrenci extends Kisi {
    private Sinif sinif;
    private Ogretmen ogretmen;
    private Veli veli;
    private int dogumYili;

    public Ogrenci(String ad, String soyad, Sinif sinif, Veli veli,int dogumYili) {
        super(ad, soyad);
        this.sinif = sinif;
        this.veli = veli;
        this.dogumYili=dogumYili;
    }

    public Ogrenci(Sinif sinif, Ogretmen ogretmen, Veli veli, int dogumYili, String ad, String soyad) {
        super(ad, soyad);
        this.sinif = sinif;
        this.ogretmen = ogretmen;
        this.veli = veli;
        this.dogumYili = dogumYili;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili(int dogumYili) {
        this.dogumYili = dogumYili;
    }



    public Ogrenci() {
    }

    public Sinif getSinif() {
        return sinif;
    }

    public void setSinif(Sinif sinif) {
        this.sinif = sinif;
    }

    public Ogretmen getOgretmen() {
        return ogretmen;
    }

    public void setOgretmen(Ogretmen ogretmen) {
        this.ogretmen = ogretmen;
    }

    public Veli getVeli() {
        return veli;
    }

    public void setVeli(Veli veli) {
        this.veli = veli;
    }
}
