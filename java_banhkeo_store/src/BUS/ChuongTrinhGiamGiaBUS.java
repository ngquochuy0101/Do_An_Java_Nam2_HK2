package BUS;

import DAO.ChuongTrinhGiamGiaDAO;
import DTO.ChuongTrinhGiamGiaDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public class ChuongTrinhGiamGiaBUS {

    public ArrayList<ChuongTrinhGiamGiaDTO> dsctgg=new ArrayList<ChuongTrinhGiamGiaDTO>();

    public ChuongTrinhGiamGiaBUS() {
    }

    public ArrayList docDSCTGG() throws SQLException {
        ChuongTrinhGiamGiaDAO data = new ChuongTrinhGiamGiaDAO();
        if (dsctgg == null) {
            dsctgg = new ArrayList<ChuongTrinhGiamGiaDTO>();
        }
        dsctgg = data.docDSChuongTrinhGiamGia();
        return dsctgg;
    }

    public void them(ChuongTrinhGiamGiaDTO ctgg) throws SQLException {
        docDSCTGG();
        for (ChuongTrinhGiamGiaDTO ctggDTO : dsctgg) {
            if (ctgg.getIdChuongTrinh() == ctggDTO.getIdChuongTrinh()) {
                System.out.println("Chương trình giảm giá đã tồn tại trong danh sách!");
                return;
            }
        }
        ChuongTrinhGiamGiaDAO dataDao = new ChuongTrinhGiamGiaDAO();
        dataDao.them(ctgg);
        dsctgg.add(ctgg);
    }

    public void capNhat(ChuongTrinhGiamGiaDTO ctgg) throws SQLException {
        docDSCTGG();
        boolean daCapNhat = false;
        for (int i = 0; i < dsctgg.size(); i++) {
            if (ctgg.getIdChuongTrinh() == dsctgg.get(i).getIdChuongTrinh()) {
                ChuongTrinhGiamGiaDAO dataDao = new ChuongTrinhGiamGiaDAO();
                dataDao.capnhat(ctgg);
                dsctgg.set(i, ctgg);
                daCapNhat = true;
                break;
            }
        }
        if (!daCapNhat) {
            System.out.println("Không tìm thấy chương trình giảm giá với id: " + ctgg.getIdChuongTrinh() + " để cập nhật.");
        }
    }

    public void xoa(int id) throws SQLException {
        docDSCTGG();
        boolean daXoa = false;
        for (int i = 0; i < dsctgg.size(); i++) {
            if (id == dsctgg.get(i).getIdChuongTrinh()) {
                ChuongTrinhGiamGiaDAO dataDao = new ChuongTrinhGiamGiaDAO();
                dataDao.xoa(id);
                dsctgg.remove(i);
                daXoa = true;
                break;
            }
        }
        if (!daXoa) {
            System.out.println("Không tìm thấy chương trình giảm giá với id: " + id + " để xóa.");
        }
    }

    public ChuongTrinhGiamGiaDTO timKiem(int id) throws SQLException {
        docDSCTGG();
        for (ChuongTrinhGiamGiaDTO ctgg : dsctgg) {
            if (ctgg.getIdChuongTrinh() == id) {
                return ctgg;
            }
        }
        System.out.println("Không tìm thấy chương trình giảm giá với id: " + id);
        return null;
    }
    public ArrayList<ChuongTrinhGiamGiaDTO> timkiem_mang(String key, String value) {
        ArrayList<ChuongTrinhGiamGiaDTO> arr = new ArrayList<>();
        for (ChuongTrinhGiamGiaDTO nv : dsctgg) {
            switch (key) {
                case "ID" -> {
                    if (convertString(Integer.toString(nv.getIdChuongTrinh())).contains(convertString(value))) {
                        arr.add(nv);
                    }
                }
                case "Tên chương trình" -> {
                    if (convertString(nv.getTen()).contains(convertString(value))) {
                        arr.add(nv);
                    }
                }
                case "Ngày bắt đầu" -> {
                    if (nv.getStart().contains(value)) {
                        arr.add(nv);
                    }
                }
                case "Ngày kết thúc" -> {
                    if (nv.getEnd().contains(value)) {
                        arr.add(nv);
                    }
                    
                }
                default -> {
                }
            }
        }
        return arr; // Trả về danh sách arr sau khi duyệt qua tất cả các nhân viên
    }
  
          // Hàm chuyển đổi chuỗi từ "Lê Ngọc Anh Huy" -> "lengocanhhuy"
    private  String convertString(String input) {
        // Loại bỏ khoảng trắng và chuyển tất cả ký tự về chữ thường
        String output = input.replaceAll("\\s+", "").toLowerCase();
        return output;
    }

    public static void main(String[] args) {
        try {
            ChuongTrinhGiamGiaBUS bus = new ChuongTrinhGiamGiaBUS();

            // Đọc danh sách chương trình giảm giá
            bus.docDSCTGG();

            // Hiển thị danh sách chương trình giảm giá
            System.out.println("Danh sách chương trình giảm giá:");
            for (ChuongTrinhGiamGiaDTO ctgg : bus.dsctgg) {
                System.out.println("ID: " + ctgg.getIdChuongTrinh());
                System.out.println("Tên chương trình giảm giá: " + ctgg.getTen());
                System.out.println("ngay bat dau: " + ctgg.getStart());
                System.out.println("ngay end: " + ctgg.getEnd());
                // Hiển thị thêm các thông tin khác của chương trình giảm giá
                System.out.println("-----------------------------------");
            }

            // Thêm chương trm giảm giá
            ChuongTrinhGiamGiaDTO chuongTrinh = new ChuongTrinhGiamGiaDTO(1, "CTGG1", "2024-05-10", "2024-05-20");
            bus.them(chuongTrinh);

            // Hiển thị danh sách chương trình giảm giá sau khi thêm
            System.out.println("Danh sách chương trình giảm giá sau khi thêm:");
            for (ChuongTrinhGiamGiaDTO ctgg : bus.dsctgg) {
                System.out.println("ID: " + ctgg.getIdChuongTrinh());
                System.out.println("Tên chương trình giảm giá: " + ctgg.getTen());
                // Hiển thị thêm các thông tin khác của chương trình giảm giá
                System.out.println("-----------------------------------");
            }

            // Cập nhật chương trình giảm giá
            ChuongTrinhGiamGiaDTO chuongTrinhCapNhat = new ChuongTrinhGiamGiaDTO(1, "CTGG1 (Cập nhật)", "2024-05-11", "2024-05-22");
            bus.capNhat(chuongTrinhCapNhat);

            // Hiển thị danh sách chương trình giảm giá sau khi cập nhật
            System.out.println("Danh sách chương trình giảm giá sau khi cập nhật:");
            for (ChuongTrinhGiamGiaDTO ctgg : bus.dsctgg) {
                System.out.println("ID: " + ctgg.getIdChuongTrinh());
                System.out.println("Tên chương trình giảm giá: " + ctgg.getTen());
                // Hiển thị thêm các thông tin khác của chương trình giảm giá
                System.out.println("-----------------------------------");
            }

            // Xóa chương trình giảm giá
            bus.xoa(3);

            // Hiển thị danh sách chương trình giảm giá sau khi xóa
            System.out.println("Danh sách chương trình giảm giá sau khi xóa:");
            for (ChuongTrinhGiamGiaDTO ctgg : bus.dsctgg) {
                System.out.println("ID: " + ctgg.getIdChuongTrinh());
                System.out.println("Tên chương trình giảm giá: " + ctgg.getTen());
                // Hiển thị thêm các thông tin khác của chương trình giảm giá
                System.out.println("-----------------------------------");
            }

            // Tìm kiếm chương trình giảm giá
            ChuongTrinhGiamGiaDTO chuongTrinhTimKiem = bus.timKiem(2);
            if (chuongTrinhTimKiem != null) {
                System.out.println("Thông tin chương trình giảm giá tìm kiếm:");
                System.out.println("ID: " + chuongTrinhTimKiem.getIdChuongTrinh());
                System.out.println("Tên chương trình giảm giá: " + chuongTrinhTimKiem.getTen());
                // Hiển thị thêm các thông tin khác của chương trình giảm giá
            }

        } catch (SQLException e) {
            System.out.println("Lỗi kết nối cơ sở dữ liệu: " + e.getMessage());
        }
    }
}
