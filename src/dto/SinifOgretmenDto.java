/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

public class SinifOgretmenDto {

    private int sinifId;
    private int ogretmenId;
    private String sinifNo;
    private int sinifKapasite;
    private String ogretmenAd;
    private String ogretmenSoyad;

    public SinifOgretmenDto(int sinifId, int ogretmenId, String sinifNo, String ogretmenAd, String ogretmenSoyad) {
        this.sinifId = sinifId;
        this.ogretmenId = ogretmenId;
        this.sinifNo = sinifNo;
        this.ogretmenAd = ogretmenAd;
        this.ogretmenSoyad = ogretmenSoyad;
    }

    public SinifOgretmenDto() {
    }

    public int getSinifId() {
        return sinifId;
    }

    public int getSinifKapasite() {
        return sinifKapasite;
    }

    public void setSinifKapasite(int sinifKapasite) {
        this.sinifKapasite = sinifKapasite;
    }

    public void setSinifId(int sinifId) {
        this.sinifId = sinifId;
    }

    public int getOgretmenId() {
        return ogretmenId;
    }

    public void setOgretmenId(int ogretmenId) {
        this.ogretmenId = ogretmenId;
    }

    public String getSinifNo() {
        return sinifNo;
    }

    public void setSinifNo(String sinifNo) {
        this.sinifNo = sinifNo;
    }

    public String getOgretmenAd() {
        return ogretmenAd;
    }

    public void setOgretmenAd(String ogretmenAd) {
        this.ogretmenAd = ogretmenAd;
    }

    public String getOgretmenSoyad() {
        return ogretmenSoyad;
    }

    public void setOgretmenSoyad(String ogretmenSoyad) {
        this.ogretmenSoyad = ogretmenSoyad;
    }

}
