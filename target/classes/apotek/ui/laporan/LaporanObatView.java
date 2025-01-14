/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package apotek.ui.laporan;


import apotek.ui.dashboard.ApotekViewUser;
import apotek.models.Obat;
import apotek.ui.MainFrame;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dukhaan
 */
public class LaporanObatView extends javax.swing.JPanel {

    /**
     * Creates new form LaporanObatView
     */
    private MainFrame mainFrame;
    public DefaultTableModel model;
    private List<Obat> obatList;
    private Obat obat;
    
    public LaporanObatView(MainFrame mainFrame) {
        initComponents();
        obatList = obat.getDaftarObat();
        initTable();
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
        btnKembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableObat = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(31, 29, 43));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(241, 240, 242));
        jLabel2.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(241, 240, 242));
        jLabel2.setText("Laporan Obat");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 15, -1, -1));

        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotek.image/button_exit.png"))); // NOI18N
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        jPanel2.add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 30, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 70));

        tableObat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Obat", "Nama Obat", "Harga", "Stok", "Jenis Obat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        for (int columnIndex = 0; columnIndex < tableObat.getColumnCount(); columnIndex++) {
            tableObat.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
        }
        jScrollPane1.setViewportView(tableObat);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 710, 230));
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        mainFrame.showView(mainFrame.viewUser());
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void initTable() {
        model = (DefaultTableModel) tableObat.getModel();
        model.setRowCount(0);

        for (Obat obat : obatList) {
            model.addRow(new Object[]{
                obat.getKode(),
                obat.getNama(),
                obat.getHarga(),
                obat.getStok(),
                obat.getJenis()
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tableObat;
    // End of variables declaration//GEN-END:variables
}
