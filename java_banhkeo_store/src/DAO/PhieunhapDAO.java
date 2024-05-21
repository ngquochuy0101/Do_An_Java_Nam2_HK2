package DAO;

import DTO.CtphieunhapDTO;
import java.sql.ResultSet;
import DTO.PhieunhapDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PhieunhapDAO {

    Connection Connect = null;
    DatabaseConnection connection = new DatabaseConnection();

    public PhieunhapDAO() throws SQLException {
        Connect = connection.connect();
    }

    public void KtID() {

    }

    public ArrayList<PhieunhapDTO> DocDSPN() {
        ArrayList<PhieunhapDTO> DSPN = new ArrayList<>();
        try {
            String docdspn = " select * from phieunhap";
            PreparedStatement Pstmt = Connect.prepareStatement(docdspn);
            ResultSet rs = Pstmt.executeQuery();
            while (rs.next()) {
                PhieunhapDTO pn = new PhieunhapDTO();
                pn.setIdPhieunhap(rs.getString("idPhieunhap"));
                pn.setNgaynhap(rs.getString("ngayLap"));
                pn.setNcc(rs.getString("idNhaCungCap"));
                pn.setIdNhanvien(rs.getString("idnhanvien"));
                pn.setTongtien(rs.getDouble("Tongtien"));
                DSPN.add(pn);

            }

        } catch (Exception e) {
        }
        return DSPN;
    }

    public boolean add(PhieunhapDTO sp) throws SQLException {
        String selectQuery = "SELECT * FROM phieunhap WHERE idPhieuNhap = ?";
        try (PreparedStatement selectStmt = Connect.prepareStatement(selectQuery)) {
            selectStmt.setString(1, sp.getIdPhieunhap());
            ResultSet resultSet = selectStmt.executeQuery();

            if (resultSet.next()) {
                JOptionPane.showMessageDialog(null, "Idphieunhap đã tồn tại!");
//             
            } else {
                String insertQuery = "INSERT INTO phieunhap ( ngayLap, idNhaCungCap, idNhanvien, tongTien) VALUES ( ?, ?, ?, ?)";

                try (PreparedStatement insertStmt = Connect.prepareStatement(insertQuery)) {
//                insertStmt.setString(1, sp.getIdPhieunhap());
                    insertStmt.setString(1, sp.getNgaynhap());
                    insertStmt.setString(2, sp.getNcc());
                    insertStmt.setString(3, sp.getIdNhanvien());
                    insertStmt.setDouble(4, sp.getTongtien());

                    int result = insertStmt.executeUpdate();

                    if (result > 0) {
                        JOptionPane.showMessageDialog(null, "Thêm dữ liệu thành công!");
                        return true;

                    } else {
                        JOptionPane.showMessageDialog(null, "Thêm dữ liệu thất bại!");
                    }
                }
            }
        }
        return false;
    }

    public boolean DeleteData(PhieunhapDTO pn) {
        String queryDeleteCT = "delete from chitietphieunhap where idPhieuNhap = ?";
        try {
            PreparedStatement delpstmt = Connect.prepareStatement(queryDeleteCT);
            delpstmt.setString(1, pn.getIdPhieunhap());
            int rs = delpstmt.executeUpdate();
            if (rs > 0) {
                String queryDeletePN = "delete from phieunhap where idPhieuNhap = ?";
                PreparedStatement xoapn = Connect.prepareStatement(queryDeletePN);
                xoapn.setString(1, pn.getIdPhieunhap());
                int kq = xoapn.executeUpdate();

                return true;
            } else {
                String queryDeletePN = "delete from phieunhap where idPhieuNhap = ?";
                PreparedStatement xoapn = Connect.prepareStatement(queryDeletePN);
                xoapn.setString(1, pn.getIdPhieunhap());
                int kq = xoapn.executeUpdate();
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    public boolean DeleteDataCt(String idphieunhap) {
        String queryDelete = "delete from chitietphieunhap where idSP = ?";
        try (PreparedStatement delpstmt = Connect.prepareStatement(queryDelete)) {
            delpstmt.setString(1, idphieunhap);
            int rs = delpstmt.executeUpdate();
            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Xóa dữ liệu thành công !");
            }
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

//    public ArrayList<PhieunhapDTO> TiemkiemtheoTimeDao(String date) {    
//    }
}
