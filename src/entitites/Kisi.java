package entitites;

public abstract class Kisi {

    private int id;
    private String ad;
    private String soyad;

    public Kisi() {
    }

    public Kisi(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
}
