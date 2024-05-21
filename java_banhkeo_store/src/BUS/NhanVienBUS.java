package BUS;

import DAO.NhanVienDAO;
import DTO.NhanVienDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public class NhanVienBUS {

    public ArrayList<NhanVienDTO> DSNV = new ArrayList<NhanVienDTO>();

    public NhanVienBUS() {
    }

    public ArrayList<NhanVienDTO> docDSNV() throws SQLException {
        NhanVienDAO data = new NhanVienDAO();
        if (DSNV == null) {
            DSNV = new ArrayList<NhanVienDTO>();
        }
        DSNV = data.docDSNV();
        return DSNV;
    }

    public void them(NhanVienDTO nv) throws SQLException {
        docDSNV();
        NhanVienDAO data = new NhanVienDAO();
        data.them(nv);
        DSNV.add(nv);

    }

    public void capNhat(NhanVienDTO nv) throws SQLException {
        docDSNV();

        NhanVienDAO data = new NhanVienDAO();
        data.update(nv);
        for (NhanVienDTO nhanVien : DSNV) {
            if (nhanVien.getIdNhanVien() == nv.getIdNhanVien()) {
                nhanVien.setMK(nv.getMK());
                nhanVien.setCCCD(nv.getCCCD());
                nhanVien.setHoTenLot(nv.getHoTenLot());
                nhanVien.setTen(nv.getTen());
                nhanVien.setNgaySinh(nv.getNgaySinh());
                nhanVien.setSDT(nv.getSDT());
                nhanVien.setTrangThai(nv.getTrangThai());
                nhanVien.setChucVu(nv.getChucVu());
                nhanVien.setLuongThang(nv.getLuongThang());
                break;
            }
        }
    }

    public void xoa(int idNhanVien) throws SQLException {
        docDSNV();

        NhanVienDAO data = new NhanVienDAO();
        data.xoa(idNhanVien);
        for (NhanVienDTO nhanVien : DSNV) {
            if (nhanVien.getIdNhanVien() == idNhanVien) {
                DSNV.remove(nhanVien);
                break;
            }
        }
    }

    public NhanVienDTO timKiem(int idNhanVien) throws SQLException {
        docDSNV();

        for (NhanVienDTO nhanVien : DSNV) {
            if (nhanVien.getIdNhanVien() == idNhanVien) {
                return nhanVien;
            }
        }
        return null; // Trả về null nếu không tìm thấy nhân viên
    }

    public ArrayList<NhanVienDTO> timkiem_mang(String key, String value) {
        ArrayList<NhanVienDTO> arr = new ArrayList<>();
        for (NhanVienDTO nv : DSNV) {
            switch (key) {
                case "Họ Tên":
                    String fullname = nv.getHoTenLot() + " " + nv.getTen(); // Thêm dấu "+" vào đây
                    if (convertString(fullname).contains(convertString(value))) {
                        arr.add(nv);
                    }
                    break;
                case "CCCD":
                    if (convertString(nv.getCCCD()).contains(convertString(value))) {
                        arr.add(nv);
                    }
                    break;
                case "SDT":
                    if (convertString(nv.getSDT()).contains(convertString(value))) {
                        arr.add(nv);
                    }
                    break;
                case "Mật Khẩu":
                    if (convertString(nv.getMK()).contains(convertString(value))) {
                        arr.add(nv);
                    }
                    break;
                case "ID":
                    if (convertString(Integer.toString(nv.getIdNhanVien())).contains(convertString(value))) {
                        arr.add(nv);
                    }
                    break;
                default:
                    break;
            }
        }
        return arr; // Trả về danh sách arr sau khi duyệt qua tất cả các nhân viên
    }

    // Hàm chuyển đổi chuỗi từ "Lê Ngọc Anh Huy" -> "lengocanhhuy"
    private String convertString(String input) {
        // Loại bỏ khoảng trắng và chuyển tất cả ký tự về chữ thường
        String output = input.replaceAll("\\s+", "").toLowerCase();
        return output;
    }

    public static void main(String[] args) {
        try {
            NhanVienBUS nhanVienBUS = new NhanVienBUS();

            // Đọc danh sách nhân viên
            nhanVienBUS.docDSNV();
            System.out.println("Danh sách nhân viên:");
            for (NhanVienDTO nhanVien : nhanVienBUS.DSNV) {
                System.out.println(nhanVien.getCCCD());
            }
            System.out.println();

            // Thêm nhân viên
            NhanVienDTO newNhanVien = new NhanVienDTO(15, "mk", "cccd", "nguyen quoc", " huy", "2004-12-10", "0878955654", 1, 1, 100000, 1);
            newNhanVien.setIdNhanVien(1); // Thay đổi giá trị tùy ý
            newNhanVien.setHoTenLot("Nguyễn");
            newNhanVien.setTen("Văn A");
            // Cập nhật thêm các thuộc tính khác của nhân viên
            nhanVienBUS.them(newNhanVien);
            System.out.println("Danh sách nhân viên sau khi thêm:");
            for (NhanVienDTO nhanVien : nhanVienBUS.DSNV) {
                System.out.println(nhanVien.getCCCD());
            }
            System.out.println();

            // Cập nhật thông tin nhân viên
            NhanVienDTO nhanVienCanCapNhat = nhanVienBUS.timKiem(1); // Thay đổi idNhanVien tùy ý
            if (nhanVienCanCapNhat != null) {
                nhanVienCanCapNhat.setHoTenLot("Trần");
                nhanVienCanCapNhat.setTen("Thị B");
                // Cập nhật thêm các thuộc tính khác của nhân viên
                nhanVienBUS.capNhat(nhanVienCanCapNhat);
                System.out.println("Danh sách nhân viên sau khi cập nhật:");
                for (NhanVienDTO nhanVien : nhanVienBUS.DSNV) {
                    System.out.println(nhanVien.getCCCD());
                }
                System.out.println();
            } else {
                System.out.println("Không tìm thấy nhân viên cần cập nhật.");
            }

            // Xóa nhân viên
            int idNhanVienCanXoa = 1; // Thay đổi idNhanVien tùy ý
            nhanVienBUS.xoa(idNhanVienCanXoa);
            System.out.println("Danh sách nhân viên sau khi xóa:");
            for (NhanVienDTO nhanVien : nhanVienBUS.DSNV) {
                System.out.println(nhanVien.getCCCD());
            }
            System.out.println();

            // Tìm kiếm nhân viên
            int idNhanVienCanTim = 2; // Thay đổi idNhanVien tùy ý
            NhanVienDTO timKiemNhanVien = nhanVienBUS.timKiem(idNhanVienCanTim);
            if (timKiemNhanVien != null) {
                System.out.println("Nhân viên tìm kiếm:");
                System.out.println(timKiemNhanVien.getCCCD());
            } else {
                System.out.println("Không tìm thấy nhân viên.");
            }

        } catch (SQLException e) {
            System.out.println("Lỗi khi thao tác với cơ sở dữ liệu: " + e.getMessage());
        }
    }
}
