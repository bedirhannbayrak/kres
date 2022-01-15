/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author bedirhan
 */
public class OgretmenSinifTableDto {

    private int ogretmenId;
    private String sinifNo;
    private String ogretmenAdSoyad;
    private String ogretmenBrans;

    public OgretmenSinifTableDto(int ogretmenId, String sinifNo, String ogretmenAdSoyad, String ogretmenBrans) {
        this.ogretmenId = ogretmenId;
        this.sinifNo = sinifNo;
        this.ogretmenAdSoyad = ogretmenAdSoyad;
        this.ogretmenBrans = ogretmenBrans;
    }

    public OgretmenSinifTableDto() {
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

    public String getOgretmenAdSoyad() {
        return ogretmenAdSoyad;
    }

    public void setOgretmenAdSoyad(String ogretmenAdSoyad) {
        this.ogretmenAdSoyad = ogretmenAdSoyad;
    }

    public String getOgretmenBrans() {
        return ogretmenBrans;
    }

    public void setOgretmenBrans(String ogretmenBrans) {
        this.ogretmenBrans = ogretmenBrans;
    }



}
