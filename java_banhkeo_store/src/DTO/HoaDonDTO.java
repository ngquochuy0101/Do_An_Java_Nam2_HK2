package DTO;

import java.util.Date;

public class HoaDonDTO {
    private int idHoaDon;
    private int tongTien;
    private int tienGiamGia;
    private String ngayLap;
    private int idNhanVien;
    private int idKhachHang;

    public HoaDonDTO(int idHoaDon, int tongTien, int tienGiamGia, String ngayLap, int idNhanVien, int idKhachHang) {
        this.idHoaDon = idHoaDon;
        this.tongTien = tongTien;
        this.tienGiamGia = tienGiamGia;
        this.ngayLap = ngayLap;
        this.idNhanVien = idNhanVien;
        this.idKhachHang = idKhachHang;
    }

    public HoaDonDTO() {
    }

    public int getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(int idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public int getTienGiamGia() {
        return tienGiamGia;
    }

    public void setTienGiamGia(int tienGiamGia) {
        this.tienGiamGia = tienGiamGia;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public int getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(int idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public int getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(int idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    @Override
    public String toString() {
        return "HoaDonDTO{" + "idHoaDon=" + idHoaDon + ", tongTien=" + tongTien + ", tienGiamGia=" + tienGiamGia + ", ngayLap=" + ngayLap + ", idNhanVien=" + idNhanVien + ", idKhachHang=" + idKhachHang + '}';
    }

}