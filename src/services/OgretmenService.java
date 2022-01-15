/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dto.OgretmenSinifTableDto;
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
public class OgretmenService {
    
    SinifService sinifService;
    
    public List<OgretmenSinifTableDto> findAllTableOgretmenSinif() {
        List<OgretmenSinifTableDto> ogretmenler = new ArrayList<>();
        ResultSet rs = Select.getData("select o.id,o.ad,o.soyad,o.brans,s.no from ogretmen o left join sinif s on o.sinif_id = s.id; ");
        
        try {
            while (rs.next()) {
                OgretmenSinifTableDto dto = new OgretmenSinifTableDto();
                dto.setOgretmenId(Integer.parseInt(rs.getString(1)));
                dto.setOgretmenAdSoyad(rs.getString(2) + " " + rs.getString(3));
                dto.setOgretmenBrans(rs.getString(4));
                dto.setSinifNo(rs.getString(5));
                
                ogretmenler.add(dto);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ogretmenler;
        
    }
    
    public Ogretmen findById(int id) {
        ResultSet rs = Select.getData("SELECT * FROM ogretmen where id='" + id + "'");
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
    
    public void addSinif(int ogretmenId, int sinifId) {
        String QUERY = "UPDATE ogretmen set sinif_id=" + sinifId + " where id=" + ogretmenId;
        InsertUpdateDelete.setData(QUERY, "");
    }
    
    public void deleteSinif(int ogretmenId) {
        String QUERY = "UPDATE ogretmen set sinif_id=null where id='" + ogretmenId + "' ";
        InsertUpdateDelete.setData(QUERY, "");
    }
    
    public List<Ogretmen> findAll() {
        List<Ogretmen> ogretmenler = new ArrayList<>();
        
        try {
            ResultSet rs = Select.getData("SELECT * FROM ogretmen");
            while (rs.next()) {
                Ogretmen ogretmen = new Ogretmen();
                ogretmen.setId(Integer.parseInt(rs.getString(1)));
                ogretmen.setAd(rs.getString(2));
                ogretmen.setSoyad(rs.getString(3));
                ogretmen.setBrans(rs.getString(4));
                
                if (rs.getString(5) != null) {
                    int sinifId = Integer.parseInt(rs.getString(5));
                    
                    sinifService = new SinifService();
                    Sinif sinif = sinifService.findByIdLazy(sinifId);
                    sinif.setOgretmen(ogretmen);
                    ogretmen.setSinif(sinif);
                }
                
                ogretmenler.add(ogretmen);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
            System.out.println("findAll error" + e.getMessage());
        }
        return ogretmenler;
    }
    
    public List<Ogretmen> findAllOgretmenBySinifIsNull() {
        List<Ogretmen> ogretmenler = new ArrayList<>();
        
        try {
            ResultSet rs = Select.getData("SELECT * FROM ogretmen WHERE sinif_id is null");
            while (rs.next()) {
                Ogretmen ogretmen = new Ogretmen();
                ogretmen.setId(Integer.parseInt(rs.getString(1)));
                ogretmen.setAd(rs.getString(2));
                ogretmen.setSoyad(rs.getString(3));
                ogretmenler.add(ogretmen);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("findAllOgretmenSınıfIsNull error" + e.getMessage());
        }
        return ogretmenler;
    }
    
    public Ogretmen saveWithoutSinif(Ogretmen ogretmen) {
        ogretmen.setId(Util.random());
        String QUERY = "INSERT INTO ogretmen VALUES (" + ogretmen.getId() + ",'" + ogretmen.getAd() + "','" + ogretmen.getSoyad() + "','" + ogretmen.getBrans() + "',null)";
        InsertUpdateDelete.setData(QUERY, "Sınıf kaydedildi");
        return ogretmen;
    }
    
    public Ogretmen saveWithSinif(Ogretmen ogretmen, int sinifId) {
        ogretmen.setId(Util.random());
        String QUERY = "INSERT INTO ogretmen VALUES (" + ogretmen.getId() + ",'" + ogretmen.getAd() + "','" + ogretmen.getSoyad() + "','" + ogretmen.getBrans() + "'," + sinifId + ")";
        sinifService = new SinifService();
        
        InsertUpdateDelete.setData(QUERY, "");
        sinifService.addOgretmen(sinifId, ogretmen.getId());
        JOptionPane.showMessageDialog(null, "Sınıf Kaydedildi.");
        return ogretmen;
    }
    
}
