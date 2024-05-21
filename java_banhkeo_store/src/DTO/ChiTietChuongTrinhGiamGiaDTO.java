package DTO;

public class ChiTietChuongTrinhGiamGiaDTO {
    private int idChiTietChuongTrinhGiamGia;
    private int loaiGiam;
    private int soTienGiam;
    private int phanTramGiam;
    private int idChuongTrinh;
    private int idSanPham;

    public ChiTietChuongTrinhGiamGiaDTO(int idChiTietChuongTrinhGiamGia, int loaiGiam, int soTienGiam, int phanTramGiam, int idChuongTrinh, int idSanPham) {
        this.idChiTietChuongTrinhGiamGia = idChiTietChuongTrinhGiamGia;
        this.loaiGiam = loaiGiam;
        this.soTienGiam = soTienGiam;
        this.phanTramGiam = phanTramGiam;
        this.idChuongTrinh = idChuongTrinh;
        this.idSanPham = idSanPham;
    }

    public int getPhanTramGiam() {
        return phanTramGiam;
    }

    public void setPhanTramGiam(int phanTramGiam) {
        this.phanTramGiam = phanTramGiam;
    }

  

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }

    public ChiTietChuongTrinhGiamGiaDTO() {
    }

    

    public int getIdChiTietChuongTrinhGiamGia() {
        return idChiTietChuongTrinhGiamGia;
    }

    public void setIdChiTietChuongTrinhGiamGia(int idChiTietChuongTrinhGiamGia) {
        this.idChiTietChuongTrinhGiamGia = idChiTietChuongTrinhGiamGia;
    }

    public int getLoaiGiam() {
        return loaiGiam;
    }

    public void setLoaiGiam(int loaiGiam) {
        this.loaiGiam = loaiGiam;
    }

    public int getSoTienGiam() {
        return soTienGiam;
    }

    public void setSoTienGiam(int soTienGiam) {
        this.soTienGiam = soTienGiam;
    }

    public int getIdChuongTrinh() {
        return idChuongTrinh;
    }

    public void setIdChuongTrinh(Integer idChuongTrinh) {
        this.idChuongTrinh = idChuongTrinh;
    }
}