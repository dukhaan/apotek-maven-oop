/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package apotek.ui.dashboard;

import apotek.ui.MainFrame;
import apotek.ui.auth.LoginView;
import apotek.ui.datakonsumen.DataKonsumenView;
import apotek.ui.dataobat.DataObatView;
import javax.swing.JOptionPane;

/**
 *
 * @author Dukhaan
 */
public class ApotekViewAdmin extends javax.swing.JPanel {

    /**
     * Creates new form ApotekView
     */
    private MainFrame mainFrame;

    public ApotekViewAdmin(MainFrame mainFrame) {
        initComponents();
        this.mainFrame = mainFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        datakonsumen1 = new javax.swing.JButton();
        datakonsumen2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(31, 29, 43));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(241, 240, 242));
        jLabel2.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(241, 240, 242));
        jLabel2.setText("Dashboard Admin");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 17, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotek.image/button_exit.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 30, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 80));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("DATA OBAT");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("DATA KONSUMEN");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        datakonsumen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotek.image/Data barang.png"))); // NOI18N
        datakonsumen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datakonsumen1ActionPerformed(evt);
            }
        });
        add(datakonsumen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 110, 110));

        datakonsumen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotek.image/order_icon_by_dnilvincent333-da226ak.png"))); // NOI18N
        datakonsumen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datakonsumen2ActionPerformed(evt);
            }
        });
        add(datakonsumen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 110, 110));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 200, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void datakonsumen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datakonsumen1ActionPerformed
        mainFrame.showView(new DataObatView(mainFrame));

    }//GEN-LAST:event_datakonsumen1ActionPerformed

    private void datakonsumen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datakonsumen2ActionPerformed
        mainFrame.showView(new DataKonsumenView(mainFrame));
    }//GEN-LAST:event_datakonsumen2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin logout?", "Konfirmasi Logout", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            // Logout
            mainFrame.showView(mainFrame.getLoginView());
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton datakonsumen1;
    private javax.swing.JButton datakonsumen2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
