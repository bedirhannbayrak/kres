/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dto.OgrenciSinifOgretmenTableDto;
import dto.OgretmenSinifTableDto;
import entitites.Sinif;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.OgrenciService;
import services.OgretmenService;
import services.SinifService;

/**
 *
 * @author bedirhan
 */
public class Home extends javax.swing.JFrame {

    ArrayList<JFrame> ScreenList = new ArrayList<>();
    OgretmenService ogretmenService;
    OgrenciService ogrenciService;
    SinifService sinifService;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
        ogretmenService = new OgretmenService();
        sinifService = new SinifService();
        ogrenciService = new OgrenciService();
        ogretmenListele();
        ogrenciListele();
        sinifListele();
    }

    public void ogretmenListele() {
        List<OgretmenSinifTableDto> ogretmenler = ogretmenService.findAllTableOgretmenSinif();
        DefaultTableModel model = (DefaultTableModel) ogretmenTable.getModel();

        ogretmenler.forEach(i -> {
            if (i.getSinifNo() != null) {
                model.addRow(new Object[]{i.getOgretmenId(), i.getOgretmenAdSoyad(), i.getOgretmenBrans(), i.getSinifNo()});
            } else {
                model.addRow(new Object[]{i.getOgretmenId(), i.getOgretmenAdSoyad(), i.getOgretmenBrans(), ""});
            }
        });
    }

    public void ogrenciListele() {
        List<OgrenciSinifOgretmenTableDto> ogrenciler = ogrenciService.findAllOgrenciSinifOgretmenTableDto();
        DefaultTableModel model = (DefaultTableModel) ogrenciTable.getModel();

        ogrenciler.forEach(i -> {
            String ogretmen = "";

            if (i.getOgretmenAdSoyad() != null) {
                ogretmen = i.getOgretmenAdSoyad();
            }
            model.addRow(new Object[]{i.getOgrenciId(), i.getOgrenciAd(), i.getOgrenciSoyad(), i.getSinifNo(), ogretmen});
        });
    }

    public void sinifListele() {
        List<Sinif> tumSiniflar = sinifService.findAll();
        DefaultTableModel model = (DefaultTableModel) sinifTable.getModel();

        tumSiniflar.forEach(i -> {
            if (i.getOgretmen() != null) {
                model.addRow(new Object[]{i.getId(), i.getNo(), i.getKapasite(), i.getOgretmen().getAd() + " " + i.getOgretmen().getSoyad()});
            } else {
                model.addRow(new Object[]{i.getId(), i.getNo(), i.getKapasite()});
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ogretmenTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ogrenciTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        sinifTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kres Yonetim");
        setBackground(new java.awt.Color(255, 51, 51));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 0, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Çıkış");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton1.setText("Sınıf Yönetim");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton2.setText("Öğretmen Yönetim");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton3.setText("Öğrenci Yönetim");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setText("Kreş Yönetim Uygulaması");

        ogretmenTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Ad Soyad", "Brans", "Sınıf"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ogretmenTable.setRowHeight(25);
        jScrollPane1.setViewportView(ogretmenTable);
        if (ogretmenTable.getColumnModel().getColumnCount() > 0) {
            ogretmenTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            ogretmenTable.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        ogrenciTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Ad", "Soyad", "Sınıf", "Öğretmen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ogrenciTable.setRowHeight(25);
        jScrollPane2.setViewportView(ogrenciTable);
        if (ogrenciTable.getColumnModel().getColumnCount() > 0) {
            ogrenciTable.getColumnModel().getColumn(0).setPreferredWidth(12);
            ogrenciTable.getColumnModel().getColumn(1).setPreferredWidth(15);
            ogrenciTable.getColumnModel().getColumn(2).setPreferredWidth(15);
            ogrenciTable.getColumnModel().getColumn(3).setPreferredWidth(5);
            ogrenciTable.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        sinifTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Sınıf No", "Kapasite", "Öğretmen"
            }
        ));
        jScrollPane3.setViewportView(sinifTable);
        if (sinifTable.getColumnModel().getColumnCount() > 0) {
            sinifTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            sinifTable.getColumnModel().getColumn(1).setPreferredWidth(15);
            sinifTable.getColumnModel().getColumn(2).setPreferredWidth(15);
        }

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel2.setText("Öğretmenler");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel3.setText("Öğrenciler");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel4.setText("Sınıflar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(249, 249, 249)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                            .addComponent(jLabel3))
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        falseVisibleFrames();
        JFrame ogretmen = new OgretmenList();
        ogretmen.setVisible(true);
        ScreenList.add(ogretmen);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Çıkış Yapılıyor", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        falseVisibleFrames();
        JFrame sinifList = new SinifList();
        sinifList.setVisible(true);
        ScreenList.add(sinifList);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        falseVisibleFrames();
        JFrame ogrenciList = new OgrenciList();
        ogrenciList.setVisible(true);
        ScreenList.add(ogrenciList);


    }//GEN-LAST:event_jButton3ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        falseVisibleFrames();
    }//GEN-LAST:event_formComponentShown

    public void falseVisibleFrames() {
        try {
            for (JFrame screen : ScreenList) {
                screen.setVisible(false);
            }
        } catch (Exception e) {
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable ogrenciTable;
    private javax.swing.JTable ogretmenTable;
    private javax.swing.JTable sinifTable;
    // End of variables declaration//GEN-END:variables
}
