package DAO;

import DTO.SQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ThongKeAdminDAO {

    private final SQLConnection connection;

    public ThongKeAdminDAO() throws SQLException {
        connection = new SQLConnection();
        connection.connect("jdbc:mysql://localhost:3306/qlsieuthimini", "root", "");
    }

    public int demSanPham() throws SQLException {
        String querySanPham = "SELECT COUNT(*) FROM sanpham";
        ResultSet resultSanPham = connection.executeQuery(querySanPham);
        int dem = 0;
        if (resultSanPham.next()) {
            dem = resultSanPham.getInt(1);
        }
        return dem;
    }

    public int demHoaDon() throws SQLException {
        String queryHoaDon = "SELECT COUNT(*) FROM hoadon";
        ResultSet resultHoaDon = connection.executeQuery(queryHoaDon);
        int dem = 0;
        if (resultHoaDon.next()) {
            dem = resultHoaDon.getInt(1);
        }
        return dem;
    }

    public int demNhanVien() throws SQLException {
        String queryNhanVien = "SELECT COUNT(*) FROM nhanvien";
        ResultSet resultNhanVien = connection.executeQuery(queryNhanVien);
        int dem = 0;
        if (resultNhanVien.next()) {
            dem = resultNhanVien.getInt(1);
        }
        return dem;
    }

    // Hàm tính tổng doanh thu của một quý
    public int getTongThuQuy(int nam, int quy) throws SQLException {
        String[] kq = getDateString(nam, quy);
        String BatDau = kq[0];
        String KetThuc = kq[1];
        String query = "SELECT SUM(tongTien) FROM hoadon WHERE ngayLap >= ? AND ngayLap <= ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, BatDau);
            ps.setString(2, KetThuc);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
        }
        return 0;
    }

    // Hàm lấy ngày bắt đầu và kết thúc của từng quý
    public String[] getDateString(int nam, int quy) {
        String thangBatDau = "";
        String thangKetThuc = "";
        int ngayKetThuc = 31;
        String[] kq = new String[2];
        switch (quy) {
            case 1:
                thangBatDau = "01";
                thangKetThuc = "03";
                ngayKetThuc = 31;
                break;
            case 2:
                thangBatDau = "04";
                thangKetThuc = "06";
                ngayKetThuc = 30;
                break;
            case 3:
                thangBatDau = "07";
                thangKetThuc = "09";
                ngayKetThuc = 30;
                break;
            case 4:
                thangBatDau = "10";
                thangKetThuc = "12";
                ngayKetThuc = 31;
                break;
        }

        String BatDau = Integer.toString(nam) + thangBatDau + "01";
        String KetThuc = Integer.toString(nam) + thangKetThuc + (ngayKetThuc < 10 ? "0" + ngayKetThuc : Integer.toString(ngayKetThuc));
        kq[0] = BatDau;
        kq[1] = KetThuc;
        return kq;
    }
}
