/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import DomainModel.Khuyenmai;
import DomainModel.Nhanvien;
import Services.ServiceKhuyenMai;
import Services.ServiceNhanVien;
import ViewModels.KhuyenmaiView;
import ViewModels.NhanvienView;
import ViewModels.SanPhamView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class KhuyenMai extends javax.swing.JPanel {
    DefaultTableModel _DefaultTableModel;
    ServiceKhuyenMai _ServiceKM = new ServiceKhuyenMai();
    
    public KhuyenMai() {
        initComponents();
        trangThai();
        _DefaultTableModel = new DefaultTableModel();
        _ServiceKM = new ServiceKhuyenMai();
        loadTable(_ServiceKM.getlst());
    }
    
    void trangThai() {
        cbx_trangthai.removeAllItems();
        cbx_trangthai.addItem("Online");
        cbx_trangthai.addItem("Offline");
    }
    
    void loadTable(List<Khuyenmai> lst) {
        _DefaultTableModel = (DefaultTableModel) tbl_KhuyenMai.getModel();
        if (lst.isEmpty()) {
            _DefaultTableModel.setRowCount(0);
            return;
        }
        _DefaultTableModel.setRowCount(0);
        for (Khuyenmai x : lst) {
            _DefaultTableModel.addRow(new Object[]{
               x.getMaKhuyenMai(),x.getTenKhuyenMai(),x.getNgayBatDau(),x.getNgayKetThuc(),x.getChietKhau(),x.getTrangThai() == 0 ? "Online" : "Offline"
            });
        }
    }
    
    KhuyenmaiView getGUI(int style) {
        if (style == 1) {
//            BigDecimal chietKhau, String maKhuyenMai, Date ngayBatDau, Date ngayKetThuc, String tenKhuyenMai, int trangThai
            return new KhuyenmaiView(Integer.parseInt(txt_ChietKhau.getText()), txt_MaKhuyenMai.getText(), jdc_NgayBatDau.getDate(),jdc_NgayKetThuc.getDate(),txt_TenKhuyenMai.getText(),cbx_trangthai.equals("Online") ? 0 : 1);
        }
//        int chietKhau, String maKhuyenMai, Date ngayBatDau, Date ngayKetThuc, String tenKhuyenMai, int trangThai
        return new KhuyenmaiView(_ServiceKM.getlst().get(tbl_KhuyenMai.getSelectedRow()).getID_KhuyenMai(),Integer.parseInt(txt_ChietKhau.getText()),txt_MaKhuyenMai.getText(),jdc_NgayBatDau.getDate(),jdc_NgayKetThuc.getDate(),txt_TenKhuyenMai.getText(),cbx_trangthai.getSelectedItem().equals("Online") ? 0 : 1);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_KhuyenMai = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jdc_NgayBatDau = new com.toedter.calendar.JDateChooser();
        jdc_NgayKetThuc = new com.toedter.calendar.JDateChooser();
        txt_MaKhuyenMai = new javax.swing.JTextField();
        txt_TenKhuyenMai = new javax.swing.JTextField();
        cbx_trangthai = new javax.swing.JComboBox<>();
        btn_Them = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        btn_Reset = new javax.swing.JButton();
        txt_ChietKhau = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(209, 171, 134));

        tbl_KhuyenMai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M?? Khuy???n M??i", "T??n Khuy???n M??i", "Ng??y B???t ?????u", "Ng??y K???t Th??c", "Chi???t Kh???u", "Tr???ng Th??i"
            }
        ));
        tbl_KhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_KhuyenMaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_KhuyenMai);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Khuy???n m??i");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("M?? Khuy???n M??i");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("T??n khuy???n M??i");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ng??y B???t ?????u");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ng??y K???t Th??c");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Chi???t Kh???u");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tr???ng Th??i");

        txt_TenKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TenKhuyenMaiActionPerformed(evt);
            }
        });

        cbx_trangthai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_Them.setBackground(new java.awt.Color(153, 255, 153));
        btn_Them.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        btn_Them.setText("Th??m");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_Sua.setBackground(new java.awt.Color(153, 255, 255));
        btn_Sua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btn_Sua.setText("S???a");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        btn_Reset.setBackground(new java.awt.Color(204, 204, 255));
        btn_Reset.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loading.png"))); // NOI18N
        btn_Reset.setText("Reset");
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        txt_ChietKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ChietKhauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(53, 53, 53)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_MaKhuyenMai)
                            .addComponent(txt_TenKhuyenMai)
                            .addComponent(jdc_NgayBatDau, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                                        .addComponent(btn_Them))
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(183, 183, 183))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(367, 367, 367)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_ChietKhau)
                                        .addComponent(cbx_trangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jdc_NgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_MaKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_TenKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jdc_NgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jdc_NgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_ChietKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbx_trangthai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 184, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_TenKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TenKhuyenMaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TenKhuyenMaiActionPerformed

    private void txt_ChietKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ChietKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ChietKhauActionPerformed

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        _ServiceKM.create(getGUI(1));
        loadTable(_ServiceKM.getlst());
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        _ServiceKM.update(getGUI(2));
        loadTable(_ServiceKM.getlst());
               
        if (tbl_KhuyenMai.getSelectedRow()< 0)
                {           JOptionPane.showMessageDialog(this, "B???n ph???i ch???n b??n");
            return;
        }

        int choose = JOptionPane.showConfirmDialog(this, "X??c nh???n!");
        if (choose == 0) {
            _ServiceKM.update(getGUI(2));
        loadTable(_ServiceKM.getlst());
            JOptionPane.showMessageDialog(this, "S???a th??nh c??ng!");
            return;
        }
        JOptionPane.showMessageDialog(this, "S???a th???t b???i!");
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void tbl_KhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_KhuyenMaiMouseClicked
        int index = tbl_KhuyenMai.getSelectedRow();
//        txt_MaBan.setText(tbl_Ban.getModel().getValueAt(index, 0).toString());
//        cbx_TrangThai.setSelectedItem(tbl_Ban.getModel().getValueAt(index, 1).toString());
        txt_MaKhuyenMai.setText(tbl_KhuyenMai.getModel().getValueAt(index, 0).toString());
        txt_TenKhuyenMai.setText(tbl_KhuyenMai.getModel().getValueAt(index, 1).toString());
        txt_ChietKhau.setText(tbl_KhuyenMai.getModel().getValueAt(index, 4).toString());
        
        cbx_trangthai.setSelectedItem(tbl_KhuyenMai.getModel().getValueAt(index, 5).toString());
        try {
            jdc_NgayBatDau.setDate(new SimpleDateFormat("yyyy-mm-dd").parse(tbl_KhuyenMai.getModel().getValueAt(index, 2).toString()));
            jdc_NgayKetThuc.setDate(new SimpleDateFormat("yyyy-mm-dd").parse(tbl_KhuyenMai.getModel().getValueAt(index, 3).toString()));
        } catch (ParseException ex) {
            Logger.getLogger(KhuyenMai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbl_KhuyenMaiMouseClicked

    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        // TODO add your handling code here:
        txt_ChietKhau.setText("");
        txt_MaKhuyenMai.setText("");
        txt_TenKhuyenMai.setText("");
    }//GEN-LAST:event_btn_ResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Reset;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JComboBox<String> cbx_trangthai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdc_NgayBatDau;
    private com.toedter.calendar.JDateChooser jdc_NgayKetThuc;
    private javax.swing.JTable tbl_KhuyenMai;
    private javax.swing.JTextField txt_ChietKhau;
    private javax.swing.JTextField txt_MaKhuyenMai;
    private javax.swing.JTextField txt_TenKhuyenMai;
    // End of variables declaration//GEN-END:variables
}
