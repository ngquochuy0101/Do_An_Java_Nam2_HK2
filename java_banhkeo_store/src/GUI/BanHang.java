/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.SanPhamBUS;
import java.util.Random;

import DTO.KhachHangDTO;
import DTO.NhanVienDTO;
import DTO.SQLConnection;
import DTO.SanPhamDTO;
import java.awt.Dimension;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nguyen Quoc Huy
 */
public class BanHang extends javax.swing.JPanel {

    /**
     * Creates new form Sp
     */
    public BanHang(NhanVienDTO nhanvien) throws SQLException {
        this.dssp = sanPhamBUS1.docDSSP();
        nv = nhanvien;
        initComponents();

    }
    private NhanVienDTO nv = new NhanVienDTO();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Tren = new javax.swing.JPanel();
        btn_them = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_SoLuong = new javax.swing.JFormattedTextField();
        txt_idSP = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_xoa = new javax.swing.JButton();
        btn_CapNhat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_DSSP = new javax.swing.JTable();
        btn_bacham = new javax.swing.JButton();
        Duoi = new javax.swing.JPanel();
        btn_thanhToan = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_tenKhachHang = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_SDTKhachHang = new javax.swing.JFormattedTextField();

        jPanel1.setPreferredSize(new java.awt.Dimension(760, 600));

        Tren.setPreferredSize(new java.awt.Dimension(760, 600));

        btn_them.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_them.setText("Thêm");
        btn_them.setPreferredSize(new java.awt.Dimension(82, 28));
        btn_them.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_themMouseClicked(evt);
            }
        });
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Sản Phẩm");

        jLabel3.setText("Số lượng");

        txt_SoLuong.setPreferredSize(new java.awt.Dimension(64, 26));
        txt_SoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SoLuongActionPerformed(evt);
            }
        });

        txt_idSP.setMinimumSize(new java.awt.Dimension(70, 22));
        txt_idSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idSPActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-cart-50.png"))); // NOI18N
        jLabel1.setText("Giỏ Hàng");

        btn_xoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/remove.png"))); // NOI18N
        btn_xoa.setMnemonic('X');
        btn_xoa.setText("Xóa");
        btn_xoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_xoaMouseClicked(evt);
            }
        });
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_CapNhat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_CapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-write-16.png"))); // NOI18N
        btn_CapNhat.setText("Cập nhật");
        btn_CapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CapNhatMouseClicked(evt);
            }
        });
        btn_CapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CapNhatActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        Table_DSSP.setAutoCreateRowSorter(true);
        Table_DSSP.setBackground(new java.awt.Color(102, 102, 102));
        Table_DSSP.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        Table_DSSP.setForeground(new java.awt.Color(255, 255, 255));
        Table_DSSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Số thứ tự", "Mã Sản Phẩm", "Tên", "Giá", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table_DSSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_DSSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_DSSP);

        btn_bacham.setText("...");
        btn_bacham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_bachamMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout TrenLayout = new javax.swing.GroupLayout(Tren);
        Tren.setLayout(TrenLayout);
        TrenLayout.setHorizontalGroup(
            TrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TrenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(TrenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TrenLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_idSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_bacham, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_xoa)
                        .addGap(29, 29, 29)
                        .addComponent(btn_CapNhat)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        TrenLayout.setVerticalGroup(
            TrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrenLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(TrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_idSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_bacham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_CapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn_thanhToan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_thanhToan.setText("Thanh toán");
        btn_thanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_thanhToanMouseClicked(evt);
            }
        });
        btn_thanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thanhToanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DuoiLayout = new javax.swing.GroupLayout(Duoi);
        Duoi.setLayout(DuoiLayout);
        DuoiLayout.setHorizontalGroup(
            DuoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DuoiLayout.createSequentialGroup()
                .addContainerGap(294, Short.MAX_VALUE)
                .addComponent(btn_thanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        DuoiLayout.setVerticalGroup(
            DuoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DuoiLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btn_thanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Tên Khách Hàng:");
        jLabel5.setToolTipText("");

        txt_tenKhachHang.setToolTipText("");
        txt_tenKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tenKhachHangActionPerformed(evt);
            }
        });

        jLabel6.setText("SĐT Khách Hàng:");
        jLabel6.setToolTipText("");

        txt_SDTKhachHang.setToolTipText("");
        txt_SDTKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SDTKhachHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_SDTKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_tenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Duoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Tren, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tren, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Duoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_tenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_SDTKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 35, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_themActionPerformed

    private void txt_SoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SoLuongActionPerformed

    private void txt_idSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idSPActionPerformed

    private void btn_xoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_xoaMouseClicked
        int i = Table_DSSP.getSelectedRow();
        if (i >= 0) {
            //thieu 1 dong code xoa trong list sp
            gioHang.remove(i);
            model.removeRow(i);
            Table_DSSP.setModel(model);
            int messageType = JOptionPane.INFORMATION_MESSAGE;
            JOptionPane.showMessageDialog(null, "Đã xóa sản phẩm khỏi giỏ hàng!", "Thông báo", messageType);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_xoaMouseClicked

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_xoaActionPerformed
    private void clearFields() {
        txt_idSP.setText("");
        txt_SoLuong.setText("");
        txt_SDTKhachHang.setText("");
        txt_tenKhachHang.setText("");

        DefaultTableModel model = (DefaultTableModel) Table_DSSP.getModel();
        model.setRowCount(0);
    }
    private void btn_thanhToanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_thanhToanMouseClicked
        String ten = txt_tenKhachHang.getText();
        String sdtString = txt_SDTKhachHang.getText();
        KhachHangDTO kh = new KhachHangDTO(1, sdtString, ten, 1);
        khachHang = kh;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame j = new JFrame();
                try {
                    j.add(new ThanhToan_HoaDon(nv, gioHang, khachHang, dssp));
                } catch (SQLException ex) {
                    Logger.getLogger(BanHang.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(BanHang.class.getName()).log(Level.SEVERE, null, ex);
                }
                j.setSize(780, 650);
                j.setLocationRelativeTo(null);
                j.setVisible(true);
                clearFields();
                gioHang = new ArrayList<>();

            }
        });

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_thanhToanMouseClicked
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame j = new JFrame();
                NhanVienDTO nvdto = new NhanVienDTO(15, "mk", "cccd", "nguyen quoc", " huy", "2004-12-10", "0878955654", 1, 1, 100000, 1);
                try {
                    j.add(new BanHang(nvdto));
                } catch (SQLException ex) {
                    Logger.getLogger(BanHang.class.getName()).log(Level.SEVERE, null, ex);
                }
                j.setSize(780, 600);
                j.setVisible(true);
            }
        });
    }

    private void btn_thanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thanhToanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_thanhToanActionPerformed

    private void Table_DSSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_DSSPMouseClicked
        int i = Table_DSSP.getSelectedRow();
        txt_idSP.setText(Table_DSSP.getModel().getValueAt(i, 1).toString());
        txt_SoLuong.setText(Table_DSSP.getModel().getValueAt(i, 4).toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_Table_DSSPMouseClicked
    public void banhang() throws SQLException {
        SanPhamBUS sanPhamBUS = new SanPhamBUS();
        int soLuong = Integer.parseInt(txt_SoLuong.getText());
        int id = Integer.parseInt(txt_idSP.getText());
        //thuc thi sql
        try {
            if (sanPhamBUS.timKiem(id) != null) {
                SanPhamDTO spdto = sanPhamBUS.timKiem(id);
                if (spdto.getSoLuongSpConLai() >= soLuong) {
                    spdto.setSoLuongSpConLai(soLuong);
                    gioHang.add(spdto);
                    int messageType = JOptionPane.INFORMATION_MESSAGE;
                    JOptionPane.showMessageDialog(null, "Đã được thêm vào giỏ hàng", "Thông báo", messageType);
                } else {
                    int messageType = JOptionPane.INFORMATION_MESSAGE;
                    JOptionPane.showMessageDialog(null, "Số lượng quá tồn kho ", "Thông báo", messageType);
                }

            } else {
                int messageType = JOptionPane.INFORMATION_MESSAGE;
                JOptionPane.showMessageDialog(null, "Sản phẩm không tồn tại", "Thông báo", messageType);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BanHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btn_themMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_themMouseClicked
        try {
            // TODO add your handling code here:
            banhang();
        } catch (SQLException ex) {
            Logger.getLogger(BanHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        Vector header = new Vector();
        header.add("STT");
        header.add("Mã Sản Phẩm");
        header.add("Tên Sản Phẩm");
        header.add("Đơn Giá");
        header.add("Số Lượng");
        model = new DefaultTableModel(header, 0);
        model.setRowCount(0);
        int i = 1;
        for (SanPhamDTO sv : gioHang) {
            Vector row = new Vector();
            row.add(i);
            row.add(sv.getIdSP());
            row.add(sv.getTenSP());
            row.add(sv.getDonGia());
            row.add(sv.getSoLuongSpConLai());
            model.addRow(row);
            i = i + 1;
        }
        Table_DSSP.setModel(model);


    }//GEN-LAST:event_btn_themMouseClicked

    private void txt_tenKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tenKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tenKhachHangActionPerformed

    private void txt_SDTKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SDTKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SDTKhachHangActionPerformed

    private void btn_CapNhatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CapNhatMouseClicked
        int i = Table_DSSP.getSelectedRow();
        boolean f = false;
        for (SanPhamDTO sanPham : dssp) {
            if (Integer.parseInt(txt_idSP.getText()) == sanPham.getIdSP()) {
                if (Integer.parseInt(txt_SoLuong.getText()) <= sanPham.getSoLuongSpConLai()) {
                    int id = Integer.parseInt(txt_idSP.getText());
                    int sl = Integer.parseInt(txt_SoLuong.getText());
                    gioHang.get(i).setIdSP(id);
                    gioHang.get(i).setSoLuongSpConLai(sl);
                    f = true;
                }
            }

        }
        if (f == true) {
            int messageType = JOptionPane.INFORMATION_MESSAGE;
            JOptionPane.showMessageDialog(null, "Cập nhật sản phẩm hợp lệ", "Thông báo", messageType);
        } else {
            int messageType = JOptionPane.INFORMATION_MESSAGE;
            JOptionPane.showMessageDialog(null, "Sản phẩm không hợp lệ", "Thông báo", messageType);
        }

        model.setValueAt(gioHang.get(i).getIdSP(), i, 1);
        model.setValueAt(gioHang.get(i).getSoLuongSpConLai(), i, 4);
        Table_DSSP.setModel(model);
// TODO add your handling code here:
    }//GEN-LAST:event_btn_CapNhatMouseClicked

    private void btn_CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CapNhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CapNhatActionPerformed
    private void hienThiDanhSachSanPham() throws SQLException {
        dssp = sanPhamBUS1.docDSSP();

        JTable Table_dssp = new JTable();
        DefaultTableModel model1 = new DefaultTableModel();
        model1.setColumnIdentifiers(new Object[]{"ID Sản Phẩm", "Tên Sản Phẩm", "Đơn Giá"});

        for (SanPhamDTO sp : dssp) {
            Vector<Object> row = new Vector<>();
            row.add(sp.getIdSP());
            row.add(sp.getTenSP());
            row.add(sp.getDonGia());
            model1.addRow(row);
        }

        Table_dssp.setModel(model1);

        JScrollPane scrollPane = new JScrollPane(Table_dssp);
        scrollPane.setPreferredSize(new Dimension(300, 200));

        int result = JOptionPane.showOptionDialog(
                this,
                scrollPane,
                "Danh sách sản phẩm",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                null,
                null
        );

        if (result == JOptionPane.OK_OPTION) {
            DefaultTableModel mainTableModel = (DefaultTableModel) Table_dssp.getModel();
            for (int selectedRow : Table_dssp.getSelectedRows()) {
                SanPhamDTO sp1 = new SanPhamDTO(
                        (int) mainTableModel.getValueAt(selectedRow, 0),
                        (String) mainTableModel.getValueAt(selectedRow, 1),
                        (int) mainTableModel.getValueAt(selectedRow, 2),
                        1
                );
                gioHang.add(sp1);
                Vector header = new Vector();
                header.add("STT");
                header.add("Mã Sản Phẩm");
                header.add("Tên Sản Phẩm");
                header.add("Đơn Giá");
                header.add("Số Lượng");
                model = new DefaultTableModel(header, 0);
                model.setRowCount(0);
                int i = 1;
                for (SanPhamDTO sv : gioHang) {
                    Vector row = new Vector();
                    row.add(i);
                    row.add(sv.getIdSP());
                    row.add(sv.getTenSP());
                    row.add(sv.getDonGia());
                    row.add(sv.getSoLuongSpConLai());
                    model.addRow(row);
                    i = i + 1;
                }
                Table_DSSP.setModel(model);
            }
        }
    }
    private void btn_bachamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bachamMouseClicked
        try {
            // TODO add your handling code here:
            hienThiDanhSachSanPham();
        } catch (SQLException ex) {
            Logger.getLogger(BanHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_bachamMouseClicked
    SanPhamBUS sanPhamBUS1 = new SanPhamBUS();
    DefaultTableModel model = new DefaultTableModel();
    public ArrayList<SanPhamDTO> dssp = sanPhamBUS1.docDSSP();
    public List<SanPhamDTO> gioHang = new ArrayList<>();
    public KhachHangDTO khachHang = new KhachHangDTO();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Duoi;
    private javax.swing.JTable Table_DSSP;
    private javax.swing.JPanel Tren;
    private javax.swing.JButton btn_CapNhat;
    private javax.swing.JButton btn_bacham;
    private javax.swing.JButton btn_thanhToan;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField txt_SDTKhachHang;
    private javax.swing.JFormattedTextField txt_SoLuong;
    private javax.swing.JFormattedTextField txt_idSP;
    private javax.swing.JFormattedTextField txt_tenKhachHang;
    // End of variables declaration//GEN-END:variables
}
