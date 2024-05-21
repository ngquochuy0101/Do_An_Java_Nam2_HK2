package GUI;

import BUS.CtphieunhapBUS;
import BUS.PhieunhapBUS;
import DAO.CtphieunhapDAO;
import DAO.DatabaseConnection;
import DAO.PhieunhapDAO;

import DTO.CtphieunhapDTO;
import DTO.PhieunhapDTO;
import com.toedter.calendar.JDateChooser;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import java.sql.Connection;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

/**
 *
 * @author DELL
 */
public class PhieunhapGUI extends javax.swing.JPanel {

    PhieunhapDAO dao = new PhieunhapDAO();
    PhieunhapBUS PnBus = new PhieunhapBUS();
    ArrayList<PhieunhapDTO> Dspn = new ArrayList<>();
    ArrayList<CtphieunhapDTO> Dsctpn = new ArrayList<>();
    CtphieunhapBUS CtpnBus = new CtphieunhapBUS();
    private final PhieunhapDTO phieunhap;
    private final CtphieunhapDTO ctpn;

    public PhieunhapGUI() throws SQLException {
        initComponents();
        PnBus = new PhieunhapBUS();
        CtpnBus = new CtphieunhapBUS();
        phieunhap = new PhieunhapDTO();
        ctpn = new CtphieunhapDTO();
        Dspn = new ArrayList<>();
        Dsctpn = new ArrayList<>();

    }

    // HIỆN THỊ DỮ LIỆU Lên Table Phiếu nhập
    public void ShowdataTable(ArrayList<PhieunhapDTO> ds) {

        Vector<String> header = new Vector<>();
        header.add("ID Phiếu Nhập");
        header.add("Ngày Nhập");
        header.add("Nhà Cung Cấp");
        header.add("ID Nhân Viên");
        header.add("Tổng Tiền");

        // Tạo DefaultTableModel với header
        DefaultTableModel model = new DefaultTableModel(header, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Trả về false để vô hiệu hóa tính năng chỉnh sửa trực tiếp
                return false;
            }
        };

        for (PhieunhapDTO pn : ds) {
            Vector<Object> row = new Vector<>();
            row.add(pn.getIdPhieunhap());
            row.add(pn.getNgaynhap());
            row.add(pn.getNcc());
            row.add(pn.getIdNhanvien());
            row.add(pn.getTongtien());
            // Thêm hàng vào mô hình
            model.addRow(row);

        }
        TablePhieunhap.setModel(model);

    }

    public void DocDSPN() {
        Vector<String> header = new Vector<>();
        header.add("ID Phiếu Nhập");
        header.add("Ngày Nhập");
        header.add("Nhà Cung Cấp");
        header.add("ID Nhân Viên");
        header.add("Tổng Tiền");

        // Tạo DefaultTableModel với header
        DefaultTableModel model = new DefaultTableModel(header, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Trả về false để vô hiệu hóa tính năng chỉnh sửa trực tiếp
                return false;
            }
        };

        Dspn = PnBus.Docdspn();
        for (PhieunhapDTO pn : Dspn) {
            Vector<Object> row = new Vector<>();
            row.add(pn.getIdPhieunhap());
            row.add(pn.getNgaynhap());
            row.add(pn.getNcc());
            row.add(pn.getIdNhanvien());
            row.add(pn.getTongtien());
            // Thêm hàng vào mô hình
            model.addRow(row);

        }
        TablePhieunhap.setModel(model);

    }

    public static void main(String[] args) throws SQLException {
        JFrame f = new JFrame();

        f.setSize(800, 400);
        PhieunhapGUI sp = new PhieunhapGUI();
        f.add(sp);
        f.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtSoluong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDongia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMasp = new javax.swing.JTextField();
        txtTensp = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        txtTiemkiem = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtIdnv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNcc1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        txtIdphieunhap = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabCtphieunhap = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        ResetBtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePhieunhap = new javax.swing.JTable();
        btnNhap = new javax.swing.JButton();

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/shop.png"))); // NOI18N
        jButton2.setText("Nhập Hàng");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(255, 255, 255));
        setFocusTraversalPolicyProvider(true);
        setPreferredSize(new java.awt.Dimension(900, 504));
        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        txtSoluong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoluongActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("SỐ LƯỢNG :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("ĐƠN GIÁ :");
        jLabel6.setPreferredSize(new java.awt.Dimension(41, 20));

        txtDongia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDongiaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Mã SP:");
        jLabel2.setPreferredSize(new java.awt.Dimension(36, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Tên sản phẩm :");

        txtMasp.setPreferredSize(new java.awt.Dimension(64, 30));
        txtMasp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaspActionPerformed(evt);
            }
        });

        txtTensp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenspActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.png"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtTiemkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiemkiemActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("ID NHÂN VIÊN :");
        jLabel11.setPreferredSize(new java.awt.Dimension(41, 20));

        txtIdnv.setPreferredSize(new java.awt.Dimension(64, 30));
        txtIdnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdnvActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("NCC : ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("ID PHẾU PHẬP :");

        txtNcc1.setPreferredSize(new java.awt.Dimension(64, 30));
        txtNcc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNcc1ActionPerformed(evt);
            }
        });

        jButton5.setText("Tạo Phiếu Nhập");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdnv, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addComponent(txtNcc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIdphieunhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                        .addGap(84, 84, 84)))
                .addGap(54, 54, 54))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(txtIdphieunhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtNcc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtIdnv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton6.setText("Xuất phiếu nhập");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtTiemkiem)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(244, 309, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDongia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMasp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTensp)
                            .addComponent(txtSoluong))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTiemkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtMasp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTensp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(txtDongia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        TabCtphieunhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID CT Phiếu Nhập", "Mã Sản Phẩm", "Số Lượng", "Đơn giá", "Thành Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
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
        TabCtphieunhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabCtphieunhapMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabCtphieunhap);

        jLabel7.setText("Chi Tiết Phiếu Nhập");

        ResetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/circle-of-two-clockwise-arrows-rotation.png"))); // NOI18N
        ResetBtn.setText("RESET");
        ResetBtn.setMaximumSize(new java.awt.Dimension(200, 180));
        ResetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetBtnMouseClicked(evt);
            }
        });
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        jButton3.setText("Nhập Lại");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("XÓA");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        TablePhieunhap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TablePhieunhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID PHIẾU NHẬP", "NGÀY NHẬP", "NCC", "ID NHÂN VIÊN", "TỔNG TIỀN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
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
        TablePhieunhap.setRowHeight(25);
        TablePhieunhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePhieunhapMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablePhieunhap);

        btnNhap.setText("Thêm Sản Phẩm");
        btnNhap.setMaximumSize(new java.awt.Dimension(200, 180));
        btnNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNhapMouseClicked(evt);
            }
        });
        btnNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel2, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtSoluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoluongActionPerformed
        try {
            ThemCtphieunhap();

            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(PhieunhapGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtSoluongActionPerformed


    private void btnNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNhapActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ResetBtnActionPerformed

    private void txtTenspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenspActionPerformed
        // TODO add your handling code here:
        txtDongia.requestFocusInWindow();
    }//GEN-LAST:event_txtTenspActionPerformed

    private void txtDongiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDongiaActionPerformed
        // TODO add your handling code here:
        txtSoluong.requestFocusInWindow();
    }//GEN-LAST:event_txtDongiaActionPerformed

    private void txtTiemkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiemkiemActionPerformed
        // TODO add your handling code here:
        TiemkiemtheoTime();
    }//GEN-LAST:event_txtTiemkiemActionPerformed


    private void ResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnMouseClicked
        // TODO add your handling code here:
        DocDSPN();

    }//GEN-LAST:event_ResetBtnMouseClicked

    private void btnNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhapMouseClicked
        try {
            // TODO add your handling code here:
            ThemCtphieunhap();
        } catch (SQLException ex) {
            Logger.getLogger(PhieunhapGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnNhapMouseClicked

    private void txtMaspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaspActionPerformed
        // TODO add your handling code here:
        txtTensp.requestFocusInWindow();
    }//GEN-LAST:event_txtMaspActionPerformed

    private void txtTenspActionPerFormed(java.awt.event.ActionEvent evt) {
        txtDongia.requestFocusInWindow();
    }

    private void txtDonggiaActionPerformed(java.awt.event.ActionEvent evt) {
        txtSoluong.requestFocusInWindow();
    }

//    Đọc dữ liệu  ct phiếu nhập vừa nhập lên table Chi tiết sản phẩm
    public void DocdulieulenTableC(CtphieunhapDTO pn) {

        CtphieunhapDAO CtpnDAO = new CtphieunhapDAO();
        ArrayList<CtphieunhapDTO> CtpnDTO = CtpnDAO.readData(pn.getIdPhieunhap());

        DefaultTableModel md = (DefaultTableModel) TabCtphieunhap.getModel();
        md.setRowCount(0);

        for (CtphieunhapDTO dto : CtpnDTO) {
            Object[] rdata = {
                dto.getIdCtphieunhhap(),
                dto.getMasp(),
                dto.getTensp(),
                dto.getSoluong(),
                dto.getDongia(),
                dto.getThanhtien()
            };
            System.out.println(dto.getDongia());
            System.out.println(dto.getSoluong());
            md.addRow(rdata);
        }
    }


    private void TablePhieunhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePhieunhapMouseClicked
        // TODO add your handling code here:

        if (evt.getClickCount() == 2) { // kiểm tra xem có phải ấn 2 lần không
//            JTable Target = (JTable) evt.getSource(); // giúp lấy phương thức và thuộc tính của Table
            int row = TablePhieunhap.getSelectedRow();// lấy dòng được chọn

            //Lấy thông tin của dòng được chọn
            String idpn = (String) TablePhieunhap.getModel().getValueAt(row, 0);
            txtIdphieunhap.setText(idpn);
            String ncc = (String) TablePhieunhap.getModel().getValueAt(row, 2);
            txtNcc1.setText(ncc);
            String idnv = (String) TablePhieunhap.getModel().getValueAt(row, 3);
            txtIdnv.setText(idnv);
            CtphieunhapDAO CtpnDAO = new CtphieunhapDAO();
            ArrayList<CtphieunhapDTO> CtpnDTO = CtpnDAO.readData(idpn);

            DefaultTableModel md = (DefaultTableModel) TabCtphieunhap.getModel();
            md.setRowCount(0);

            for (CtphieunhapDTO dto : CtpnDTO) {
                Object[] rdata = {
                    dto.getIdCtphieunhhap(),
                    dto.getMasp(),
                    dto.getTensp(),
                    dto.getSoluong(),
                    dto.getDongia(),
                    dto.getThanhtien()

                };
                System.out.println(dto.getDongia());
                System.out.println(dto.getSoluong());
                md.addRow(rdata);
            }
        } else if (SwingUtilities.isRightMouseButton(evt)) {

            int i = TablePhieunhap.getSelectedRow();

            phieunhap.setIdPhieunhap(TablePhieunhap.getModel().getValueAt(i, 0).toString());
            if (i != -1) {
                JPopupMenu Menu = new JPopupMenu();
                JMenuItem item = new JMenuItem("Xóa");
                item.addActionListener(e -> {
                    PnBus.DeleteData(phieunhap);
                });
                Menu.add(item);
                Menu.show(TablePhieunhap, evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_TablePhieunhapMouseClicked


    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        int i = TablePhieunhap.getSelectedRow();
        if (i > 0) {
            String id = TablePhieunhap.getModel().getValueAt(i, 0).toString();
            int tb = JOptionPane.showConfirmDialog(null, "Xác định xóa phiếu nhập này ?", "xác nhận ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (tb == JOptionPane.YES_OPTION) {
                phieunhap.setIdPhieunhap(TablePhieunhap.getModel().getValueAt(i, 0).toString());
                System.out.println("" + TablePhieunhap.getModel().getValueAt(i, 0).toString());
                PnBus.DeleteData(phieunhap);
            } else {
                System.out.println("đã hủy xóa");
            }

        }
    }//GEN-LAST:event_jButton1MouseClicked


    private void TabCtphieunhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabCtphieunhapMouseClicked
        // TODO add your handling code here:
        if (SwingUtilities.isRightMouseButton(evt)) {

            int i = TabCtphieunhap.getSelectedRow();
            if (i != -1) {
                JPopupMenu Menu = new JPopupMenu();
                JMenuItem item = new JMenuItem("Xóa");
                item.addActionListener(e -> {
                    dao.DeleteDataCt(TabCtphieunhap.getModel().getValueAt(i, 1).toString());
                });
                Menu.add(item);
                Menu.show(TabCtphieunhap, evt.getX(), evt.getY());
            }

        }
        if (SwingUtilities.isLeftMouseButton(evt)) {
            int i = TabCtphieunhap.getSelectedRow();
            if (i >= 0) {
                txtIdphieunhap.setText(TabCtphieunhap.getModel().getValueAt(i, 0).toString());
                txtDongia.setText(TabCtphieunhap.getModel().getValueAt(i, 4).toString());
//                txtNcc.setText(TabCtphieunhap.getModel().getValueAt(i, 0).toString());
                txtMasp.setText(TabCtphieunhap.getModel().getValueAt(i, 1).toString());
                txtSoluong.setText(TabCtphieunhap.getModel().getValueAt(i, 3).toString());
                txtTensp.setText(TabCtphieunhap.getModel().getValueAt(i, 2).toString());
            }
        }
    }//GEN-LAST:event_TabCtphieunhapMouseClicked

    private void imgnspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgnspMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_imgnspMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        resetTxt();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        // Thêm phiếu nhập
        Themphieunhap();


    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtNcc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNcc1ActionPerformed
        // TODO add your handling code here:
        txtIdnv.requestFocusInWindow();
    }//GEN-LAST:event_txtNcc1ActionPerformed

    private void txtIdnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdnvActionPerformed
        // TODO add your handling code here:
        Themphieunhap();

    }//GEN-LAST:event_txtIdnvActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    public void Themphieunhap() {
        if (!txtIdphieunhap.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Có một phiếu nhập đang được chọn, vui lòng bấm nút Nhập Lại");
            return;
        } else {

            try {
                phieunhap.setIdPhieunhap("");
                if (txtNcc1.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập Mã Nhà cung cấp");
                    txtNcc1.requestFocusInWindow();
                    return;
                }
                phieunhap.setNcc(txtNcc1.getText());
                Date date = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String Ngaynhap = dateFormat.format(date);
                phieunhap.setNgaynhap(Ngaynhap);
                if (txtIdnv.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "vui lòng nhập ID nhân viên nhập hàng");
                    txtIdnv.requestFocusInWindow();
                    return;
                }

                phieunhap.setIdNhanvien(txtIdnv.getText());

                PnBus.LuuBus(phieunhap);
            } catch (SQLException ex) {
                Logger.getLogger(PhieunhapGUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void ThemCtphieunhap() throws SQLException {
//           CtphieunhapDTO ctpn = new CtphieunhapDTO();

//        phieunhap.setNcc(txtTensp.getText());
//        Date date = new Date();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        String Ngaynhap = dateFormat.format(date);
//        phieunhap.setNgaynhap(Ngaynhap);
//        phieunhap.setIdNhanvien(txtIdnv.getText());
        String Idsp = txtIdphieunhap.getText().trim();
        if (Idsp.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng Chọn Phiếu nhập để thêm sản phẩm ");
            return;
        } else {
            ctpn.setIdPhieunhap(txtIdphieunhap.getText());
        }

        String masp = txtMasp.getText().trim();
        if (masp.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Mã sản phẩm không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
            txtMasp.requestFocusInWindow();
            return;
        } else {
            ctpn.setMasp(masp);
        }

        if (txtTensp.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Mã sản phẩm không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
            requestFocusInWindow();
            return;
        } else {
            ctpn.setTensp(txtTensp.getText().trim());
        }

        // kiểm tra đơn giá
        double dongia;
        try {
            dongia = Double.parseDouble(txtDongia.getText().trim());
            if (dongia <= 0) {
                JOptionPane.showMessageDialog(null, "Đơn giá phải lớn hơn 0", "Lỗi", JOptionPane.ERROR_MESSAGE);
                txtDongia.requestFocusInWindow();
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Đơn giá không hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ctpn.setDongia(dongia);

        // Kiểm tra số lượng
        int soluong;
        try {
            soluong = Integer.parseInt(txtSoluong.getText().trim());
            if (soluong <= 0) {
                JOptionPane.showMessageDialog(null, "Số lượng phải lớn hơn 0", "Lỗi", JOptionPane.ERROR_MESSAGE);
                txtSoluong.requestFocusInWindow();
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Số lượng không hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ctpn.setSoluong(soluong);
        Double thanhtien = soluong * dongia;
        ctpn.setThanhtien(thanhtien);
//        phieunhap.setTongtien(thanhtien);
        CtpnBus.luuCtpn(ctpn);
        DocdulieulenTableC(ctpn);
//        String gt = txtIdphieunhap.getText();
//        if ("".equals(gt)) {
//            System.out.println("Mã Phieu nhap trống");
//            PnBus.LuuBus(phieunhap);
//            CtpnBus.luuCtpn(ctpn);
//        } else {
//            Ganlink(ctpn);
//            CtpnBus.luuCtpn(ctpn);
//        }

        resetTxt();

    }

    public void Ganlink(CtphieunhapDTO ad) {
        JFileChooser filechooser = new JFileChooser("D:\\Java\\ShopMini\\src\\Image");
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnvalue = filechooser.showOpenDialog(this);
        if (returnvalue == JFileChooser.APPROVE_OPTION) {
            File file = filechooser.getSelectedFile();
            String filepath = file.getAbsolutePath();
            ad.setLink(filepath);
        } else {
            System.out.println("không tìm thấy ảnh");
        }

    }

    public void resetTxt() {
        txtDongia.setText("");
        txtNcc1.setText("");
        txtMasp.setText("");
        txtIdnv.setText("");
        txtSoluong.setText("");
        txtTensp.setText("");
        txtIdphieunhap.setText("");
    }

    public void TiemkiemtheoTime() {
        String date = txtTiemkiem.getText();
        if (date.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nhập thời gian ( yyyy-MMM-dd ) để tiềm kiếm ");
            txtTiemkiem.requestFocusInWindow();
        } else {
            ArrayList<PhieunhapDTO> ds = PnBus.TiemkiemtheoTimeBus(date);
            ShowdataTable(ds);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ResetBtn;
    private javax.swing.JTable TabCtphieunhap;
    private javax.swing.JTable TablePhieunhap;
    private javax.swing.JButton btnNhap;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtDongia;
    private javax.swing.JTextField txtIdnv;
    private javax.swing.JLabel txtIdphieunhap;
    private javax.swing.JTextField txtMasp;
    private javax.swing.JTextField txtNcc1;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextField txtTensp;
    private javax.swing.JTextField txtTiemkiem;
    // End of variables declaration//GEN-END:variables

}
