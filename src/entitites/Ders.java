package entitites;

public class Ders {
    private String ad;
    private String kod;

    public Ders(String ad, String kod) {
        this.ad = ad;
        this.kod = kod;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}
