package entitites;

import java.util.ArrayList;
import java.util.List;

public class Sinif {

    private int id;
    private String no;
    private int kapasite;
    private Ogretmen ogretmen;
    private List<Ogrenci> ogreciler = new ArrayList<>();

    public Sinif() {};

    public Sinif(String no, Ogretmen ogretmen) {
        this.no = no;
        this.ogretmen = ogretmen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
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
