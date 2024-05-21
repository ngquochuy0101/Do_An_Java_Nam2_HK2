package DAO;

import DTO.ChiTietHoaDonDTO;
import DTO.SQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChiTietHoaDonDAO {

    SQLConnection connection = new SQLConnection();

    public ChiTietHoaDonDAO() throws SQLException {
        connection.connect("jdbc:mysql://localhost:3306/qlsieuthimini", "root", "");
    }

    public void them(ChiTietHoaDonDTO chiTietHoaDon) {
        try {

            String query = "INSERT INTO chitiethoadon (donGia, soLuong, thanhTien, idHoaDon) VALUES "
                    + "(" + chiTietHoaDon.getDonGia() + ", "
                    + chiTietHoaDon.getSoLuong() + ", "
                    + chiTietHoaDon.getThanhTien() + ", "
                    + chiTietHoaDon.getIdHoaDon() + ")";

            System.out.println(query);
            connection.executeUpdate(query);
            System.out.println("Thêm chi tiết hóa đơn thành công");

        } catch (SQLException e) {
            System.out.println("Lỗi khi thêm chi tiết hóa đơn: " + e.getMessage());
        }
    }

    public void sua(ChiTietHoaDonDTO chiTietHoaDon) {
        try {

            String query = "UPDATE chitiethoadon SET "
                    + "donGia=" + chiTietHoaDon.getDonGia() + ", "
                    + "soLuong=" + chiTietHoaDon.getSoLuong() + ", "
                    + "thanhTien=" + chiTietHoaDon.getThanhTien() + ", "
                    + "idHoaDon=" + chiTietHoaDon.getIdHoaDon()
                    + " WHERE idChiTietHoaDon=" + chiTietHoaDon.getIdChiTietHoaDon();

            System.out.println(query);
            connection.executeUpdate(query);
            System.out.println("Cập nhật chi tiết hóa đơn thành công");

        } catch (SQLException e) {
            System.out.println("Lỗi khi cập nhật chi tiết hóa đơn: " + e.getMessage());
        }
    }

    public void xoa(int idChiTietHoaDon) {
        try {

            String query = "DELETE FROM chitiethoadon WHERE idChiTietHoaDon=" + idChiTietHoaDon;

            System.out.println(query);
            connection.executeUpdate(query);
            System.out.println("Xóa chi tiết hóa đơn thành công");

        } catch (SQLException e) {
            System.out.println("Lỗi khi xóa chi tiết hóa đơn: " + e.getMessage());
        }
    }

    public ChiTietHoaDonDTO timKiem(int id) {
        try {
            String query = "SELECT * FROM chitiethoadon WHERE idChiTietHoaDon='" + id + "'";
            System.out.println(query);
            ResultSet resultSet = connection.executeQuery(query);
            System.out.println("Tìm kiếm chi tiết hóa đơn thành công");

            if (resultSet.next()) {
                int idChiTietHoaDon = resultSet.getInt("idChiTietHoaDon");
                int donGia = resultSet.getInt("donGia");
                int soLuong = resultSet.getInt("soLuong");
                int thanhTien = resultSet.getInt("thanhTien");
                int idHoaDon = resultSet.getInt("idHoaDon");

                ChiTietHoaDonDTO chiTietHoaDon = new ChiTietHoaDonDTO(idChiTietHoaDon, donGia, soLuong, thanhTien, idHoaDon);

                return chiTietHoaDon;
            } else {
                System.out.println("Không tìm thấy chi tiết hóa đơn với ID: " + id);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi tìm kiếm chi tiết hóa đơn: " + e.getMessage());
        }
        return null;
    }

    public ArrayList<ChiTietHoaDonDTO> docDSChiTietHoaDon() {
        ArrayList<ChiTietHoaDonDTO> danhSachChiTietHoaDon = new ArrayList<>();

        try {
            String query = "SELECT * FROM chitiethoadon";
            ResultSet resultSet = connection.executeQuery(query);

            while (resultSet.next()) {
                int idChiTietHoaDon = resultSet.getInt("idChiTietHoaDon");
                int donGia = resultSet.getInt("donGia");
                int soLuong = resultSet.getInt("soLuong");
                int thanhTien = resultSet.getInt("thanhTien");
                int idHoaDon = resultSet.getInt("idHoaDon");

                ChiTietHoaDonDTO chiTietHoaDon = new ChiTietHoaDonDTO(idChiTietHoaDon, donGia, soLuong, thanhTien, idHoaDon);

                danhSachChiTietHoaDon.add(chiTietHoaDon);
            }

        } catch (SQLException e) {
            System.out.println("Lỗi khi đọc danh sách chi tiết hóa đơn: " + e.getMessage());
        }

        return danhSachChiTietHoaDon;
    }

    public static void main(String[] args) throws SQLException {
        ChiTietHoaDonDAO chiTietHoaDonDAO = new ChiTietHoaDonDAO();

        // Test thêm chi tiết hóa đơn
        ChiTietHoaDonDTO chiTietHoaDon1 = new ChiTietHoaDonDTO(10000, 2, 20000, 1,1);
        chiTietHoaDonDAO.them(chiTietHoaDon1);

        // Test cập nhật chi tiết hóa đơn
        ChiTietHoaDonDTO chiTietHoaDon2 = new ChiTietHoaDonDTO(1, 15000, 3, 45000, 1);
        chiTietHoaDonDAO.sua(chiTietHoaDon2);

        // Test xóa chi tiết hóa đơn
        int idChiTietHoaDon = 10;
        chiTietHoaDonDAO.xoa(idChiTietHoaDon);

        // Test tìm kiếm chi tiết hóa đơn
        System.out.println(chiTietHoaDonDAO.timKiem(1).getDonGia());

    }
}
