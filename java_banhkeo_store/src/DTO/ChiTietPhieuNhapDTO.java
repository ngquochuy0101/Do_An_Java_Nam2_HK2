package DTO;

public class ChiTietPhieuNhapDTO {
    private int idChiTietPhieuNhap;
    private int soLuong;
    private int donGiaSP;
    private int thanhTien;
    private int idPhieuNhap;
    private int idSP;

    public ChiTietPhieuNhapDTO(int idChiTietPhieuNhap, int soLuong, int donGiaSP, int thanhTien, int idPhieuNhap, int idSP) {
        this.idChiTietPhieuNhap = idChiTietPhieuNhap;
        this.soLuong = soLuong;
        this.donGiaSP = donGiaSP;
        this.thanhTien = thanhTien;
        this.idPhieuNhap = idPhieuNhap;
        this.idSP = idSP;
        
    }

    public int getIdChiTietPhieuNhap() {
        return idChiTietPhieuNhap;
    }

    public void setIdChiTietPhieuNhap(int idChiTietPhieuNhap) {
        this.idChiTietPhieuNhap = idChiTietPhieuNhap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGiaSP() {
        return donGiaSP;
    }

    public void setDonGiaSP(Integer donGiaSP) {
        this.donGiaSP = donGiaSP;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(Integer thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getIdPhieuNhap() {
        return idPhieuNhap;
    }

    public void setIdPhieuNhap(Integer idPhieuNhap) {
        this.idPhieuNhap = idPhieuNhap;
    }

    public int getIdSP() {
        return idSP;
    }

    public void setIdSP(Integer idSP) {
        this.idSP = idSP;
    }
}