package entitites;

public class Ogrenci extends Kisi {
    private Sınıf sinif;
    private Ogretmen ogretmen;
    private Veli veli;
    private int dogumYili;

    public Ogrenci(String ad, String soyad, Sınıf sinif, Veli veli,int dogumYili) {
        super(ad, soyad);
        this.sinif = sinif;
        this.veli = veli;
        this.dogumYili=dogumYili;
    }

    public Ogrenci() {
    }

    public Sınıf getSinif() {
        return sinif;
    }

    public void setSinif(Sınıf sinif) {
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
