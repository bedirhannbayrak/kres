package entitites;

import java.util.ArrayList;
import java.util.List;

public class Ogretmen extends Kisi {

    private String brans;
    private Sinif sinif;
    private List<Ders> girilenDersler = new ArrayList<>();
    
    public Ogretmen(String ad, String soyad, Sinif sinif, String brans) {
        super(ad, soyad);
        this.sinif = sinif;
        this.brans = brans;
    }
    
    public Ogretmen() {
    }
    
    public String getBrans() {
        return brans;
    }
    
    public void setBrans(String brans) {
        this.brans = brans;
    }
    
    public Sinif getSinif() {
        return sinif;
    }
    
    public void setSinif(Sinif sinif) {
        this.sinif = sinif;
    }
    
    public List<Ders> getGirilenDersler() {
        return girilenDersler;
    }
    
}
