package DAO;

import DTO.SQLConnection;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ThongKeNhanVienDAO {

    private final SQLConnection connection;

    public ThongKeNhanVienDAO() throws SQLException {
        connection = new SQLConnection();
        connection.connect("jdbc:mysql://localhost:3306/qlsieuthimini", "root", "");
    }

    public int demSanPham() throws SQLException {
        String querySanPham = "SELECT COUNT(*) FROM sanpham";
        try (ResultSet resultSanPham = connection.executeQuery(querySanPham)) {
            if (resultSanPham.next()) {
                return resultSanPham.getInt(1);
            }
        }
        return 0;
    }

    public int demMaKhuyenMai() throws SQLException {
        String queryMaKhuyenMai = "SELECT COUNT(*) FROM chuongtrinhgiamgia";
        try (ResultSet resultMaKhuyenMai = connection.executeQuery(queryMaKhuyenMai)) {
            if (resultMaKhuyenMai.next()) {
                return resultMaKhuyenMai.getInt(1);
            }
        }
        return 0;
    }

    public int demNhanVien() throws SQLException {
        String query = "SELECT COUNT(*) - 1 FROM nhanvien WHERE chucVu = 0";
        try (ResultSet result = connection.executeQuery(query)) {
            if (result.next()) {
                return result.getInt(1);
            }
        }
        return 0;
    }

    public int demKhachHang() throws SQLException {
        String queryKhachHang = "SELECT COUNT(*) FROM khachhang";
        try (ResultSet resultKhachHang = connection.executeQuery(queryKhachHang)) {
            if (resultKhachHang.next()) {
                return resultKhachHang.getInt(1);
            }
        }
        return 0;
    }
}
