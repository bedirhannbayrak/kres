/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author bedirhan
 */
public class OgrenciSinifOgretmenTableDto {

private int ogrenciId;
private String ogrenciAd;
private String ogrenciSoyad;
private String ogretmenAdSoyad;
private String sinifNo;

    public OgrenciSinifOgretmenTableDto(int ogrenciId, String ogrenciAd, String ogrenciSoyad, String ogretmenAdSoyad, String sinifNo) {
        this.ogrenciId = ogrenciId;
        this.ogrenciAd = ogrenciAd;
        this.ogrenciSoyad = ogrenciSoyad;
        this.ogretmenAdSoyad = ogretmenAdSoyad;
        this.sinifNo = sinifNo;
    }

    public OgrenciSinifOgretmenTableDto() {
    }

    public int getOgrenciId() {
        return ogrenciId;
    }

    public void setOgrenciId(int ogrenciId) {
        this.ogrenciId = ogrenciId;
    }

    public String getOgrenciAd() {
        return ogrenciAd;
    }

    public void setOgrenciAd(String ogrenciAd) {
        this.ogrenciAd = ogrenciAd;
    }

    public String getOgrenciSoyad() {
        return ogrenciSoyad;
    }

    public void setOgrenciSoyad(String ogrenciSoyad) {
        this.ogrenciSoyad = ogrenciSoyad;
    }

    public String getOgretmenAdSoyad() {
        return ogretmenAdSoyad;
    }

    public void setOgretmenAdSoyad(String ogretmenAdSoyad) {
        this.ogretmenAdSoyad = ogretmenAdSoyad;
    }

    public String getSinifNo() {
        return sinifNo;
    }

    public void setSinifNo(String sinifNo) {
        this.sinifNo = sinifNo;
    }
}
