/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

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
public class SinifService {

    OgretmenService ogretmenService;

    public Sinif updateWithoutOgretmen(Sinif sinif) {
        String QUERY = "UPDATE sinif SET kapasite=" + sinif.getKapasite() + ",no='" + sinif.getNo() + "' where id=" + sinif.getId();
        InsertUpdateDelete.setData(QUERY, "Sınıf guncellendi");
        return sinif;
    }

    public Sinif updateWithOgretmen(Sinif sinif, int ogretmenId) {
        ogretmenService = new OgretmenService();
        changeOgretmen(sinif.getId(), ogretmenId);
        String QUERY = "UPDATE sinif SET kapasite=" + sinif.getKapasite() + ",no='" + sinif.getNo() + "' where id=" + sinif.getId();
        InsertUpdateDelete.setData(QUERY, "Sınıf guncellendi");
        return sinif;
    }

    public Sinif updateWithNewOgretmen(Sinif sinif, int ogretmenId) {
        ogretmenService = new OgretmenService();
        ogretmenService.addSinif(ogretmenId, sinif.getId());
        String QUERY = "UPDATE sinif SET ogretmen_id=" + ogretmenId + ",kapasite=" + sinif.getKapasite() + ",no='" + sinif.getNo() + "' where id=" + sinif.getId();
        InsertUpdateDelete.setData(QUERY, "Sınıf guncellendi");
        return sinif;
    }

    public Sinif saveWithoutOgretmen(Sinif sinif) {
        sinif.setId(Util.random());
        String QUERY = "INSERT INTO sinif VALUES ('" + sinif.getId() + "','" + sinif.getKapasite() + "','" + sinif.getNo() + "',null)";
        InsertUpdateDelete.setData(QUERY, "Sınıf kaydedildi");
        return sinif;
    }

    public Sinif saveWithOgretmen(Sinif sinif, int ogretmenId) {
        sinif.setId(Util.random());
        String query = "INSERT INTO sinif VALUES ('" + sinif.getId() + "','" + sinif.getKapasite() + "','" + sinif.getNo() + "','" + ogretmenId + "')";
        String sinifQuery = "UPDATE ogretmen set sinif_id=" + sinif.getId() + " where id='" + ogretmenId + "' ";
        InsertUpdateDelete.setData(query, "");
        InsertUpdateDelete.setData(sinifQuery, "Sınıf kaydedildi.");
        return sinif;
    }

    public Sinif findById(int id) {
        ResultSet rs = Select.getData("SELECT * FROM sinif where id='" + id + "'");
        Sinif sinif = new Sinif();
        try {
            while (rs.next()) {

                sinif.setId(Integer.parseInt(rs.getString(1)));
                sinif.setKapasite(Integer.parseInt(rs.getString(2)));
                sinif.setNo(rs.getString(3));

                int ogretmenId = -1;

                if (rs.getString(4) != null) {
                    ogretmenService = new OgretmenService();
                    ogretmenId = Integer.parseInt(rs.getString(4));
                    Ogretmen ogretmen = ogretmenService.findByIdLazy(ogretmenId);
                    ogretmen.setSinif(sinif);
                    sinif.setOgretmen(ogretmen);
                }

            }
            rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
            System.out.println("SınıfService findById error" + e.getMessage());
        }
        return sinif;
    }

    public Sinif findByIdLazy(int id) {
        ResultSet rs = Select.getData("SELECT * FROM sinif where id='" + id + "'");
        Sinif sinif = new Sinif();
        try {
            while (rs.next()) {

                sinif.setId(Integer.parseInt(rs.getString(1)));
                sinif.setKapasite(Integer.parseInt(rs.getString(2)));
                sinif.setNo(rs.getString(3));
            }
            rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
            System.out.println("SınıfService findByIdLazy error" + e.getMessage());
        }
        return sinif;
    }

    public void addOgretmen(int sinifId, int ogretmenId) {
        String QUERY = "UPDATE sinif set ogretmen_id=" + ogretmenId + " where id=" + sinifId;
        InsertUpdateDelete.setData(QUERY, "");
    }

    public void deleteOgretmen(int sinifId) {
        String QUERY = "UPDATE sinif set ogretmen_id=null where id='" + sinifId + "' ";
        ogretmenService.deleteSinif(sinifId);
        InsertUpdateDelete.setData(QUERY, "");
    }

    public void changeOgretmen(int sinifId, int newOgretmenId) {
        ogretmenService = new OgretmenService();
        Sinif sinif = findById(sinifId);
        deleteOgretmen(sinifId);
        ogretmenService.deleteSinif(sinif.getOgretmen().getId());
        ogretmenService.addSinif(newOgretmenId, sinifId);
        addOgretmen(sinifId, newOgretmenId);
    }

    public Sinif findByNo(String no) {
        ResultSet rs = Select.getData("SELECT * FROM sinif where no='" + no + "'");
        Sinif sinif = new Sinif();
        try {
            while (rs.next()) {

                sinif.setId(Integer.parseInt(rs.getString(1)));
                sinif.setKapasite(Integer.parseInt(rs.getString(2)));
                sinif.setNo(rs.getString(3));
            }
            rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
            System.out.println("SınıfService findByNo error" + e.getMessage());
        }
        return sinif;
    }

    public List<Sinif> findAll() {
        List<Sinif> siniflar = new ArrayList<>();

        ResultSet rs = Select.getData("SELECT * FROM sinif");

        try {
            while (rs.next()) {
                Sinif sinif = new Sinif();
                sinif.setId(Integer.parseInt(rs.getString(1)));
                sinif.setKapasite(Integer.parseInt(rs.getString(2)));
                sinif.setNo(rs.getString(3));

                if (rs.getString(4) != null) {
                    int ogretmenId = Integer.parseInt(rs.getString(4));
                    ogretmenService = new OgretmenService();
                    Ogretmen ogretmen = ogretmenService.findByIdLazy(ogretmenId);
                    ogretmen.setSinif(sinif);
                    sinif.setOgretmen(ogretmen);
                }
                siniflar.add(sinif);

            }
            rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
            System.out.println("SınıfService findAll error" + e.getMessage());
        }
        return siniflar;
    }

    public static void main(String[] args) {

    }

}
