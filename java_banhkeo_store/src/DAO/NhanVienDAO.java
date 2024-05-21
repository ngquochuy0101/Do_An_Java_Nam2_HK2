package DAO;

import DTO.NhanVienDTO;
import DTO.SQLConnection;
import DTO.SanPhamDTO;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDAO {

    SQLConnection connection = new SQLConnection();

    public NhanVienDAO() throws SQLException {
        connection.connect("jdbc:mysql://localhost:3306/qlsieuthimini", "root", "");
    }

    public void them(NhanVienDTO nv) {
        try {

            String query = "INSERT INTO nhanvien (`MK`, `CCCD`, `hoTenLot`, `ten`, `ngaySinh`, `SDT`, `trangThai`, `chucVu`, `luongThang`,`gioiTinh`) VALUES ('"
                    + nv.getMK() + "','"
                    + nv.getCCCD() + "','"
                    + nv.getHoTenLot() + "','"
                    + nv.getTen() + "','"
                    + nv.getNgaySinh() + "','"
                    + nv.getSDT() + "','"
                    + nv.getTrangThai() + "','"
                    + nv.getChucVu() + "','"
                    + nv.getLuongThang() + "','"
                    + nv.getGioiTinh()
                    + "')";

            System.out.println(query);
            connection.executeUpdate(query);
            System.out.println("Thêm Nhan vien thành công");

        } catch (SQLException e) {
            System.out.println("Lỗi khi thêm Nhan vien: " + e.getMessage());
        }
    }

    public void update(NhanVienDTO nv) {
        try {

            String query = "UPDATE nhanvien SET "
                    + "MK='" + nv.getMK() + "', "
                    + "CCCD='" + nv.getCCCD() + "', "
                    + "hoTenLot='" + nv.getHoTenLot() + "', "
                    + "ten='" + nv.getTen() + "', "
                    + "ngaySinh='" + nv.getNgaySinh() + "', "
                    + "SDT='" + nv.getSDT() + "', "
                    + "trangThai='" + nv.getTrangThai() + "', "
                    + "chucVu='" + nv.getChucVu() + "', "
                    + "luongThang='" + nv.getLuongThang() + "' "
                    + "WHERE idNhanVien='" + nv.getIdNhanVien() + "'";

            System.out.println(query);
            connection.executeUpdate(query);
            System.out.println("Cập nhật nhân viên thành công");

        } catch (SQLException e) {
            System.out.println("Lỗi khi cập nhật nhân viên: " + e.getMessage());
        }
    }

    public void xoa(int id) {
        try {

            String query = "UPDATE nhanvien SET trangthai=0 " + "WHERE idNhanVien='" + id + "'";
            System.out.println(query);
            connection.executeUpdate(query);
            System.out.println("Xóa nhân viên thành công");
        } catch (SQLException e) {
            System.out.println("Lỗi khi xóa nhân viên: " + e.getMessage());
        }
    }

    public NhanVienDTO timkiem(int id) {
        try {

            String query = "SELECT * FROM nhanvien WHERE idNhanVien='" + id + "'";
            System.out.println(query);
            ResultSet resultSet = connection.executeQuery(query);
            System.out.println("Tìm kiếm nhân viên thành công");

            if (resultSet.next()) {
                NhanVienDTO nv = new NhanVienDTO();
                nv.setIdNhanVien(resultSet.getInt("idNhanVien"));
                nv.setMK(resultSet.getString("MK"));
                nv.setCCCD(resultSet.getString("CCCD"));
                nv.setHoTenLot(resultSet.getString("hoTenLot"));
                nv.setTen(resultSet.getString("ten"));
                nv.setNgaySinh(resultSet.getString("ngaySinh"));
                nv.setSDT(resultSet.getString("SDT"));
                nv.setTrangThai((resultSet.getInt("trangThai")));
                nv.setChucVu((resultSet.getInt("chucVu")));
                nv.setLuongThang((int) resultSet.getFloat("luongThang"));

                return nv;
            } else {
                System.out.println("Không tìm thấy nhân viên với ID: " + id);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi tìm kiếm nhân viên: " + e.getMessage());
        }
        return null;
    }

    public ArrayList<NhanVienDTO> docDSNV() {
        ArrayList<NhanVienDTO> danhSachNhanVien = new ArrayList<>();
        try {
            String query = "SELECT * FROM nhanvien";
            System.out.println(query);
            ResultSet resultSet = connection.executeQuery(query);
            while (resultSet.next()) {
                NhanVienDTO nhanVien = new NhanVienDTO();
                nhanVien.setIdNhanVien(resultSet.getInt("idNhanVien"));
                nhanVien.setMK(resultSet.getString("MK"));
                nhanVien.setCCCD(resultSet.getString("CCCD"));
                nhanVien.setHoTenLot(resultSet.getString("hoTenLot"));
                nhanVien.setTen(resultSet.getString("ten"));
                nhanVien.setNgaySinh(resultSet.getString("ngaySinh"));
                nhanVien.setSDT(resultSet.getString("SDT"));
                nhanVien.setTrangThai(resultSet.getInt("trangThai"));
                nhanVien.setChucVu(resultSet.getInt("chucVu"));
                nhanVien.setLuongThang((int) resultSet.getFloat("luongThang"));
                nhanVien.setNgaySinh(resultSet.getString("ngaySinh"));
                danhSachNhanVien.add(nhanVien);

            }

        } catch (Exception e) {
            System.out.println("Lỗi khi lấy danh sách nhân viên: " + e.getMessage());

        }
        return danhSachNhanVien;

    }

    public static void main(String[] args) throws SQLException {
        NhanVienDTO nvdto = new NhanVienDTO(15, "mk", "cccd", "nguyen quoc", " huy", "2004-12-10", "0878955654", 1, 1, 100000, 1);

        NhanVienDAO nhanVienDAO = new NhanVienDAO();
        NhanVienDTO nv1 = nhanVienDAO.timkiem(1);
        System.out.println(nv1.getCCCD());
        nhanVienDAO.xoa(2);
        nhanVienDAO.them(nvdto);
        for (NhanVienDTO nv : nhanVienDAO.docDSNV()){
            System.out.println(nv.getCCCD());
        }
    }
}
