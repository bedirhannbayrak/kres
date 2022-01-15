package view;

import dto.OgrenciSinifOgretmenTableDto;
import dto.SinifOgretmenDto;
import entitites.Ogrenci;
import entitites.Sinif;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.OgrenciService;
import services.OgretmenService;
import services.SinifService;

/**
 *
 * @author bedirhan
 */
public class OgrenciList extends javax.swing.JFrame {

    OgrenciService ogrenciService;
    SinifService sinifService;
    OgretmenService ogretmenService;

    DefaultTableModel model;

    List<OgrenciSinifOgretmenTableDto> ogrenciler = new ArrayList<>();

    public OgrenciList() {
        initComponents();
        this.setLocationRelativeTo(null);
        ogrenciService = new OgrenciService();
        sinifService = new SinifService();
        ogretmenService = new OgretmenService();
        sinifListele();
    }

    public void sinifListele() {
        sinifComboBox1.removeAllItems();
        List<Sinif> siniflar = sinifService.findAll();
        siniflar.forEach(i -> {
            sinifComboBox1.addItem(i.getNo());
            sinifComboBox2.addItem(i.getNo());
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        adTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sinifComboBox1 = new javax.swing.JComboBox<>();
        soyadTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dogumTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ekleButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        teimzleButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        sinifComboBox2 = new javax.swing.JComboBox<>();
        idTextField3 = new javax.swing.JTextField();
        eskiSinifField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        adTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        degistirButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kres Yonetim");
        setBackground(new java.awt.Color(110, 100, 100));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(150, 150));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Ogrenci Ekle");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Ad", "Soyad", "Sınıf", "Öğretmen"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Ad");

        adTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        adTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Soyad");

        sinifComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sinifComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinifComboBox1ActionPerformed(evt);
            }
        });

        soyadTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Sınıflar");

        dogumTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dogumTextField3.setToolTipText("16-06-1996");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Dogum Yili");

        ekleButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ekleButton3.setText("Ogrenci Ekle");
        ekleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleButton3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Sınıf");

        teimzleButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        teimzleButton4.setText("Temizle");
        teimzleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teimzleButton4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Ogrenci Id");

        sinifComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sinifComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinifComboBox2ActionPerformed(evt);
            }
        });

        idTextField3.setEditable(false);
        idTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        eskiSinifField4.setEditable(false);
        eskiSinifField4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eskiSinifField4.setToolTipText("16-06-1996");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Eski Sınıf");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Sınıf Degistir");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Yeni Sınıf");

        adTextField2.setEditable(false);
        adTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        adTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adSoyadTextField2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Ad Soyad");

        degistirButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        degistirButton1.setText("Sınıf Degistir");
        degistirButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degistirButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(adTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(soyadTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(dogumTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(sinifComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ekleButton3)
                                .addGap(18, 18, 18)
                                .addComponent(teimzleButton4)))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(adTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(idTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(eskiSinifField4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(sinifComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(degistirButton1))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(adTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24)
                        .addComponent(soyadTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(dogumTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7)
                        .addGap(12, 12, 12)
                        .addComponent(sinifComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ekleButton3)
                            .addComponent(teimzleButton4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(12, 12, 12)
                        .addComponent(adTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(24, 24, 24)
                        .addComponent(idTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(eskiSinifField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel10)
                        .addGap(12, 12, 12)
                        .addComponent(sinifComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(degistirButton1)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sinifComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinifComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sinifComboBox1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        List<OgrenciSinifOgretmenTableDto> ogrenciler = ogrenciService.findAllOgrenciSinifOgretmenTableDto();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        ogrenciler.forEach(i -> {
            String ogretmen = "";

            if (i.getOgretmenAdSoyad() != null) {
                ogretmen = i.getOgretmenAdSoyad();
            }
            model.addRow(new Object[]{i.getOgrenciId(), i.getOgrenciAd(), i.getOgrenciSoyad(), i.getSinifNo(), ogretmen});
        });

    }//GEN-LAST:event_formComponentShown

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        cleanFields();

        model = (DefaultTableModel) jTable1.getModel();
        int index = jTable1.getSelectedRow();
        String sinifId = model.getValueAt(index, 0).toString();
        String ad = model.getValueAt(index, 1).toString();
        String soyad = model.getValueAt(index, 2).toString();
        String sinifNo = model.getValueAt(index, 3).toString();
        String ogretmen = model.getValueAt(index, 1).toString();

        adTextField2.setText(ad + " " + soyad);
        idTextField3.setText(sinifId);
        eskiSinifField4.setText(sinifNo);

    }//GEN-LAST:event_jTable1MouseClicked

    private void ekleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleButton3ActionPerformed
        // TODO add your handling code here:
        try {
            Ogrenci ogrenci = new Ogrenci();
            ogrenci.setAd(adTextField1.getText());
            ogrenci.setSoyad(soyadTextField2.getText());
            ogrenci.setDogumYili(Integer.parseInt(dogumTextField3.getText()));
            String sinifNo = sinifComboBox1.getSelectedItem().toString();

            Sinif sinif = sinifService.findByNo(sinifNo);

            SinifOgretmenDto dto = sinifService.findSinifOgretmenDtoBySinifNo(sinifNo);

            ogrenci.setSinif(sinif);
            ogrenci = ogrenciService.save(ogrenci);
            if (dto.getOgretmenAd() != null) {
                sinifService.addOgretmen(sinif.getId(), dto.getOgretmenId());
                ogrenciService.addOgretmen(ogrenci.getId(), dto.getOgretmenId());

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        setVisible(false);
        new OgrenciList().setVisible(true);
    }//GEN-LAST:event_ekleButton3ActionPerformed

    private void teimzleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teimzleButton4ActionPerformed
        cleanFields();
    }//GEN-LAST:event_teimzleButton4ActionPerformed

    private void adTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adTextField1ActionPerformed

    private void sinifComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinifComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sinifComboBox2ActionPerformed

    private void adSoyadTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adSoyadTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adSoyadTextField2ActionPerformed

    private void degistirButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degistirButton1ActionPerformed
        // TODO add your handling code here:

        if (!idTextField3.getText().equals("")) {
            int ogrenciId = Integer.parseInt(idTextField3.getText());
            Sinif sinif = sinifService.findByNo(eskiSinifField4.getText());
            String yeniSinifNo = sinifComboBox2.getSelectedItem().toString();
            ogrenciService.deleteSinifAndOgretmen(ogrenciId);
            ogrenciService.addSinifAndOgretmenBySinifNo(ogrenciId, yeniSinifNo);
            setVisible(false);
            new OgrenciList().setVisible(true);
        }
    }//GEN-LAST:event_degistirButton1ActionPerformed

    public void cleanFields() {
        // TODO add your handling code here:
        adTextField1.setText("");
        soyadTextField2.setText("");
        dogumTextField3.setText("");
    }

    /*
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OgrenciList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adTextField1;
    private javax.swing.JTextField adTextField2;
    private javax.swing.JButton degistirButton1;
    private javax.swing.JTextField dogumTextField3;
    private javax.swing.JButton ekleButton3;
    private javax.swing.JTextField eskiSinifField4;
    private javax.swing.JTextField idTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> sinifComboBox1;
    private javax.swing.JComboBox<String> sinifComboBox2;
    private javax.swing.JTextField soyadTextField2;
    private javax.swing.JButton teimzleButton4;
    // End of variables declaration//GEN-END:variables
}
