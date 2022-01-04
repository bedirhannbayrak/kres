package entitites;

import java.util.ArrayList;
import java.util.List;

public class Sınıf {
    private String no;
    private Ogretmen ogretmen;
    private List<Ogrenci> ogreciler = new ArrayList<>();

    public Sınıf() {};

    public Sınıf(String no, Ogretmen ogretmen) {
        this.no = no;
        this.ogretmen = ogretmen;
    }


    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Ogretmen getOgretmen() {
        return ogretmen;
    }

    public void setOgretmen(Ogretmen ogretmen) {
        this.ogretmen = ogretmen;
    }

    public List<Ogrenci> getOgreciler() {
        return ogreciler;
    }

}
