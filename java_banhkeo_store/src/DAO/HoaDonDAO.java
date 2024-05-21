package DAO;

import DTO.HoaDonDTO;
import DTO.SQLConnection;
import DTO.SanPhamDTO;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class HoaDonDAO {

    SQLConnection connection = new SQLConnection();

    public HoaDonDAO() throws SQLException {
        connection.connect("jdbc:mysql://localhost:3306/qlsieuthimini", "root", "");

    }

    /**
     *
     * @param hd
     */
    public void them(HoaDonDTO hd) {
        try {
            String query = "INSERT INTO hoadon ( `tongTien`, `tienGiamGia`, `ngayLap`, `idNhanVien`, `idKhachHang`) VALUES ('"
                    + hd.getTongTien() + "','"
                    + hd.getTienGiamGia() + "','"
                    + hd.getNgayLap() + "','"
                    + hd.getIdNhanVien() + "','"
                    + hd.getIdKhachHang()
                    + "')";

            System.out.println(query);
            connection.executeUpdate(query);
            System.out.println("Thêm hóa đơn thành công");

        } catch (SQLException e) {
            System.out.println("Lỗi khi thêm hóa đơn: " + e.getMessage());
        }
    }

    public void capnhat(HoaDonDTO hd) {
        try {
            String query = "UPDATE hoadon SET "
                    + "tongTien='" + hd.getTongTien() + "', "
                    + "tienGiamGia='" + hd.getTienGiamGia() + "', "
                    + "ngayLap='" + hd.getNgayLap() + "', "
                    + "idNhanVien='" + hd.getIdNhanVien() + "', "
                    + "idKhachHang='" + hd.getIdKhachHang()
                    + "WHERE idHoaDon='" + hd.getIdHoaDon() + "'";

            System.out.println(query);
            connection.executeUpdate(query);
            System.out.println("Cập nhật hóa đơn thành công");

        } catch (SQLException e) {
            System.out.println("Lỗi khi cập nhật hóa đơn: " + e.getMessage());
        }
    }

    public void xoa(HoaDonDTO hd) {
        try {
            String query = "DELETE FROM hoadon WHERE idHoaDon='" + hd.getIdHoaDon() + "'";

            System.out.println(query);
            connection.executeUpdate(query);
            System.out.println("Xóa hóa đơn thành công");

        } catch (SQLException e) {
            System.out.println("Lỗi khi xóa hóa đơn: " + e.getMessage());
        }
    }

    public HoaDonDTO timKiem(int idHoaDon) {
        try {
            String query = "SELECT * FROM hoadon WHERE idHoaDon='" + idHoaDon + "'";
            System.out.println(query);
            ResultSet resultSet = connection.executeQuery(query);
            if (resultSet.next()) {
                HoaDonDTO hd = new HoaDonDTO();
                hd.setIdHoaDon(resultSet.getInt("idHoaDon"));
                hd.setTongTien(resultSet.getInt("tongTien"));
                hd.setTienGiamGia(resultSet.getInt("tienGiamGia"));
                hd.setNgayLap(resultSet.getString("ngayLap"));
                hd.setIdNhanVien(resultSet.getInt("idNhanVien"));
                hd.setIdKhachHang(resultSet.getInt("idKhachHang"));

                return hd;
            }

        } catch (SQLException e) {
            System.out.println("Lỗi khi tìm kiếm hóa đơn: " + e.getMessage());
        }

        return null;
    }

    public ArrayList<HoaDonDTO> timIdHoaDon(int idHoaDon) throws SQLException {
        ArrayList<HoaDonDTO> listHoaDon = new ArrayList<>();
        try {
            String query = "SELECT * FROM hoadon WHERE idHoaDon = ?"; // tạo placeholder
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, idHoaDon); // 1 chính là tham số thay thế ?
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                HoaDonDTO hd = new HoaDonDTO();
                hd.setIdHoaDon(result.getInt("idHoaDon"));
                hd.setIdNhanVien(result.getInt("idNhanVien"));
                hd.setIdKhachHang(result.getInt("idKhachHang"));
                hd.setNgayLap(result.getString("ngayLap"));
                hd.setTongTien(result.getInt("tongTien"));
                listHoaDon.add(hd);
            }
        } catch (SQLException e) {
        }
        return listHoaDon;
    }

    public ArrayList<HoaDonDTO> timHoaDonTheoNgay(String batDau, String ketThuc) throws SQLException {
        ArrayList<HoaDonDTO> listHoaDon = new ArrayList<>();
        try {
            String query = "SELECT * FROM hoadon WHERE ngayLap BETWEEN ? AND ?"; // tạo placeholder
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, batDau); // 1 là tham số đầu tiên câu query
            statement.setString(2, ketThuc); // 2 là tham số thứ 2 câu query
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                HoaDonDTO hd = new HoaDonDTO();
                hd.setIdHoaDon(result.getInt("idHoaDon"));
                hd.setIdNhanVien(result.getInt("idNhanVien"));
                hd.setIdKhachHang(result.getInt("idKhachHang"));
                hd.setNgayLap(result.getString("ngayLap"));
                hd.setTongTien(result.getInt("tongTien"));
                listHoaDon.add(hd);
            }
        } catch (SQLException e) {
        }
        return listHoaDon;
    }

    public ArrayList<HoaDonDTO> docDSHoaDon() {
        ArrayList<HoaDonDTO> danhSachHoaDon = new ArrayList<>();

        try {
            String query = "SELECT * FROM hoadon";
            ResultSet resultSet = connection.executeQuery(query);

            while (resultSet.next()) {
                HoaDonDTO hd = new HoaDonDTO();
                hd.setIdHoaDon(resultSet.getInt("idHoaDon"));
                hd.setTongTien(resultSet.getInt("tongTien"));
                hd.setTienGiamGia(resultSet.getInt("tienGiamGia"));
                hd.setNgayLap(resultSet.getString("ngayLap"));
                hd.setIdNhanVien(resultSet.getInt("idNhanVien"));
                hd.setIdKhachHang(resultSet.getInt("idKhachHang"));

                danhSachHoaDon.add(hd);
            }

        } catch (SQLException e) {
            System.out.println("Lỗi khi đọc danh sách hóa đơn: " + e.getMessage());
        }

        return danhSachHoaDon;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public  void them1(HoaDonDTO hoadon) throws SQLException{
        String qryString= "Insert into hoadon (`idHoaDon`,`tongtien`,`tiengiamgia`,`ngaylap`,`tongtien`) values(`"
                +hoadon.getIdHoaDon()+"`,`"
                +hoadon.getTongTien()+"`,`"
                +hoadon.getTienGiamGia()+"`,`"
                +hoadon.getNgayLap()+"`,`"
                +hoadon.getTongTien()+"`"
                + ")";
        connection.executeUpdate(qryString);
    }

    public static void main(String[] args) throws SQLException {
        HoaDonDTO hoaDonDTO = new HoaDonDTO(11, 10, 10, "2024-01-02 10:00:0", 1, 1);
        HoaDonDAO hoaDonDao = new HoaDonDAO();
        hoaDonDao.them(hoaDonDTO);
        hoaDonDao.xoa(hoaDonDTO);
        HoaDonDTO hdt = hoaDonDao.timKiem(1);
        System.out.println(hdt.getIdKhachHang());
    }
}
