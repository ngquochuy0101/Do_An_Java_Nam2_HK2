package BUS;

import DAO.ChiTietHoaDonDAO;
import DTO.ChiTietHoaDonDTO;
import DTO.KhachHangDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public class ChiTietHoaDonBUS {

    ArrayList<ChiTietHoaDonDTO> DSCTHD = new ArrayList<ChiTietHoaDonDTO>();

    public ChiTietHoaDonBUS() {
    }

    public void docDSCTHD() throws SQLException {
        ChiTietHoaDonDAO data = new ChiTietHoaDonDAO();
        if (DSCTHD == null) {
            DSCTHD = new ArrayList<ChiTietHoaDonDTO>();
        }
        DSCTHD = data.docDSChiTietHoaDon();
    }

    public void them(ChiTietHoaDonDTO cthd) throws SQLException {
        docDSCTHD();
        ChiTietHoaDonDAO data = new ChiTietHoaDonDAO();
        data.them(cthd);
        DSCTHD.add(cthd);
    }

    public void capNhat(ChiTietHoaDonDTO cthd) throws SQLException {
        docDSCTHD();
        ChiTietHoaDonDAO data = new ChiTietHoaDonDAO();
        data.sua(cthd);
        for (ChiTietHoaDonDTO chitiet : DSCTHD) {
            if (chitiet.getIdChiTietHoaDon() == cthd.getIdChiTietHoaDon()) {
                chitiet.setDonGia(cthd.getDonGia());
                chitiet.setSoLuong(cthd.getSoLuong());
                chitiet.setThanhTien(cthd.getThanhTien());
                chitiet.setIdHoaDon(cthd.getIdHoaDon());
                break;
            }
        }
    }

    public void xoa(int idChiTietHoaDon) throws SQLException {
        docDSCTHD();

        ChiTietHoaDonDAO data = new ChiTietHoaDonDAO();
        data.xoa(idChiTietHoaDon);
        for (ChiTietHoaDonDTO chitiet : DSCTHD) {
            if (chitiet.getIdChiTietHoaDon() == idChiTietHoaDon) {
                DSCTHD.remove(chitiet);
                break;
            }
        }
    }

    public ChiTietHoaDonDTO timKiem(int idChiTietHoaDon) throws SQLException {
        docDSCTHD();

        for (ChiTietHoaDonDTO chitiet : DSCTHD) {
            if (chitiet.getIdChiTietHoaDon() == idChiTietHoaDon) {
                return chitiet;
            }
        }
        return null; // Trả về null nếu không tìm thấy chi tiết hóa đơn
    }

    public static void main(String[] args) {
        try {
            // Tạo một đối tượng ChiTietHoaDonBUS
            ChiTietHoaDonBUS chiTietHoaDonBUS = new ChiTietHoaDonBUS();

            // Đọc danh sách chi tiết hóa đơn
            chiTietHoaDonBUS.docDSCTHD();
            System.out.println("Danh sách chi tiết hóa đơn:");
            for (ChiTietHoaDonDTO chitiet : chiTietHoaDonBUS.DSCTHD) {
                System.out.println(chitiet.getIdChiTietHoaDon());
            }
            System.out.println();

            // Thêm một chi tiết hóa đơn mới
            ChiTietHoaDonDTO newChiTietHoaDon = new ChiTietHoaDonDTO(1, 10000, 2, 20000, 1);
            newChiTietHoaDon.setIdChiTietHoaDon(1); // Thay đổi giá trị tùy ý
            chiTietHoaDonBUS.them(newChiTietHoaDon);
            System.out.println("Danh sách chi tiết hóa đơn sau khi thêm:");
            for (ChiTietHoaDonDTO chitiet : chiTietHoaDonBUS.DSCTHD) {
                System.out.println(chitiet.getIdChiTietHoaDon());
            }
            System.out.println();

            // Cập nhật thông tin một chi tiết hóa đơn
            ChiTietHoaDonDTO chiTietHoaDonCanCapNhat = chiTietHoaDonBUS.timKiem(1); // Thay đổi idChiTietHoaDon tùy ý
            if (chiTietHoaDonCanCapNhat != null) {
                chiTietHoaDonCanCapNhat.setDonGia(15000);
                chiTietHoaDonCanCapNhat.setSoLuong(3);
                chiTietHoaDonCanCapNhat.setThanhTien(45000);
                chiTietHoaDonCanCapNhat.setIdHoaDon(2);
                chiTietHoaDonBUS.capNhat(chiTietHoaDonCanCapNhat);
                System.out.println("Cập nhật chi tiết hóa đơn thành công");
            } else {
                System.out.println("Không tìm thấy chi tiết hóa đơn cần cập nhật");
            }
            System.out.println();

            // Xóa một chi tiết hóa đơn
            int idChiTietHoaDonCanXoa = 1; // Thay đổi idChiTietHoaDon tùy ý
            chiTietHoaDonBUS.xoa(idChiTietHoaDonCanXoa);
            System.out.println("Danh sách chi tiết hóa đơn sau khi xóa:");
            for (ChiTietHoaDonDTO chitiet : chiTietHoaDonBUS.DSCTHD) {
                System.out.println(chitiet.getIdChiTietHoaDon());
            }
            System.out.println();

            // Tìm kiếm chi tiết hóa đơn
            int idChiTietHoaDonCanTim = 2; // Thay đổi idChiTietHoaDon tùy ý
            ChiTietHoaDonDTO chiTietHoaDonTimKiem = chiTietHoaDonBUS.timKiem(idChiTietHoaDonCanTim);
            if (chiTietHoaDonTimKiem != null) {
                System.out.println("Tìm thấy chi tiết hóa đơn:");
                System.out.println("ID: " + chiTietHoaDonTimKiem.getIdChiTietHoaDon());
                System.out.println("Đơn giá: " + chiTietHoaDonTimKiem.getDonGia());
                System.out.println("Số lượng: " + chiTietHoaDonTimKiem.getSoLuong());
                System.out.println("Thành tiền: " + chiTietHoaDonTimKiem.getThanhTien());
                System.out.println("ID hóa đơn: " + chiTietHoaDonTimKiem.getIdHoaDon());
            } else {
                System.out.println("Không tìm thấy chi tiết hóa đơn");
            }
        } catch (SQLException e) {
            System.out.println("Lỗi trong quá trình thao tác với cơ sở dữ liệu: " + e.getMessage());
        }
    }
}
