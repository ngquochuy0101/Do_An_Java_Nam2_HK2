package BUS;

import DAO.ThongKeNhanVienDAO;
import java.sql.SQLException;

public class ThongKeNhanVienBUS {

    private ThongKeNhanVienDAO thongKeNhanVienDAO;

    public ThongKeNhanVienBUS() throws SQLException {
        thongKeNhanVienDAO = new ThongKeNhanVienDAO();
    }

    public int demSanPham() throws SQLException {
        return thongKeNhanVienDAO.demSanPham();
    }

    public int demMaKhuyenMai() throws SQLException {
        return thongKeNhanVienDAO.demMaKhuyenMai();
    }

    public int demNhanVien() throws SQLException {
        return thongKeNhanVienDAO.demNhanVien();
    }

    public int demKhachHang() throws SQLException {
        return thongKeNhanVienDAO.demKhachHang();
    }
}
