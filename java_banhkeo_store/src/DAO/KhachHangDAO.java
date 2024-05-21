package DAO;

import DTO.KhachHangDTO;
import DTO.SQLConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class KhachHangDAO {

    SQLConnection connection = new SQLConnection();

    public KhachHangDAO() throws SQLException {
        connection.connect("jdbc:mysql://localhost:3306/qlsieuthimini", "root", "");
    }

    public void them(KhachHangDTO kh) {
        try {
            String query = "INSERT INTO khachhang ( `SDT`, `ten`,`trangthai`) VALUES ('"
                    + kh.getSDT() + "','"
                    + kh.getTen() + "','"
                    + 1
                    + "')";

            System.out.println(query);
            connection.executeUpdate(query);
            System.out.println("Thêm khách hàng thành công");

        } catch (SQLException e) {
            System.out.println("Lỗi khi thêm khách hàng: " + e.getMessage());
        }
    }

    public void update(KhachHangDTO kh) {
        try {
            String query = "UPDATE khachhang SET "
                    + "SDT='" + kh.getSDT() + "', "
                    + "ten='" + kh.getTen() + "', "
                    + "trangthai='" + kh.getTrangThai() + "' "
                    + "WHERE idKhachHang='" + kh.getIdKhachHang() + "'";

            System.out.println(query);
            connection.executeUpdate(query);
            System.out.println("Cập nhật khách hàng thành công");

        } catch (SQLException e) {
            System.out.println("Lỗi khi cập nhật khách hàng: " + e.getMessage());
        }
    }

    public void xoa(int id) {
        try {
            String query = "UPDATE khachhang SET "
                    + "trangthai='" + 0 + "' "
                    + "WHERE idKhachHang='" + id + "'";
            System.out.println(query);
            connection.executeUpdate(query);
            System.out.println("Xóa khách hàng thành công");
        } catch (SQLException e) {
            System.out.println("Lỗi khi xóa khách hàng: " + e.getMessage());
        }
    }

    public KhachHangDTO timkiem(int id) {
        try {
            String query = "SELECT * FROM khachhang WHERE idKhachHang='" + id + "'";
            System.out.println(query);
            ResultSet resultSet = connection.executeQuery(query);
            System.out.println("Tìm kiếm khách hàng thành công");

            if (resultSet.next()) {
                KhachHangDTO kh = new KhachHangDTO();
                kh.setIdKhachHang(resultSet.getInt("idKhachHang"));
                kh.setSDT(resultSet.getString("SDT"));
                kh.setTen(resultSet.getString("ten"));

                return kh;
            } else {
                System.out.println("Không tìm thấy khách hàng với ID: " + id);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi tìm kiếm khách hàng: " + e.getMessage());
        }
        return null;
    }

    public ArrayList<KhachHangDTO> docDSKH() {
        ArrayList<KhachHangDTO> danhSachKhachHang = new ArrayList<>();
        try {
            String query = "SELECT * FROM khachhang";
            System.out.println(query);
            ResultSet resultSet = connection.executeQuery(query);
            while (resultSet.next()) {
                KhachHangDTO khachHang = new KhachHangDTO();
                khachHang.setIdKhachHang(resultSet.getInt("idKhachHang"));
                khachHang.setSDT(resultSet.getString("SDT"));
                khachHang.setTen(resultSet.getString("ten"));
                danhSachKhachHang.add(khachHang);
            }

        } catch (Exception e) {
            System.out.println("Lỗi khi lấy danh sách khách hàng: " + e.getMessage());
        }
        return danhSachKhachHang;
    }

     public static void main(String[] args) {
        try {
            KhachHangDAO khachHangDAO = new KhachHangDAO();

            // Thêm khách hàng
            KhachHangDTO khachHang = new KhachHangDTO();
            khachHang.setSDT("0123456789");
            khachHang.setTen("Nguyen Van A");
            khachHangDAO.them(khachHang);

            // Cập nhật khách hàng
            khachHang.setTen("Nguyen Van B");
            khachHangDAO.update(khachHang);

            // Tìm kiếm khách hàng
            int idKhachHang = 1; // ID của khách hàng cần tìm
            KhachHangDTO khachHangTimKiem = khachHangDAO.timkiem(idKhachHang);
            if (khachHangTimKiem != null) {
                System.out.println("Thông tin khách hàng:");
                System.out.println("ID: " + khachHangTimKiem.getIdKhachHang());
                System.out.println("SDT: " + khachHangTimKiem.getSDT());
                System.out.println("Tên: " + khachHangTimKiem.getTen());
            }

            // Xóa khách hàng
            int idXoa = 2; // ID của khách hàng cần xóa
            khachHangDAO.xoa(idXoa);

            // Đọc danh sách khách hàng
            ArrayList<KhachHangDTO> danhSachKhachHang = khachHangDAO.docDSKH();
            System.out.println("Danh sách khách hàng:");
            for (KhachHangDTO kh : danhSachKhachHang) {
                System.out.println("ID: " + kh.getIdKhachHang());
                System.out.println("SDT: " + kh.getSDT());
                System.out.println("Tên: " + kh.getTen());
                System.out.println("-------------------");
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi kết nối đến cơ sở dữ liệu: " + e.getMessage());
        }
    }
}
