package DTO;

public class ChiTietHoaDonDTO {
    private int idChiTietHoaDon;
    private int donGia;
    private int soLuong;
    private int thanhTien;
    private int idHoaDon;

   

    public ChiTietHoaDonDTO(int idChiTietHoaDon, int donGia, int soLuong, int thanhTien, int idHoaDon) {
        this.idChiTietHoaDon = idChiTietHoaDon;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
        this.idHoaDon = idHoaDon;
    }

    public int getIdChiTietHoaDon() {
        return idChiTietHoaDon;
    }

    public void setIdChiTietHoaDon(int idChiTietHoaDon) {
        this.idChiTietHoaDon = idChiTietHoaDon;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(Integer donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(Integer thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(Integer idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    @Override
    public String toString() {
        return "ChiTietHoaDonDTO{" + "idChiTietHoaDon=" + idChiTietHoaDon + ", donGia=" + donGia + ", soLuong=" + soLuong + ", thanhTien=" + thanhTien + ", idHoaDon=" + idHoaDon + '}';
    }
}