package BUS;

import DAO.ChiTietChuongTrinhGiamGiaDAO;
import DAO.ChuongTrinhGiamGiaDAO;
import DTO.ChiTietChuongTrinhGiamGiaDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChiTietChuongTrinhGiamGiaBUS {

    public ArrayList<ChiTietChuongTrinhGiamGiaDTO> danhSachChiTietCTGG;

    public ChiTietChuongTrinhGiamGiaBUS() {
        danhSachChiTietCTGG = new ArrayList<>();
    }

    public ArrayList docDSChiTietCTGG() throws SQLException {
        ChiTietChuongTrinhGiamGiaDAO chiTietCTGGDAO = new ChiTietChuongTrinhGiamGiaDAO();
        danhSachChiTietCTGG = chiTietCTGGDAO.docDSChuongTrinhGiamGia();
        return danhSachChiTietCTGG;
    }

    public void them(ChiTietChuongTrinhGiamGiaDTO chiTietCTGG) throws SQLException {
        ChiTietChuongTrinhGiamGiaDAO chiTietCTGGDAO = new ChiTietChuongTrinhGiamGiaDAO();
        chiTietCTGGDAO.them(chiTietCTGG);
        danhSachChiTietCTGG.add(chiTietCTGG);
    }

    public void capNhat(ChiTietChuongTrinhGiamGiaDTO chiTietCTGG) throws SQLException {
        ChiTietChuongTrinhGiamGiaDAO chiTietCTGGDAO = new ChiTietChuongTrinhGiamGiaDAO();
        chiTietCTGGDAO.capnhat(chiTietCTGG);

        for (ChiTietChuongTrinhGiamGiaDTO ct : danhSachChiTietCTGG) {
            if (ct.getIdChiTietChuongTrinhGiamGia() == chiTietCTGG.getIdChiTietChuongTrinhGiamGia() && ct.getIdSanPham() == chiTietCTGG.getIdSanPham()) {
                ct.setLoaiGiam(chiTietCTGG.getLoaiGiam());
                ct.setSoTienGiam(chiTietCTGG.getSoTienGiam());
                ct.setIdChuongTrinh(chiTietCTGG.getIdChuongTrinh());
                ct.setIdSanPham(chiTietCTGG.getIdSanPham());
                ct.setPhanTramGiam(chiTietCTGG.getPhanTramGiam());
                break;
            }
        }
    }

    public ChiTietChuongTrinhGiamGiaDTO timKiem(int ID_CT, int ID_SP) {
        for (ChiTietChuongTrinhGiamGiaDTO ct : danhSachChiTietCTGG) {
            if (ct.getIdChuongTrinh() == ID_CT && ct.getIdSanPham() == ID_SP) {
                return ct;
            }
        }
        return null;
    }
    
    
        public void xoa(int ID_CT, int ID_SP) throws SQLException {
        docDSChiTietCTGG();
        boolean daXoa = false;
        for (int i = 0; i < danhSachChiTietCTGG.size(); i++) {
            if (ID_CT == danhSachChiTietCTGG.get(i).getIdChuongTrinh() && ID_SP == danhSachChiTietCTGG.get(i).getIdSanPham()) {
                ChiTietChuongTrinhGiamGiaDAO dataDao = new ChiTietChuongTrinhGiamGiaDAO();
                dataDao.xoa(ID_CT,ID_SP);
                danhSachChiTietCTGG.remove(i);
                daXoa = true;
                break;
            }
        }
        if (!daXoa) {
            System.out.println("Không tìm thấy chương trình giảm giá với id: " + ID_CT + " để xóa.");
        }
    }
        
    
  public ArrayList<ChiTietChuongTrinhGiamGiaDTO> timkiem_mang(String key, int value) {
        ArrayList<ChiTietChuongTrinhGiamGiaDTO> arr = new ArrayList<>();
        for (ChiTietChuongTrinhGiamGiaDTO nv : danhSachChiTietCTGG) {
            switch (key) {
                case "ID chương trình" -> {
                    if (nv.getIdChuongTrinh() == value) {
                        arr.add(nv);
                    }
                }
                case "ID sản phẩm" -> {
                    if (nv.getIdSanPham() == value) {
                        arr.add(nv);
                    }
                }
                case "Số tiền giảm" -> {
                    if (nv.getSoTienGiam() == value) {
                        arr.add(nv);
                    }
                }
                case "%giảm" -> {
                    if (nv.getPhanTramGiam() == value) {
                        arr.add(nv);
                    }
                }
                case "loai" -> {
                    if (nv.getLoaiGiam() == value) {
                        arr.add(nv);
                    }
                }
                default -> {
                }
            }
        }
        return arr; // Trả về danh sách arr sau khi duyệt qua tất cả các nhân viên
    }
  
}