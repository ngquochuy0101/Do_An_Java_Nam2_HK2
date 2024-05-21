package BUS;

import DAO.HoaDonDAO;
import DTO.HoaDonDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public class HoaDonBUS {

    public ArrayList<HoaDonDTO> danhSachHoaDon = new ArrayList<HoaDonDTO>();
    private final HoaDonDAO hoaDonDAO;

    public HoaDonBUS() throws SQLException {
        hoaDonDAO = new HoaDonDAO();
        danhSachHoaDon = new ArrayList<>();
    }

    public ArrayList<HoaDonDTO> timIdHoaDon(int idHoaDon) throws SQLException {
        return hoaDonDAO.timIdHoaDon(idHoaDon);
    }

    public ArrayList<HoaDonDTO> timHoaDonTheoNgay(String batDau, String ketThuc) throws SQLException {
        return hoaDonDAO.timHoaDonTheoNgay(batDau, ketThuc);
    }

    public ArrayList<HoaDonDTO> docDSHoaDon() throws SQLException {
        HoaDonDAO hoaDonDAO = new HoaDonDAO();
        danhSachHoaDon = hoaDonDAO.docDSHoaDon();
        return danhSachHoaDon;
    }

    public void them(HoaDonDTO hoaDon) throws SQLException {
        HoaDonDAO hoaDonDAO = new HoaDonDAO();
        hoaDonDAO.them(hoaDon);
        danhSachHoaDon.add(hoaDon);
    }

    public void capNhat(HoaDonDTO hoaDon) throws SQLException {
        HoaDonDAO hoaDonDAO = new HoaDonDAO();
        hoaDonDAO.capnhat(hoaDon);

        for (HoaDonDTO hd : danhSachHoaDon) {
            if (hd.getIdHoaDon() == hoaDon.getIdHoaDon()) {
                hd.setTongTien(hoaDon.getTongTien());
                hd.setTienGiamGia(hoaDon.getTienGiamGia());
                hd.setNgayLap(hoaDon.getNgayLap());
                hd.setIdNhanVien(hoaDon.getIdNhanVien());
                hd.setIdKhachHang(hoaDon.getIdKhachHang());
                break;
            }
        }
    }

    public void xoa(HoaDonDTO hoaDonDTO) throws SQLException {
        HoaDonDAO hoaDonDAO = new HoaDonDAO();
        hoaDonDAO.xoa(hoaDonDTO);

        for (HoaDonDTO hd : danhSachHoaDon) {
            if (hd.getIdHoaDon() == hoaDonDTO.getIdHoaDon()) {
                danhSachHoaDon.remove(hd);
                break;
            }
        }
    }

    public HoaDonDTO timKiem(int idHoaDon) {
        for (HoaDonDTO hd : danhSachHoaDon) {
            if (hd.getIdHoaDon() == idHoaDon) {
                return hd;
            }
        }
        return null;
    }

    public static void main(String[] args) throws SQLException {
        HoaDonBUS hoaDonBUS = new HoaDonBUS();

        // Thêm hóa đơn
        HoaDonDTO hoaDonDTO = new HoaDonDTO(11, 10, 10, "2024-04-19", 1, 1);
        hoaDonBUS.them(hoaDonDTO);
        System.out.println("Đã thêm hóa đơn");

        // Cập nhật hóa đơn
        hoaDonDTO.setTongTien(20);
        hoaDonBUS.capNhat(hoaDonDTO);
        System.out.println("Đã cập nhật hóa đơn");

        // Xóa hóa đơn
        hoaDonBUS.xoa(hoaDonDTO);
        System.out.println("Đã xóa hóa đơn");

        // Tìm kiếm hóa đơn
        int idHoaDon = 1;
        HoaDonDTO hdt = hoaDonBUS.timKiem(idHoaDon);
        if (hdt != null) {
            System.out.println("Hóa đơn có id " + idHoaDon + " được tìm thấy");
            System.out.println("Id Khách hàng: " + hdt.getIdKhachHang());
        } else {
            System.out.println("Không tìm thấy hóa đơn có id " + idHoaDon);
        }

        // Đọc danh sách hóa đơn
        hoaDonBUS.docDSHoaDon();
        System.out.println("Danh sách hóa đơn:");
        for (HoaDonDTO hd : hoaDonBUS.danhSachHoaDon) {
            System.out.println("Id Hóa đơn: " + hd.getIdHoaDon());
            System.out.println("Tổng tiền: " + hd.getTongTien());
            System.out.println("Tiền giảm giá: " + hd.getTienGiamGia());
            System.out.println("Ngày lập: " + hd.getNgayLap());
            System.out.println("Id Nhân viên: " + hd.getIdNhanVien());
            System.out.println("Id Khách hàng: " + hd.getIdKhachHang());
            System.out.println("----------------------------------");
        }
    }

}
