/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import DomainModel.Nhanvien;
import Services.ServiceNhanVien;
import ViewModels.NhanvienView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ngọc Hùng
 */
public class JPanelNhanVien extends javax.swing.JPanel {

    /**
     * Creates new form JPanelBan
     */
    DefaultTableModel _DefaultTableModel;
    ServiceNhanVien _ServiceNV = new ServiceNhanVien();

    public JPanelNhanVien() {
        initComponents();
        trangThai();
        vaitro();
        gioitinh();
        _DefaultTableModel = new DefaultTableModel();
        _ServiceNV = new ServiceNhanVien();
        loadTable(_ServiceNV.getlst());
    }

    void trangThai() {
        cbx_TrangThai.removeAllItems();
        cbx_TrangThai.addItem("Hoạt động");
        cbx_TrangThai.addItem("Không hoạt động");
    }

    void vaitro() {
        cbx_VaiTro.removeAllItems();
        cbx_VaiTro.addItem("Quản lý");
        cbx_VaiTro.addItem("Nhân viên");
    }

    void gioitinh() {
        cbx_GioiTinh.removeAllItems();
        cbx_GioiTinh.addItem("Nam");
        cbx_GioiTinh.addItem("Nữ");
    }

    void loadTable(List<Nhanvien> lst) {
        _DefaultTableModel = (DefaultTableModel) tbl_NhanVien.getModel();
        if (lst.isEmpty()) {
            _DefaultTableModel.setRowCount(0);
            return;
        }
        _DefaultTableModel.setRowCount(0);
        for (Nhanvien x : lst) {
            _DefaultTableModel.addRow(new Object[]{
                x.getMaNhanVien(), x.getTenNhanVien(), x.getGioITinh() == 0 ? "Nam" : "Nữ", x.getDiaChi(), x.getSoDienThoai(), x.getEmail(), x.getNgaySinh(), x.getTaiKhoan(), x.getMatKhau(), x.getVaiTro() == 0 ? "Quản lý" : "Nhân viên", x.getTrangThai() == 1 ? "Hoạt động" : "Không hoạt động"
            });
        }
    }

    NhanvienView getGUI(int style) {
        if (style == 1) {
//            int ID_NhanVien, String diaChi, String email, int gioITinh, String maNhanVien, String matKhau, Date ngaySinh, String soDienThoai, String taiKhoan, String tenNhanVien, int trangThai, int vaiTro
            return new NhanvienView(txt_DiaChi.getText(), txt_Email.getText(), cbx_GioiTinh.getSelectedItem().toString().equals("Nam") ? 0 : 1, txt_MaNV.getText(), txt_MatKhau.getText(), jdc_NgaySinh.getDate(), txt_SDT.getText(), txt_TaiKhoan.getText(), txt_TenNV.getText(), cbx_TrangThai.equals("Online") ? 0 : 1, cbx_VaiTro.getSelectedItem().toString().equals("Quản lý") ? 0 : 1);
        }
        return new NhanvienView(_ServiceNV.getlst().get(tbl_NhanVien.getSelectedRow()).getID_NhanVien(), txt_DiaChi.getText(), txt_Email.getText(), cbx_GioiTinh.getSelectedItem().toString().equals("Nam") ? 0 : 1, txt_MaNV.getText(), txt_MatKhau.getText(), jdc_NgaySinh.getDate(), txt_SDT.getText(), txt_TaiKhoan.getText(), txt_TenNV.getText(), cbx_TrangThai.equals("Online") ? 0 : 1, cbx_VaiTro.getSelectedItem().toString().equals("Quản lý") ? 0 : 1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_NhanVien = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_Them = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        btn_Reset = new javax.swing.JButton();
        txt_DiaChi = new javax.swing.JTextField();
        txt_MaNV = new javax.swing.JTextField();
        txt_TenNV = new javax.swing.JTextField();
        txt_SDT = new javax.swing.JTextField();
        txt_Email = new javax.swing.JTextField();
        txt_TaiKhoan = new javax.swing.JTextField();
        txt_MatKhau = new javax.swing.JPasswordField();
        cbx_TrangThai = new javax.swing.JComboBox<>();
        cbx_VaiTro = new javax.swing.JComboBox<>();
        jdc_NgaySinh = new com.toedter.calendar.JDateChooser();
        cbx_GioiTinh = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(209, 171, 134));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nhân viên");

        tbl_NhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Tên nhâ viên", "Giới tính", "Địa chỉ", "SĐT", "Email", "Ngày sinh", "Tài khoản", "Mật khẩu", "Vai trò", "Trạng thái"
            }
        ));
        tbl_NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_NhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_NhanVien);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã nhân viên :");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Địa chỉ :");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ngày sinh :");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Vai trò :");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tên nhân viên :");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Số điện thoại :");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tài khoản :");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Giới tính :");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Trạng thái :");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email :");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Mật khẩu :");

        btn_Them.setBackground(new java.awt.Color(153, 255, 153));
        btn_Them.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        btn_Them.setText("Thêm");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_Sua.setBackground(new java.awt.Color(153, 255, 255));
        btn_Sua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btn_Sua.setText("Sửa");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        btn_Reset.setBackground(new java.awt.Color(204, 204, 255));
        btn_Reset.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loading.png"))); // NOI18N
        btn_Reset.setText("Reset");

        cbx_TrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbx_VaiTro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbx_GioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_DiaChi)
                                    .addComponent(txt_MaNV)
                                    .addComponent(cbx_VaiTro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jdc_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbx_TrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbx_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_MatKhau))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_Them)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(btn_Reset))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 113, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(txt_MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(txt_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jdc_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(btn_Them)
                    .addComponent(btn_Sua)
                    .addComponent(btn_Reset)
                    .addComponent(cbx_TrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_VaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        // TODO add your handling code here:

        int choose = JOptionPane.showConfirmDialog(this, "Xác nhận!");
        if (choose == 0) {
            _ServiceNV.update(getGUI(1));
            loadTable(_ServiceNV.getlst());
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            return;
        }
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        // TODO add your handling code here:
        if (tbl_NhanVien.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn!");
            return;
        }
        int choose = JOptionPane.showConfirmDialog(this, "Xác nhận!");
        if (choose == 0) {
            _ServiceNV.update(getGUI(2));
            loadTable(_ServiceNV.getlst());
            JOptionPane.showMessageDialog(this, "Sửa thành công");
            return;
        }
        

    }//GEN-LAST:event_btn_SuaActionPerformed

    private void tbl_NhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_NhanVienMouseClicked
        // TODO add your handling code here:
        int index = tbl_NhanVien.getSelectedRow();
//        txt_MaBan.setText(tbl_Ban.getModel().getValueAt(index, 0).toString());
//        cbx_TrangThai.setSelectedItem(tbl_Ban.getModel().getValueAt(index, 1).toString());
        txt_DiaChi.setText(tbl_NhanVien.getModel().getValueAt(index, 3).toString());
        txt_Email.setText(tbl_NhanVien.getModel().getValueAt(index, 5).toString());
        txt_MaNV.setText(tbl_NhanVien.getModel().getValueAt(index, 0).toString());
        txt_MatKhau.setText(tbl_NhanVien.getModel().getValueAt(index, 8).toString());
        txt_SDT.setText(tbl_NhanVien.getModel().getValueAt(index, 4).toString());
        txt_TaiKhoan.setText(tbl_NhanVien.getModel().getValueAt(index, 7).toString());
        txt_TenNV.setText(tbl_NhanVien.getModel().getValueAt(index, 1).toString());
        cbx_VaiTro.setSelectedItem(tbl_NhanVien.getModel().getValueAt(index, 9).toString());
        cbx_GioiTinh.setSelectedItem(tbl_NhanVien.getModel().getValueAt(index, 2).toString());
        cbx_TrangThai.setSelectedItem(tbl_NhanVien.getModel().getValueAt(index, 10).toString());
        try {
            jdc_NgaySinh.setDate(new SimpleDateFormat("yyyy-mm-dd").parse(tbl_NhanVien.getModel().getValueAt(index, 6).toString()));
        } catch (ParseException ex) {
            Logger.getLogger(JPanelNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tbl_NhanVienMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Reset;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JComboBox<String> cbx_GioiTinh;
    private javax.swing.JComboBox<String> cbx_TrangThai;
    private javax.swing.JComboBox<String> cbx_VaiTro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private com.toedter.calendar.JDateChooser jdc_NgaySinh;
    private javax.swing.JTable tbl_NhanVien;
    private javax.swing.JTextField txt_DiaChi;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_MaNV;
    private javax.swing.JPasswordField txt_MatKhau;
    private javax.swing.JTextField txt_SDT;
    private javax.swing.JTextField txt_TaiKhoan;
    private javax.swing.JTextField txt_TenNV;
    // End of variables declaration//GEN-END:variables
}