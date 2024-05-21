package DTO;

public class KhachHangDTO {
    private int idKhachHang;
    private String SDT;
    private  String ten;
    private int trangThai;

    public KhachHangDTO(int idKhachHang, String SDT,String ten, int trangThai) {
        this.idKhachHang = idKhachHang;
        this.SDT = SDT;
        this.ten=ten;
        this.trangThai=trangThai;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public KhachHangDTO() {
    }

    public int getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(int idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "KhachHangDTO{" + "idKhachHang=" + idKhachHang + ", SDT=" + SDT + ", ten=" + ten + ", trangThai=" + trangThai + '}';
    }
}