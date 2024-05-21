package GUI;

import BUS.ThongKeNhanVienBUS;
import java.sql.SQLException;
import javax.swing.JFrame;

public class ThongKeNhanVienGUI extends javax.swing.JPanel {

    private ThongKeNhanVienBUS thongKeNhanVienBUS;

    public ThongKeNhanVienGUI() throws SQLException {
        initComponents();
        thongKeNhanVienBUS = new ThongKeNhanVienBUS();
        ThongKe();
    }

    public void ThongKe() {
        try {
            int soLuongSP = thongKeNhanVienBUS.demSanPham();
            lbTongSanPham.setText(String.valueOf(soLuongSP));
            int soLuongMaKhuyenMai = thongKeNhanVienBUS.demMaKhuyenMai();
            lbTongMaKhuyenMai.setText(String.valueOf(soLuongMaKhuyenMai));
            int soLuongNV = thongKeNhanVienBUS.demNhanVien();
            lbTongNhanVien.setText(String.valueOf(soLuongNV));
            int soLuongKhachHang = thongKeNhanVienBUS.demKhachHang();
            lbTongKhachHang.setText(String.valueOf(soLuongKhachHang));
        } catch (SQLException e) {
        }
    }

    public static void main(String[] args) throws SQLException {
        JFrame frame = new JFrame("Thống Kê Nhân Viên");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ThongKeNhanVienGUI thongKeNhanVienPanel = new ThongKeNhanVienGUI();
        frame.getContentPane().add(thongKeNhanVienPanel);
        frame.pack();
        frame.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lbTongSanPham = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lbTongMaKhuyenMai = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        lbTongNhanVien = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        lbTongKhachHang = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(760, 470));

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(151, 185));
        jPanel3.setPreferredSize(new java.awt.Dimension(360, 300));
        jPanel3.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(0, 255, 51));
        jPanel8.setForeground(new java.awt.Color(0, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(90, 90));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/tkSanPham.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel8);
        jPanel8.setBounds(0, 0, 90, 300);

        jPanel12.setBackground(new java.awt.Color(0, 255, 255));
        jPanel12.setLayout(new java.awt.GridLayout(2, 1));

        lbTongSanPham.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbTongSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTongSanPham.setText("0");
        lbTongSanPham.setToolTipText("");
        lbTongSanPham.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel12.add(lbTongSanPham);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Số lượng sản phẩm");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel12.add(jLabel10);

        jPanel3.add(jPanel12);
        jPanel12.setBounds(90, 0, 270, 300);

        jPanel4.setBackground(new java.awt.Color(0, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(151, 185));
        jPanel4.setPreferredSize(new java.awt.Dimension(360, 300));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 0));
        jPanel9.setForeground(new java.awt.Color(0, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(90, 90));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/coupon.png"))); // NOI18N
        jLabel7.setText("jLabel3");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel7)))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel9, java.awt.BorderLayout.LINE_START);

        jPanel13.setBackground(new java.awt.Color(0, 255, 255));
        jPanel13.setLayout(new java.awt.GridLayout(2, 1));

        lbTongMaKhuyenMai.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbTongMaKhuyenMai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTongMaKhuyenMai.setText("0");
        lbTongMaKhuyenMai.setToolTipText("");
        lbTongMaKhuyenMai.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel13.add(lbTongMaKhuyenMai);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Số lượng mã khuyến mãi");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel13.add(jLabel12);

        jPanel4.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(new java.awt.Color(0, 255, 255));
        jPanel5.setMinimumSize(new java.awt.Dimension(151, 185));
        jPanel5.setPreferredSize(new java.awt.Dimension(360, 300));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));
        jPanel10.setForeground(new java.awt.Color(0, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(90, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/tkNhanVien.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(119, 119, 119))
        );

        jPanel5.add(jPanel10, java.awt.BorderLayout.LINE_START);

        jPanel23.setBackground(new java.awt.Color(0, 255, 255));
        jPanel23.setLayout(new java.awt.GridLayout(2, 1));

        lbTongNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbTongNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTongNhanVien.setText("0");
        lbTongNhanVien.setToolTipText("");
        lbTongNhanVien.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel23.add(lbTongNhanVien);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Đồng nghiệp");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel23.add(jLabel20);

        jPanel5.add(jPanel23, java.awt.BorderLayout.CENTER);

        jPanel7.setBackground(new java.awt.Color(0, 255, 255));
        jPanel7.setMinimumSize(new java.awt.Dimension(151, 185));
        jPanel7.setPreferredSize(new java.awt.Dimension(360, 300));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(0, 102, 102));
        jPanel11.setForeground(new java.awt.Color(0, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(90, 90));

        jLabel8.setText("jLabel3");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/tkKhachHang.png"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(117, 117, 117))
        );

        jPanel7.add(jPanel11, java.awt.BorderLayout.LINE_START);

        jPanel24.setBackground(new java.awt.Color(0, 255, 255));
        jPanel24.setLayout(new java.awt.GridLayout(2, 1));

        lbTongKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbTongKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTongKhachHang.setText("0");
        lbTongKhachHang.setToolTipText("");
        lbTongKhachHang.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel24.add(lbTongKhachHang);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Số lượng khách hàng");
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel24.add(jLabel22);

        jPanel7.add(jPanel24, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbTongKhachHang;
    private javax.swing.JLabel lbTongMaKhuyenMai;
    private javax.swing.JLabel lbTongNhanVien;
    private javax.swing.JLabel lbTongSanPham;
    // End of variables declaration//GEN-END:variables
}
