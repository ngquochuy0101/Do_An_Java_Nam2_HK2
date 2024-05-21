/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.SanPhamBUS;
import DTO.CtphieunhapDTO;
import DTO.SanPhamDTO;
import java.awt.Image;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Themsanpham extends javax.swing.JPanel {

    ArrayList<SanPhamDTO> dssp = new ArrayList();
    SanPhamDTO sp = new SanPhamDTO();
    SanPhamBUS sanphamBus = new SanPhamBUS();

    public Themsanpham() throws SQLException {
        initComponents();
        dssp = new ArrayList();
        sanphamBus = new SanPhamBUS();
        sp = new SanPhamDTO();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tfMasp = new javax.swing.JTextField();
        tfTensp = new javax.swing.JTextField();
        tfGiaca = new javax.swing.JTextField();
        tfSl = new javax.swing.JTextField();
        tfHsd = new javax.swing.JTextField();
        tfNsx = new javax.swing.JTextField();
        CobLoai = new javax.swing.JComboBox<>();
        CobThanhphanchinh = new javax.swing.JComboBox<>();
        linkanh = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        CobStyle = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        mota = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        hienthinut = new javax.swing.JPanel();
        them = new javax.swing.JPanel();
        btnHuy = new javax.swing.JButton();
        btnLuu1 = new javax.swing.JButton();
        chitiet = new javax.swing.JPanel();
        btnXoa = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setEnabled(false);
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Mã Sản phẩm :");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Tên Sản Phẩm :");
        jLabel3.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Số Lượng :");
        jLabel5.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Giá Cả :");
        jLabel1.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Loại Sản Phẩm :");
        jLabel4.setFocusable(false);
        jLabel4.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Thành Phần Chính :");
        jLabel6.setFocusable(false);
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("NSX :");
        jLabel7.setFocusable(false);
        jLabel7.setOpaque(true);

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("HSD :");
        jLabel18.setFocusable(false);
        jLabel18.setOpaque(true);

        tfMasp.setPreferredSize(new java.awt.Dimension(79, 16));
        tfMasp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMaspActionPerformed(evt);
            }
        });

        tfTensp.setPreferredSize(new java.awt.Dimension(79, 16));
        tfTensp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTenspActionPerformed(evt);
            }
        });

        tfGiaca.setPreferredSize(new java.awt.Dimension(79, 16));
        tfGiaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfGiacaActionPerformed(evt);
            }
        });

        tfSl.setPreferredSize(new java.awt.Dimension(79, 16));
        tfSl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSlActionPerformed(evt);
            }
        });

        tfHsd.setPreferredSize(new java.awt.Dimension(79, 16));
        tfHsd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHsdActionPerformed(evt);
            }
        });

        tfNsx.setPreferredSize(new java.awt.Dimension(79, 16));
        tfNsx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNsxActionPerformed(evt);
            }
        });

        CobLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kiểu/Loại", "1", "2", "3", "4", " " }));
        CobLoai.setPreferredSize(new java.awt.Dimension(130, 25));
        CobLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CobLoaiActionPerformed(evt);
            }
        });

        CobThanhphanchinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfSl, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(tfTensp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfGiaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfMasp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNsx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfHsd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CobLoai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CobThanhphanchinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfMasp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CobLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CobThanhphanchinh)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfTensp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfNsx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tfGiaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfHsd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        linkanh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        linkanh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkanhMouseClicked(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Style : ");
        jLabel19.setFocusable(false);
        jLabel19.setOpaque(true);

        CobStyle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Style", "Sinh Nhật", "Quà Tặng", "Kỷ Niệm", "Valentine", "Tết Cổ Truyền", "Trung Thu", " " }));
        CobStyle.setPreferredSize(new java.awt.Dimension(130, 25));

        mota.setColumns(20);
        mota.setRows(5);
        jScrollPane1.setViewportView(mota);

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Mô tả : ");
        jLabel20.setFocusable(false);
        jLabel20.setOpaque(true);

        hienthinut.setLayout(new java.awt.CardLayout());

        btnHuy.setText("Huy");

        btnLuu1.setText("Luu");
        btnLuu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLuu1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout themLayout = new javax.swing.GroupLayout(them);
        them.setLayout(themLayout);
        themLayout.setHorizontalGroup(
            themLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(themLayout.createSequentialGroup()
                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                .addComponent(btnLuu1))
        );
        themLayout.setVerticalGroup(
            themLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(themLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnLuu1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        hienthinut.add(them, "card3");

        btnXoa.setText("Xóa");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        btnLuu.setText("Luu");
        btnLuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLuuMouseClicked(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout chitietLayout = new javax.swing.GroupLayout(chitiet);
        chitiet.setLayout(chitietLayout);
        chitietLayout.setHorizontalGroup(
            chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chitietLayout.createSequentialGroup()
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(btnLuu))
        );
        chitietLayout.setVerticalGroup(
            chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        hienthinut.add(chitiet, "card3");

        jButton1.setText("Đổi ảnh");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(linkanh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CobStyle, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(hienthinut, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CobStyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(linkanh, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hienthinut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfMaspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMaspActionPerformed
        // TODO add your handling code here:
        tfTensp.requestFocusInWindow();
    }//GEN-LAST:event_tfMaspActionPerformed

    private void tfTenspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTenspActionPerformed
        // TODO add your handling code here:
        tfGiaca.requestFocusInWindow();
    }//GEN-LAST:event_tfTenspActionPerformed

    private void tfGiacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfGiacaActionPerformed
        // TODO add your handling code here:
        tfSl.requestFocusInWindow();
    }//GEN-LAST:event_tfGiacaActionPerformed

    private void tfSlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSlActionPerformed
        // TODO add your handling code here:
        CobLoai.requestFocusInWindow();
    }//GEN-LAST:event_tfSlActionPerformed

    private void tfHsdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHsdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHsdActionPerformed

    private void tfNsxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNsxActionPerformed
        // TODO add your handling code here:tf
        tfHsd.requestFocusInWindow();

    }//GEN-LAST:event_tfNsxActionPerformed

    
    public void Themspmoi() throws SQLException{
         hienthinut.add(chitiet);
        sp = new SanPhamDTO();
        sp.setIdSP(Integer.parseInt(tfMasp.getText()));
        sp.setTenSP(tfTensp.getText());
        sp.setDonGia(Integer.parseInt(tfGiaca.getText()));
        sp.setSoLuongSpConLai(Integer.parseInt(tfSl.getText()));
        sp.setNSX(tfNsx.getText());
        sp.setHSD(tfHsd.getText());
        sp.setIdChiTietSP(1);
        sp.setIdLoaiSP(1);
        
        System.out.println("Thêm san phảm");
        sanphamBus.them(sp);
        JOptionPane.showMessageDialog(this, "Thêm Sản phẩm thành công!");
        
         
    }
    // Vô hiệu hóa các thành
    public void Vohieuhoa() {
        // Đặt các thành phần thành không thể chỉnh sửa
        tfMasp.setEditable(false);
        tfTensp.setEditable(false);
        tfGiaca.setEditable(false);
        tfSl.setEditable(false);
        tfNsx.setEditable(false);
        tfHsd.setEditable(false);
        mota.setEditable(false);

        // Đặt các JComboBox thành không thể chỉnh sửa
        CobLoai.setEnabled(false);
        CobThanhphanchinh.setEnabled(false);
        CobStyle.setEnabled(false);
    }

    public void Hienthittsanpham(SanPhamDTO sp) {
        hienthinut.add(them);
        Vohieuhoa();
        tfMasp.setText(String.valueOf(sp.getIdSP()));
        tfTensp.setText(sp.getTenSP());
        tfGiaca.setText(String.valueOf(sp.getDonGia()));
        tfSl.setText(String.valueOf(sp.getSoLuongSpConLai()));
        tfNsx.setText(sp.getNSX());
        tfHsd.setText(sp.getHSD());
        mota.setText(String.valueOf(sp.getIdChiTietSP()));

        // Hiển thị giá trị lên JComboBox
        CobLoai.setSelectedItem(sp.getIdLoaiSP());

        // Hiển thị hình ảnh nếu có
        if (sp.getHinhAnhMinhHoa()!= null && !sp.getHinhAnhMinhHoa().isEmpty()) {
            linkanh.setIcon(ResizeImage(sp.getHinhAnhMinhHoa()));
        } else {
            linkanh.setIcon(null);
        }

    }

    public void hieuhoafiel(){
         // cài đặt lại các fiel có thể chỉnh sửa được
        tfMasp.setEditable(true);
        tfTensp.setEditable(true);
        tfGiaca.setEditable(true);
        tfSl.setEditable(true);
        tfNsx.setEditable(true);
        tfHsd.setEditable(true);
        mota.setEditable(true);
        CobLoai.setEnabled(true);
        CobThanhphanchinh.setEnabled(true);
        CobStyle.setEnabled(true);
    }
    
    
    // Sủa sản phẩm
    public void Suasanpham() throws SQLException {
        hieuhoafiel();
        // lấy giá trị các fiel
        
       
        sp.setIdSP(Integer.parseInt(tfMasp.getText()));
        sp.setTenSP(tfTensp.getText());
        sp.setDonGia(Integer.parseInt(tfGiaca.getText()));
        sp.setSoLuongSpConLai(Integer.parseInt(tfSl.getText()));
        sp.setNSX(tfNsx.getText());
        sp.setHSD(tfHsd.getText());
        sp.setIdChiTietSP(Integer.parseInt(mota.getText()));
        sp.setIdLoaiSP((int) CobLoai.getSelectedItem());
        System.out.println("sua san phảm");
        sanphamBus.capNhat(sp);

    }

    // Hàm xóa sản phẩm
//    public void Xoasanpham(SanphamDTO sp) {
//        
//        
//    }

    private void CobLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CobLoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CobLoaiActionPerformed

    public void Ganlink(SanPhamDTO ad) {
        JFileChooser filechooser = new JFileChooser("D:\\Java\\ShopMini\\src\\Image");
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnvalue = filechooser.showOpenDialog(this);
        if (returnvalue == JFileChooser.APPROVE_OPTION) {
            File file = filechooser.getSelectedFile();
            String filepath = file.getAbsolutePath();
            ad.setHinhAnhMinhHoa(filepath);
        } else {
            System.out.println("không tìm thấy ảnh");
        }

    }
    private void linkanhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkanhMouseClicked
        // TODO add your handling code here:
        Ganlink(sp);
        linkanh.setIcon(ResizeImage(sp.getHinhAnhMinhHoa()));

    }//GEN-LAST:event_linkanhMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        // TODO add your handling code here:
  hieuhoafiel();
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnLuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuMouseClicked
        try {
            // TODO add your handling code here:
            
            Suasanpham();
        } catch (SQLException ex) {
            Logger.getLogger(Themsanpham.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnLuuMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
         Ganlink(sp);
        linkanh.setIcon(ResizeImage(sp.getHinhAnhMinhHoa()));
    }//GEN-LAST:event_jButton1MouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        // TODO add your handling code here:
        sp=new SanPhamDTO();
        sp.setIdSP(Integer.parseInt(tfMasp.getText()));
        try {
            sanphamBus.xoa(sp);
                    JOptionPane.showMessageDialog(this, "Thêm Sản phẩm thành công!");

        } catch (SQLException ex) {
            Logger.getLogger(Themsanpham.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnLuu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuu1MouseClicked
        try {
            // TODO add your handling code here:
            Themspmoi();
            
        } catch (SQLException ex) {
            Logger.getLogger(Themsanpham.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLuu1MouseClicked
    public ImageIcon ResizeImage(String filepath) {
        ImageIcon MyImg = new ImageIcon(filepath);
        Image img = MyImg.getImage();
        Image newImg = img.getScaledInstance(265, 305, Image.SCALE_SMOOTH); // Đặt kích thước hình ảnh
        return new ImageIcon(newImg);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CobLoai;
    private javax.swing.JComboBox<String> CobStyle;
    private javax.swing.JComboBox<String> CobThanhphanchinh;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnLuu1;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnXoa;
    private javax.swing.JPanel chitiet;
    private javax.swing.JPanel hienthinut;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel linkanh;
    private javax.swing.JTextArea mota;
    private javax.swing.JTextField tfGiaca;
    private javax.swing.JTextField tfHsd;
    private javax.swing.JTextField tfMasp;
    private javax.swing.JTextField tfNsx;
    private javax.swing.JTextField tfSl;
    private javax.swing.JTextField tfTensp;
    private javax.swing.JPanel them;
    // End of variables declaration//GEN-END:variables
}
