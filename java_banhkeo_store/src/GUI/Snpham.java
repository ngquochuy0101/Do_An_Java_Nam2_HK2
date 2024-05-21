package GUI;

import BUS.SanPhamBUS;
import DAO.CtphieunhapDAO;
import DTO.CtphieunhapDTO;
import DTO.NhanVienDTO;
import DTO.SanPhamDTO;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public final class Snpham extends javax.swing.JPanel {

    SanPhamBUS SanphamBus = new SanPhamBUS();
    SanPhamDTO SanphamDTO = new SanPhamDTO();
    ArrayList<SanPhamDTO> Dssp = new ArrayList<>();
    JFrame f = new JFrame("Chi tiết sản phẩm");

    public Snpham() throws SQLException {
        initComponents();
        SanphamBus = new SanPhamBUS();
        SanphamDTO = new SanPhamDTO();
        Dssp = SanphamBus.docDSSP();
        readdataup(Dssp);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox4 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        tfTiemkiem = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        CobLoai = new javax.swing.JComboBox<>();
        CobThanhphanchinh = new javax.swing.JComboBox<>();
        CobGiaca = new javax.swing.JComboBox<>();
        BtnThem = new javax.swing.JButton();
        CobStyle = new javax.swing.JComboBox<>();
        BtnBoloc = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        tfTiemkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTiemkiemActionPerformed(evt);
            }
        });
        jSplitPane1.setRightComponent(tfTiemkiem);

        jLabel1.setText("Tìm Kiếm");
        jSplitPane1.setLeftComponent(jLabel1);

        jButton1.setText("Tìm kiếm");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        CobLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kiểu/Loại", "Bánh", "Kẹo", "Kem", "Cứng", "Mền", " " }));
        CobLoai.setPreferredSize(new java.awt.Dimension(130, 25));
        CobLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CobLoaiActionPerformed(evt);
            }
        });

        CobThanhphanchinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thành phần chính", "Bánh mì", "Socola", "Kẹo", " " }));
        CobThanhphanchinh.setPreferredSize(new java.awt.Dimension(130, 25));

        CobGiaca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giá Cả", "Cao --> Thấp", "Thấp --> Cao" }));
        CobGiaca.setPreferredSize(new java.awt.Dimension(130, 25));

        BtnThem.setText("THÊM");
        BtnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnThemActionPerformed(evt);
            }
        });

        CobStyle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Style", "Sinh Nhật", "Quà Tặng", "Kỷ Niệm", "Valentine", "Tết Cổ Truyền", "Trung Thu", " " }));
        CobStyle.setPreferredSize(new java.awt.Dimension(130, 25));

        BtnBoloc.setText("Lọc");
        BtnBoloc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBolocActionPerformed(evt);
            }
        });

        jButton2.setText("Tải lại");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CobLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(CobThanhphanchinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(CobGiaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(CobStyle, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jButton1)
                        .addGap(39, 39, 39)
                        .addComponent(jButton2)))
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnBoloc)
                        .addGap(19, 19, 19)))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CobStyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CobGiaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CobThanhphanchinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CobLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBoloc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jScrollPane1.setBorder(null);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setDoubleBuffered(true);
        jScrollPane1.setFocusCycleRoot(true);
        jScrollPane1.setNextFocusableComponent(this);
        jScrollPane1.setOpaque(false);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1040, 1000));
        jScrollPane1.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(null);

        jPanel4.setBackground(new java.awt.Color(204, 153, 0));
        jPanel4.setAlignmentX(1.0F);
        jPanel4.setAlignmentY(1.0F);
        jPanel4.setAutoscrolls(true);
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel4.setName(""); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(130, 32767));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 20));
        jScrollPane1.setViewportView(jPanel4);
        jPanel4.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void readdataup(ArrayList<SanPhamDTO> Dssp) {
        jPanel4.removeAll();

        for (SanPhamDTO sanp : Dssp) {

            Addprod newAddprod;
            try {
                newAddprod = new Addprod(sanp);
//               
                jPanel4.add(newAddprod);
            } catch (IOException ex) {
                Logger.getLogger(Snpham.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        // Thêm đối tượng Addprod vào jPanel4.
        // Cập nhật giao diện để hiển thị thay đổi.
        jPanel4.revalidate();
        jPanel4.repaint();
    }

    public void ShowChitiet(SanPhamDTO pn) throws SQLException {
//        System.out.println(""+pn.getIdSp());
//      JFrame f = new JFrame("Chi tiết sản phẩm");
        Themsanpham pal = new Themsanpham();
        f = new JFrame("Chi tiết sản phẩm");
        f.setLayout(new CardLayout());
        pal.Hienthittsanpham(pn);
        f.add(pal);
//    f.setEnabled(false);
        f.setSize(870, 510);
        f.revalidate();
        f.repaint();

        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }

    public void Tiemkiemsanpham() throws SQLException {
        String value = tfTiemkiem.getText();
        ArrayList<SanPhamDTO> list = new ArrayList<>();
        list.add(SanphamBus.timKiem(Integer.parseInt(value)));
        readdataup(list);

    }

    public void hienthem(SanPhamDTO sp) throws IOException {
        Addprod newAddprod = new Addprod(sp);
//               
        jPanel4.add(newAddprod);
    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_jButton1MouseClicked
public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame j = new JFrame();
                NhanVienDTO nvdto = new NhanVienDTO(15, "mk", "cccd", "nguyen quoc", " huy", "2004-12-10", "0878955654", 1, 1, 100000, 1);
                try {
                    j.add(new Snpham());
                } catch (SQLException ex) {
                    Logger.getLogger(BanHang.class.getName()).log(Level.SEVERE, null, ex);
                }
                j.setSize(780, 600);
                j.setVisible(true);
            }
        });
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


    }//GEN-LAST:event_jButton1ActionPerformed

    private void CobLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CobLoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CobLoaiActionPerformed

    private void BtnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnThemActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        f = new JFrame("Thêm Sản phẩm");
        f.setLayout(new CardLayout());
        f.setSize(870, 510);
        Themsanpham sanp = null;
        try {
            sanp = new Themsanpham();
        } catch (SQLException ex) {
            Logger.getLogger(Snpham.class.getName()).log(Level.SEVERE, null, ex);
        }
        sanp.revalidate();
        sanp.repaint();

        f.add(sanp);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }//GEN-LAST:event_BtnThemActionPerformed


    private void BtnBolocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBolocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBolocActionPerformed

    private void tfTiemkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTiemkiemActionPerformed
        try {
            // TODO add your handling code here:
            Tiemkiemsanpham();
        } catch (SQLException ex) {
            Logger.getLogger(Snpham.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tfTiemkiemActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        readdataup(Dssp);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBoloc;
    private javax.swing.JButton BtnThem;
    private javax.swing.JComboBox<String> CobGiaca;
    private javax.swing.JComboBox<String> CobLoai;
    private javax.swing.JComboBox<String> CobStyle;
    private javax.swing.JComboBox<String> CobThanhphanchinh;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField tfTiemkiem;
    // End of variables declaration//GEN-END:variables
}
