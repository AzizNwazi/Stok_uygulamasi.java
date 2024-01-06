/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package stokuygulamasi;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author azizn
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        urun_tablosu = new javax.swing.JTable();
        mesaj_alani = new javax.swing.JLabel();
        urun_ekleme_butonu = new javax.swing.JButton();
        urun_alani = new javax.swing.JTextField();
        cb_kategori = new javax.swing.JComboBox<>();
        fiyat_alani = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        urun_guncelle_butonu = new javax.swing.JButton();
        urun_sil_butonu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        urun_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ürürn ", "Kategori", "fiyat"
            }
        ));
        urun_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                urun_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(urun_tablosu);

        mesaj_alani.setForeground(new java.awt.Color(255, 51, 51));

        urun_ekleme_butonu.setText("Ürün Ekle");
        urun_ekleme_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urun_ekleme_butonuActionPerformed(evt);
            }
        });

        cb_kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yemek", "Kültür", "Elektronik" }));

        jLabel1.setText("Ürün ismi :");

        jLabel2.setText("Katekogri: ");

        jLabel3.setText("Fiyat :");

        urun_guncelle_butonu.setText("Ürün Güncelle");
        urun_guncelle_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urun_guncelle_butonuActionPerformed(evt);
            }
        });

        urun_sil_butonu.setText("Ürün Sil");
        urun_sil_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urun_sil_butonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)))
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fiyat_alani)
                                .addComponent(cb_kategori, 0, 145, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(urun_ekleme_butonu, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                .addComponent(urun_guncelle_butonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(urun_sil_butonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(urun_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mesaj_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urun_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(urun_ekleme_butonu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(urun_guncelle_butonu))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fiyat_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(urun_sil_butonu)))
                .addGap(102, 102, 102)
                .addComponent(mesaj_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void urun_ekleme_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urun_ekleme_butonuActionPerformed

        
        mesaj_alani.setText("");
        DefaultTableModel model = (DefaultTableModel)urun_tablosu.getModel();
            
        if(urun_alani.getText().equals("")){
            mesaj_alani.setText("Urun ismi boş birakilamaz");
        }else{
            Object[] eklenecek = {urun_alani.getText(),cb_kategori.getSelectedItem().toString(),fiyat_alani.getText()};
            model.addRow(eklenecek);
        }


    }//GEN-LAST:event_urun_ekleme_butonuActionPerformed

    private void urun_guncelle_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urun_guncelle_butonuActionPerformed

        mesaj_alani.setText("");
        DefaultTableModel model = (DefaultTableModel)urun_tablosu.getModel();
        
        int secili_row = urun_tablosu.getSelectedRow();
        
        if( secili_row == -1){
            
            
            if(urun_tablosu.getRowCount() == 0){
                mesaj_alani.setText("Ürün tablosu şuanda boş...");
            }else{
                mesaj_alani.setText("Lütfen güncellecek bir ürün seçin...");
            }
        }else{
            model.setValueAt(urun_alani.getText(), secili_row, 0);
            model.setValueAt(cb_kategori.getSelectedItem(), secili_row, 1);
            model.setValueAt(fiyat_alani.getText(), secili_row, 2);
            
            mesaj_alani.setText("Ürün başarıyla güncellendi...");
        }


    }//GEN-LAST:event_urun_guncelle_butonuActionPerformed

    private void urun_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urun_tablosuMouseClicked

        DefaultTableModel model = (DefaultTableModel)urun_tablosu.getModel();
        
        int secili_row = urun_tablosu.getSelectedRow();
        
        urun_alani.setText(model.getValueAt(secili_row, 0).toString());
        cb_kategori.setSelectedItem(model.getValueAt(secili_row, 1).toString());
        fiyat_alani.setText(model.getValueAt(secili_row, 2).toString());



    }//GEN-LAST:event_urun_tablosuMouseClicked

    private void urun_sil_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urun_sil_butonuActionPerformed
        DefaultTableModel model = (DefaultTableModel)urun_tablosu.getModel();
        
        int secili_row  = urun_tablosu.getSelectedRow();
        
        if(secili_row == -1){
            if(urun_tablosu.getRowCount() == 0){
                mesaj_alani.setText("Ürün tablosu şaun boş...");
            }else{
                mesaj_alani.setText("Lütfen silinexek ürün seçin...");
            }
        }else{
            model.removeRow(secili_row);
            mesaj_alani.setText("Ürün başariyla silindi...");
        }

    }//GEN-LAST:event_urun_sil_butonuActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_kategori;
    private javax.swing.JTextField fiyat_alani;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mesaj_alani;
    private javax.swing.JTextField urun_alani;
    private javax.swing.JButton urun_ekleme_butonu;
    private javax.swing.JButton urun_guncelle_butonu;
    private javax.swing.JButton urun_sil_butonu;
    private javax.swing.JTable urun_tablosu;
    // End of variables declaration//GEN-END:variables
}
