package DTO;

import java.util.Date;

public class NhanVienDTO {
    private int idNhanVien;
    private String MK;
    private String CCCD;
    private String hoTenLot;
    private String ten;
    private String ngaySinh;
    private String SDT;
    private int trangThai;
    private int chucVu;
    private int luongThang;
    private int GioiTinh;
    

    public NhanVienDTO(int idNhanVien, String MK, String CCCD, String hoTenLot, String ten, String ngaySinh, String SDT,
            int trangThai, int chucVu, int luongThang) {
        this.idNhanVien = idNhanVien;
        this.MK = MK;
        this.CCCD = CCCD;
        this.hoTenLot = hoTenLot;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.SDT = SDT;
        this.trangThai = trangThai;
        this.chucVu = chucVu;
        this.luongThang = luongThang;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public NhanVienDTO(int idNhanVien, String MK, String CCCD, String hoTenLot, String ten, String ngaySinh, String SDT, int trangThai, int chucVu, int luongThang, int GioiTinh) {
        this.idNhanVien = idNhanVien;
        this.MK = MK;
        this.CCCD = CCCD;
        this.hoTenLot = hoTenLot;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.SDT = SDT;
        this.trangThai = trangThai;
        this.chucVu = chucVu;
        this.luongThang = luongThang;
        this.GioiTinh = GioiTinh;
    }

    public NhanVienDTO() {
    }

    public int getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(int idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getMK() {
        return MK;
    }

    public void setMK(String MK) {
        this.MK = MK;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getHoTenLot() {
        return hoTenLot;
    }

    public void setHoTenLot(String hoTenLot) {
        this.hoTenLot = hoTenLot;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public int getChucVu() {
        return chucVu;
    }

    public void setChucVu(int chucVu) {
        this.chucVu = chucVu;
    }

    public int getLuongThang() {
        return luongThang;
    }

    public void setLuongThang(int luongThang) {
        this.luongThang = luongThang;
    }
}