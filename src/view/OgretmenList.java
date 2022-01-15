package view;

import dto.OgretmenSinifTableDto;
import entitites.Ogretmen;
import entitites.Sinif;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.OgretmenService;
import services.SinifService;
import view.SinifDegistirWindow;

/**
 *
 * @author bedirhan
 */
public class OgretmenList extends javax.swing.JFrame {

    OgretmenService ogretmenService;
    SinifService sinifService;
    SinifDegistirWindow degistirWindow;
    DefaultTableModel model;
    String sinifNo;
    String kapasite;
    String ogretmen;
    List<Ogretmen> sinifsizOgretmenler = new ArrayList<>();
    int guncellemeMi = 0;

    public OgretmenList() {
        initComponents();

        degistirWindow = new SinifDegistirWindow();
        ogretmenService = new OgretmenService();
        sinifService = new SinifService();
        comboBoxSinifListele();
    }

    public void comboBoxSinifListele() {
        jComboBox1.removeAllItems();
        List<Sinif> siniflar = sinifService.findAllByOgretmenIsNull();
        siniflar.forEach(i -> {
            jComboBox1.addItem(i.getNo());
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        adjTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        soyadTextField2 = new javax.swing.JTextField();
        sinifEklejButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        bransjTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ogretmenEklejButton3 = new javax.swing.JButton();
        sinifjTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kres Yonetim");
        setBackground(new java.awt.Color(255, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(50, 123));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Öğretmen Ekle");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Ad");

        adjTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Soyad");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Öğretmensiz Sınıflar");

        soyadTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        sinifEklejButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sinifEklejButton2.setText("<- Sınıf Ekle");
        sinifEklejButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinifEklejButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Öğretmenler");

        bransjTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Branş");

        ogretmenEklejButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ogretmenEklejButton3.setText("Öğretmen Ekle");
        ogretmenEklejButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogretmenEklejButton3ActionPerformed(evt);
            }
        });

        sinifjTextField4.setEditable(false);
        sinifjTextField4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Sınıf");

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Temizle");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton1.setText("Sınıf Değiştir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ogretmenEklejButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4))
                            .addComponent(bransjTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adjTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                            .addComponent(soyadTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sinifjTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sinifEklejButton2))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(135, 135, 135)
                    .addComponent(jLabel6)
                    .addContainerGap(971, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(sinifEklejButton2))
                        .addGap(15, 15, 15)
                        .addComponent(soyadTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(bransjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(sinifjTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ogretmenEklejButton3)
                            .addComponent(jButton4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(jLabel6)
                    .addContainerGap(517, Short.MAX_VALUE)))
        );

        ogretmenEklejButton3.getAccessibleContext().setAccessibleName("Öğretmen Ekle");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void sinifEklejButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinifEklejButton2ActionPerformed
        String ogretmen = jComboBox1.getSelectedItem().toString();
        sinifjTextField4.setText(ogretmen);
        if (guncellemeMi == 1) {
            guncellemeMi = 2;
        }
    }//GEN-LAST:event_sinifEklejButton2ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        List<OgretmenSinifTableDto> ogretmenler = ogretmenService.findAllTableOgretmenSinif();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        ogretmenler.forEach(i -> {
            if (i.getSinifNo() != null) {
                model.addRow(new Object[]{i.getOgretmenId(), i.getOgretmenAdSoyad(), i.getOgretmenBrans(), i.getSinifNo()});
            } else {
                model.addRow(new Object[]{i.getOgretmenId(), i.getOgretmenAdSoyad(), i.getOgretmenBrans(), ""});
            }
        });
    }//GEN-LAST:event_formComponentShown

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        cleanFields();

        model = (DefaultTableModel) jTable1.getModel();
        int index = jTable1.getSelectedRow();
        String ogretmenId = model.getValueAt(index, 0).toString();
        String adSoyad = model.getValueAt(index, 1).toString();
        String brans = model.getValueAt(index, 2).toString();
        String sinifNo = model.getValueAt(index, 3).toString();
        if (sinifNo.equals("")) {
            SinifDegistirWindow.sinifVarMi = false;
        } else {
            SinifDegistirWindow.sinifVarMi = true;
        }

        SinifDegistirWindow.idjTextField3.setText(ogretmenId);
        SinifDegistirWindow.adSoyadjTextField1.setText(adSoyad);
        SinifDegistirWindow.mevcutSinifjTextField2.setText(sinifNo);

    }//GEN-LAST:event_jTable1MouseClicked

    private void ogretmenEklejButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogretmenEklejButton3ActionPerformed
        // TODO add your handling code here:
        String ad = adjTextField1.getText();
        String soyad = soyadTextField2.getText();
        String brans = bransjTextField3.getText();
        String sinifNo = sinifjTextField4.getText();
        Ogretmen ogretmen = new Ogretmen();
        ogretmen.setAd(ad);
        ogretmen.setSoyad(soyad);
        ogretmen.setBrans(brans);

        if (ad.isBlank() || soyad.isBlank() || brans.isBlank()) {
            JOptionPane.showMessageDialog(null, "Alanlar doldurulmalıdır");
            return;
        }
        if (sinifNo.isBlank()) {
            ogretmenService.saveWithoutSinif(ogretmen);
        } else {
            Sinif sinif = sinifService.findByNo(sinifNo);
            Ogretmen newOgretmen = ogretmenService.saveWithSinif(ogretmen, sinif.getId());
        }
        setVisible(false);
        new OgretmenList().setVisible(true);
    }//GEN-LAST:event_ogretmenEklejButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        cleanFields();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        degistirWindow.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void cleanFields() {
        guncellemeMi = 0;
        adjTextField1.setText("");
        soyadTextField2.setText("");
        bransjTextField3.setText("");
        sinifjTextField4.setText("");

        ogretmenEklejButton3.setText("Sınıf Ekle");
    }

    /*
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OgretmenList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adjTextField1;
    private javax.swing.JTextField bransjTextField3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton ogretmenEklejButton3;
    private javax.swing.JButton sinifEklejButton2;
    private javax.swing.JTextField sinifjTextField4;
    private javax.swing.JTextField soyadTextField2;
    // End of variables declaration//GEN-END:variables
}
