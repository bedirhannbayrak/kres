/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dto.OgrenciSinifOgretmenTableDto;
import dto.SinifOgretmenDto;
import entitites.Ogrenci;
import entitites.Ogretmen;
import entitites.Sinif;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import project.InsertUpdateDelete;
import project.Select;
import project.Util;

/**
 *
 * @author bedirhan
 */
public class OgrenciService {

    SinifService sinifService;

    public Ogrenci save(Ogrenci ogrenci) {
        ogrenci.setId(Util.random());
        String QUERY = "INSERT INTO ogrenci VALUES (" + ogrenci.getId() + ",'" + ogrenci.getAd() + "','" + ogrenci.getSoyad()
                + "'," + ogrenci.getDogumYili() + ",null," + ogrenci.getSinif().getId() + ",null)";
        InsertUpdateDelete.setData(QUERY, "Ogrenci kaydedildi");
        return ogrenci;
    }

    public Ogretmen findById(int id) {
        ResultSet rs = Select.getData("SELECT * FROM ogrenci where id='" + id + "'");
        Ogretmen ogretmen = new Ogretmen();
        try {
            while (rs.next()) {

                ogretmen.setId(Integer.parseInt(rs.getString(1)));
                ogretmen.setAd(rs.getString(2));
                ogretmen.setSoyad(rs.getString(3));
                ogretmen.setBrans(rs.getString(4));

                int sinifId = -1;

                if (rs.getString(5) != null) {
                    sinifService = new SinifService();
                    sinifId = Integer.parseInt(rs.getString(5));
                    Sinif sinif = sinifService.findByIdLazy(sinifId);
                    sinif.setOgretmen(ogretmen);
                    ogretmen.setSinif(sinif);
                }
            }
            rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
            System.out.println("findById error" + e.getMessage());
        }
        return ogretmen;
    }

    public List<OgrenciSinifOgretmenTableDto> findAllTableDto() {
        List<OgrenciSinifOgretmenTableDto> ogrenciler = new ArrayList<>();
        ResultSet rs = Select.getData("select ogrenci.id,ogrenci.ad,ogrenci.soyad,sinif.no,ogretmen.ad,ogretmen.soyad "
                + "from ogrenci left join sinif "
                + "on ogrenci.sinif_id = sinif.id "
                + "left join ogretmen "
                + "on ogrenci.ogretmen_id = ogretmen.id; ");

        try {
            while (rs.next()) {
                OgrenciSinifOgretmenTableDto dto = new OgrenciSinifOgretmenTableDto();
                dto.setOgrenciId(Integer.parseInt(rs.getString(1)));
                dto.setOgrenciAd(rs.getString(2));
                dto.setOgrenciSoyad(rs.getString(3));
                String ogretmenAd;
                String ogretmenSoyad;
                dto.setSinifNo(rs.getString(4));
                if (rs.getString(5) != null) {
                    ogretmenAd = rs.getString(5);
                    ogretmenSoyad = rs.getString(6);
                    dto.setOgretmenAdSoyad(ogretmenAd + " " + ogretmenSoyad);
                }

                ogrenciler.add(dto);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ogrenciler;

    }

    public Ogretmen findByIdLazy(int id) {
        ResultSet rs = Select.getData("SELECT * FROM ogretmen where id='" + id + "'");
        Ogretmen ogretmen = new Ogretmen();
        try {
            while (rs.next()) {

                ogretmen.setId(Integer.parseInt(rs.getString(1)));
                ogretmen.setAd(rs.getString(2));
                ogretmen.setSoyad(rs.getString(3));
                ogretmen.setBrans(rs.getString(4));

            }
            rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
            System.out.println("findByIdLazy error" + e.getMessage());
        }
        return ogretmen;
    }

    public void addOgretmen(int ogrenciId, int ogretmenId) {
        String QUERY = "UPDATE ogrenci set ogretmen_id=" + ogretmenId + " where id=" + ogrenciId;
        InsertUpdateDelete.setData(QUERY, "");
    }

    public void deleteSinifAndOgretmen(int ogrenciId) {
        String QUERY = "UPDATE ogrenci set sinif_id=null,ogretmen_id=null where id=" + ogrenciId;
        InsertUpdateDelete.setData(QUERY, "");
    }

    public void addSinifAndOgretmenBySinifNo(int ogrenciId, String sinifNo) {
        sinifService = new SinifService();
        SinifOgretmenDto dto = sinifService.findSinifOgretmenDtoBySinifNo(sinifNo);
        String QUERY;
        if (dto.getOgretmenAd() != null) {
            QUERY = "UPDATE ogrenci set sinif_id=" + dto.getSinifId() + ",ogretmen_id=" + dto.getOgretmenId() + " where id=" + ogrenciId ;
        } else {
            QUERY = "UPDATE ogrenci set sinif_id=" + dto.getSinifId() + " where id=" + ogrenciId;
        }
        InsertUpdateDelete.setData(QUERY, "");
    }

}
