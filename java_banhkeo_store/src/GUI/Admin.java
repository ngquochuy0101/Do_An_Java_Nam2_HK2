package GUI;

import DTO.NhanVienDTO;
import static com.github.weisj.jsvg.geometry.util.GeometryUtil.top;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class Admin extends javax.swing.JFrame {

    public Admin(NhanVienDTO nhanVien) {
        nv = nhanVien;
        initComponents();

        setTitle("Tiệm ĐỒ Ngọt");
        setIconImage();
        hom3.setSVGImage("Image/shop.svg", 90, 90);
        mainchinh.removeAll();
        mainchinh.revalidate();

        mainchinh.add(new QLNV());

    }
    private NhanVienDTO nv;

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("shop.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainchinh = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Title1 = new GUI.jPanelGradient();
        jLabel1 = new javax.swing.JLabel();
        home = new javax.swing.JPanel();
        btn_CTGiamGia = new javax.swing.JButton();
        Thongkebtn = new javax.swing.JButton();
        Nhanvienbtn1 = new javax.swing.JButton();
        btn_GiamGia = new javax.swing.JButton();
        btn_BanHang1 = new javax.swing.JButton();
        hom3 = new GUI.SvgImage1();
        btn_BanHang2 = new javax.swing.JButton();
        Thongkebtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        mainchinh.setBackground(new java.awt.Color(255, 255, 255));
        mainchinh.setPreferredSize(new java.awt.Dimension(760, 470));
        mainchinh.setLayout(new java.awt.CardLayout());
        mainchinh.add(jLabel2, "card2");

        Title1.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabel1.setFont(new java.awt.Font("Poor Richard", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 232, 173));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SWEET SUPERMARKET");
        jLabel1.setMaximumSize(new java.awt.Dimension(900, 28));
        jLabel1.setMinimumSize(new java.awt.Dimension(900, 28));

        javax.swing.GroupLayout Title1Layout = new javax.swing.GroupLayout(Title1);
        Title1.setLayout(Title1Layout);
        Title1Layout.setHorizontalGroup(
            Title1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE)
        );
        Title1Layout.setVerticalGroup(
            Title1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        home.setBackground(new java.awt.Color(167, 255, 244));
        home.setAlignmentX(0.0F);
        home.setAlignmentY(0.0F);
        home.setPreferredSize(new java.awt.Dimension(140, 470));

        btn_CTGiamGia.setBackground(new java.awt.Color(38, 170, 226));
        btn_CTGiamGia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_CTGiamGia.setForeground(new java.awt.Color(255, 255, 255));
        btn_CTGiamGia.setText("CT Giảm Giá");
        btn_CTGiamGia.setPreferredSize(new java.awt.Dimension(130, 40));
        btn_CTGiamGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CTGiamGiaMouseClicked(evt);
            }
        });
        btn_CTGiamGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CTGiamGiaActionPerformed(evt);
            }
        });

        Thongkebtn.setBackground(new java.awt.Color(38, 170, 226));
        Thongkebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Thongkebtn.setForeground(new java.awt.Color(255, 255, 255));
        Thongkebtn.setText("Thoát");
        Thongkebtn.setMaximumSize(new java.awt.Dimension(132, 32));
        Thongkebtn.setMinimumSize(new java.awt.Dimension(120, 30));
        Thongkebtn.setPreferredSize(new java.awt.Dimension(132, 40));
        Thongkebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThongkebtnMouseClicked(evt);
            }
        });
        Thongkebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThongkebtnActionPerformed(evt);
            }
        });

        Nhanvienbtn1.setBackground(new java.awt.Color(38, 170, 226));
        Nhanvienbtn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Nhanvienbtn1.setForeground(new java.awt.Color(255, 255, 255));
        Nhanvienbtn1.setText("QL Nhân Viên");
        Nhanvienbtn1.setMaximumSize(new java.awt.Dimension(32, 32));
        Nhanvienbtn1.setPreferredSize(new java.awt.Dimension(132, 40));
        Nhanvienbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Nhanvienbtn1MouseClicked(evt);
            }
        });
        Nhanvienbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nhanvienbtn1ActionPerformed(evt);
            }
        });

        btn_GiamGia.setBackground(new java.awt.Color(38, 170, 226));
        btn_GiamGia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_GiamGia.setForeground(new java.awt.Color(255, 255, 255));
        btn_GiamGia.setText("Giảm Giá");
        btn_GiamGia.setPreferredSize(new java.awt.Dimension(130, 40));
        btn_GiamGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_GiamGiaMouseClicked(evt);
            }
        });
        btn_GiamGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GiamGiaActionPerformed(evt);
            }
        });

        btn_BanHang1.setBackground(new java.awt.Color(38, 170, 226));
        btn_BanHang1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_BanHang1.setForeground(new java.awt.Color(255, 255, 255));
        btn_BanHang1.setText("QL Sản Phẩm");
        btn_BanHang1.setMaximumSize(new java.awt.Dimension(132, 32));
        btn_BanHang1.setPreferredSize(new java.awt.Dimension(132, 40));
        btn_BanHang1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BanHang1MouseClicked(evt);
            }
        });
        btn_BanHang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BanHang1ActionPerformed(evt);
            }
        });

        btn_BanHang2.setBackground(new java.awt.Color(38, 170, 226));
        btn_BanHang2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_BanHang2.setForeground(new java.awt.Color(255, 255, 255));
        btn_BanHang2.setText("QL Phiếu Nhập");
        btn_BanHang2.setMaximumSize(new java.awt.Dimension(132, 32));
        btn_BanHang2.setPreferredSize(new java.awt.Dimension(132, 40));
        btn_BanHang2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BanHang2MouseClicked(evt);
            }
        });
        btn_BanHang2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BanHang2ActionPerformed(evt);
            }
        });

        Thongkebtn1.setBackground(new java.awt.Color(38, 170, 226));
        Thongkebtn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Thongkebtn1.setForeground(new java.awt.Color(255, 255, 255));
        Thongkebtn1.setText("Thống Kê");
        Thongkebtn1.setMaximumSize(new java.awt.Dimension(132, 32));
        Thongkebtn1.setMinimumSize(new java.awt.Dimension(120, 30));
        Thongkebtn1.setPreferredSize(new java.awt.Dimension(132, 40));
        Thongkebtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Thongkebtn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Thongkebtn1MouseEntered(evt);
            }
        });
        Thongkebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Thongkebtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_BanHang1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_CTGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nhanvienbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_GiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(homeLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(hom3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_BanHang2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Thongkebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Thongkebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hom3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nhanvienbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_GiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_CTGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_BanHang2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_BanHang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Thongkebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Thongkebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title1, javax.swing.GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainchinh, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Title1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addComponent(mainchinh, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BanHang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BanHang1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_BanHang1ActionPerformed

    private void btn_BanHang1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BanHang1MouseClicked
mainchinh.removeAll();
        mainchinh.revalidate();
        try {
            mainchinh.add(new Snpham());        // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_BanHang1MouseClicked

    private void btn_GiamGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GiamGiaActionPerformed
        // TODO add your handling code here:
        mainchinh.removeAll();
        mainchinh.revalidate();
        mainchinh.add(new CTCTGG());
    }//GEN-LAST:event_btn_GiamGiaActionPerformed

    private void btn_GiamGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GiamGiaMouseClicked
        // TODO add your handling code here:
        mainchinh.removeAll();
        mainchinh.revalidate();
        mainchinh.add(new QLGG());
    }//GEN-LAST:event_btn_GiamGiaMouseClicked

    private void Nhanvienbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nhanvienbtn1ActionPerformed
        // TODO add your handling code here:
        mainchinh.removeAll();
        mainchinh.revalidate();
    }//GEN-LAST:event_Nhanvienbtn1ActionPerformed

    private void Nhanvienbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nhanvienbtn1MouseClicked
        mainchinh.removeAll();
        mainchinh.revalidate();
        mainchinh.add(new QLNV());// TODO add your handling code here:
    }//GEN-LAST:event_Nhanvienbtn1MouseClicked

    private void ThongkebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThongkebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThongkebtnActionPerformed

    private void ThongkebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThongkebtnMouseClicked
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_ThongkebtnMouseClicked

    private void btn_CTGiamGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CTGiamGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CTGiamGiaActionPerformed

    private void btn_CTGiamGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CTGiamGiaMouseClicked
        // TODO add your handling code here:
        mainchinh.removeAll();
        mainchinh.revalidate();
        mainchinh.add(new CTCTGG());
    }//GEN-LAST:event_btn_CTGiamGiaMouseClicked

    private void btn_BanHang2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BanHang2MouseClicked
mainchinh.removeAll();
        mainchinh.revalidate();
        try {
            mainchinh.add(new PhieunhapGUI());
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_BanHang2MouseClicked

    private void btn_BanHang2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BanHang2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_BanHang2ActionPerformed

    private void Thongkebtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Thongkebtn1MouseClicked
 mainchinh.removeAll();
        mainchinh.revalidate();
        try {
            mainchinh.add(new ThongKeAdminGUI());        // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Thongkebtn1MouseClicked

    private void Thongkebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Thongkebtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Thongkebtn1ActionPerformed

    private void Thongkebtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Thongkebtn1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Thongkebtn1MouseEntered

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NhanVienDTO nvdto = new NhanVienDTO(15, "mk", "cccd", "nguyen quoc", " huy", "2004-12-10", "0878955654", 1, 1, 100000, 1);

                new Admin(nvdto).setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Nhanvienbtn1;
    private javax.swing.JButton Thongkebtn;
    private javax.swing.JButton Thongkebtn1;
    private javax.swing.JPanel Title1;
    private javax.swing.JButton btn_BanHang1;
    private javax.swing.JButton btn_BanHang2;
    private javax.swing.JButton btn_CTGiamGia;
    private javax.swing.JButton btn_GiamGia;
    private GUI.SvgImage1 hom3;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel mainchinh;
    // End of variables declaration//GEN-END:variables
}
