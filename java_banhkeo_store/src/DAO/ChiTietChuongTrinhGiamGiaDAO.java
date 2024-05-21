package DAO;

import DTO.ChiTietChuongTrinhGiamGiaDTO;
import DTO.SQLConnection;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChiTietChuongTrinhGiamGiaDAO {

    SQLConnection connection = new SQLConnection();

    public ChiTietChuongTrinhGiamGiaDAO() throws SQLException {
        connection.connect("jdbc:mysql://localhost:3306/qlsieuthimini", "root", "");
    }

    public void them(ChiTietChuongTrinhGiamGiaDTO ct) {
        try {

            String query = "INSERT INTO chitietchuongtrinhgiamgia ( `loaiGiam`, `soTienGiam`, `phanTramGiam`, `idChuongTrinh`, `idSanPham`) VALUES ('"
                    + ct.getLoaiGiam() + "','"
                    + ct.getSoTienGiam() + "','"
                    + ct.getPhanTramGiam() + "','"
                    + ct.getIdChuongTrinh() + "','"
                    + ct.getIdSanPham()
                    + "')";

            System.out.println(query);
            connection.executeUpdate(query);
            System.out.println("Thêm chi tiết chương trình giảm giá thành công");

        } catch (SQLException e) {
            System.out.println("Lỗi khi thêm chi tiết chương trình giảm giá: " + e.getMessage());
        }
    }

    
    public void xoa(int id_CT, int ID_SP){
            try {
            String query = "DELETE FROM chitietchuongtrinhgiamgia WHERE idChuongTrinh='" +id_CT + "' AND idSanPham='" +ID_SP+"'" ;

            System.out.println(query);
            connection.executeUpdate(query);
            System.out.println("Xóa chương trình giảm giá thành công");

        } catch (SQLException e) {
            System.out.println("Lỗi khi xóa chương trình giảm giá: " + e.getMessage());
        }
    }
    
    public void capnhat(ChiTietChuongTrinhGiamGiaDTO ct) {
        try {

            String query = "UPDATE chitietchuongtrinhgiamgia SET "
                    + "loaiGiam='" + ct.getLoaiGiam() + "', "
                    + "soTienGiam='" + ct.getSoTienGiam() + "', "
                    + "phanTramGiam='" + ct.getPhanTramGiam()+ "', "
                    + "idChuongTrinh='" + ct.getIdChuongTrinh() + "', "
                    + "idSanPham='" + ct.getIdSanPham() + "' "
                    + "WHERE idChuongTrinh='" + ct.getIdChuongTrinh() + "' AND idSanPham='" +ct.getIdSanPham()+"'";

            System.out.println(query);
            connection.executeUpdate(query);
            System.out.println("Cập nhật chi tiết chương trình giảm giá thành công");

        } catch (SQLException e) {
            System.out.println("Lỗi khi cập nhật chi tiết chương trình giảm giá: " + e.getMessage());
        }
    }


    public ChiTietChuongTrinhGiamGiaDTO timKiem(int idChiTietChuongTrinhGiamGia) {
        try {

            String query = "SELECT * FROM chitietchuongtrinhgiamgia WHERE idChiTietChuongTrinhGiamGia='" + idChiTietChuongTrinhGiamGia + "'";

            System.out.println(query);
            ResultSet resultSet = connection.executeQuery(query);

            if (resultSet.next()) {
                ChiTietChuongTrinhGiamGiaDTO ct = new ChiTietChuongTrinhGiamGiaDTO();
                ct.setIdChiTietChuongTrinhGiamGia(resultSet.getInt("idChiTietChuongTrinhGiamGia"));
                ct.setLoaiGiam(resultSet.getInt("loaiGiam"));
                ct.setSoTienGiam(resultSet.getInt("soTienGiam"));
                ct.setIdChuongTrinh(resultSet.getInt("idChuongTrinh"));
                ct.setPhanTramGiam(resultSet.getInt("phanTramGiam"));
                ct.setIdSanPham(resultSet.getInt("idSanPham"));

                return ct;
            }

        } catch (SQLException e) {
            System.out.println("Lỗi khi tìm kiếm chi tiết chương trình giảm giá: " + e.getMessage());
        }

        return null;
    }

    public ArrayList<ChiTietChuongTrinhGiamGiaDTO> docDSChuongTrinhGiamGia() {
        ArrayList<ChiTietChuongTrinhGiamGiaDTO> danhSachChuongTrinhGiamGia = new ArrayList<>();

        try {

            String query = "SELECT * FROM ChiTietChuongTrinhGiamGia";
            ResultSet rs = connection.executeQuery(query);

            while (rs.next()) {
                int idChiTietChuongTrinhGiamGia = rs.getInt("idChiTietChuongTrinhGiamGia");
                int loaiGiam = rs.getInt("loaiGiam");
                int soTienGiam = rs.getInt("soTienGiam");
                int phanTramGiam = rs.getInt("phanTramGiam");
                int idChuongTrinh = rs.getInt("idChuongTrinh");
                int idSanPham = rs.getInt("idSanPham");

                ChiTietChuongTrinhGiamGiaDTO ChiTiet = new ChiTietChuongTrinhGiamGiaDTO(idChiTietChuongTrinhGiamGia, loaiGiam, soTienGiam,
                        phanTramGiam, idChuongTrinh, idSanPham);
                danhSachChuongTrinhGiamGia.add(ChiTiet);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi đọc danh sách chương trình giảm giá: " + e.getMessage());
        }

        return danhSachChuongTrinhGiamGia;
    }
}