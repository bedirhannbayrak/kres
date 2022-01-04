package entitites;


public class Yonetici extends Kisi {
    private String kullaniciAdi;
    private String sifre;

    public Yonetici() {
    }

    public Yonetici(String ad, String soyad, String kullaniciAdi, String sifre) {
        super(ad,soyad);
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
}
