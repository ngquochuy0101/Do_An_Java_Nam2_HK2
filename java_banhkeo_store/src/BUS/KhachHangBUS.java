package BUS;

import DAO.KhachHangDAO;
import DTO.KhachHangDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public class KhachHangBUS {

    ArrayList<KhachHangDTO> DSKH=new ArrayList<KhachHangDTO>();
      


    public KhachHangBUS() {
    }

    public ArrayList<KhachHangDTO> docDSKH() throws SQLException {
        KhachHangDAO data = new KhachHangDAO();
        if (DSKH == null) {
            DSKH = new ArrayList<KhachHangDTO>();
        }
        DSKH = data.docDSKH();
        return DSKH;
    }

    public void them(KhachHangDTO kh) throws SQLException {
        KhachHangDAO data = new KhachHangDAO();
        data.them(kh);
        DSKH.add(kh);
    }

    public void capNhat(KhachHangDTO kh) throws SQLException {
        docDSKH();
        KhachHangDAO data = new KhachHangDAO();
        data.update(kh);
        for (KhachHangDTO khachHang : DSKH) {
            if (khachHang.getIdKhachHang() == kh.getIdKhachHang()) {
                khachHang.setSDT(kh.getSDT());
                khachHang.setTen(kh.getTen());
                break;
            }
        }
    }

    public void xoa(int idKhachHang) throws SQLException {
        docDSKH();

        KhachHangDAO data = new KhachHangDAO();
        data.xoa(idKhachHang);
        for (KhachHangDTO khachHang : DSKH) {
            if (khachHang.getIdKhachHang() == idKhachHang) {
                DSKH.remove(khachHang);
                break;
            }
        }
    }

    public KhachHangDTO timKiem(int idKhachHang) throws SQLException {
        docDSKH();

        for (KhachHangDTO khachHang : DSKH) {
            if (khachHang.getIdKhachHang() == idKhachHang) {
                return khachHang;
            }
        }
        return null; // Trả về null nếu không tìm thấy khách hàng
    }public static void main(String[] args) {
        try {
            KhachHangBUS khachHangBUS = new KhachHangBUS();

            // Thêm khách hàng
            KhachHangDTO khachHang = new KhachHangDTO();
            khachHang.setSDT("0123456789");
            khachHang.setTen("Nguyen Van A");
            khachHangBUS.them(khachHang);

            // Cập nhật khách hàng
            khachHang.setTen("Nguyen Van B");
            khachHangBUS.capNhat(khachHang);

            // Tìm kiếm khách hàng
            int idKhachHang = 1; // ID của khách hàng cần tìm
            KhachHangDTO khachHangTimKiem = khachHangBUS.timKiem(idKhachHang);
            if (khachHangTimKiem != null) {
                System.out.println("Thông tin khách hàng:");
                System.out.println("ID: " + khachHangTimKiem.getIdKhachHang());
                System.out.println("SDT: " + khachHangTimKiem.getSDT());
                System.out.println("Tên: " + khachHangTimKiem.getTen());
            }

            // Xóa khách hàng
            int idXoa = 2; // ID của khách hàng cần xóa
            khachHangBUS.xoa(idXoa);

            // Đọc danh sách khách hàng
            ArrayList<KhachHangDTO> danhSachKhachHang = khachHangBUS.docDSKH();
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