package DTO;

public class NhaCungCapDTO {
    private int idNhaCungCap;
    private String tenNCC;
    private String diaChi;
    private String sdt;

    public NhaCungCapDTO(int idNhaCungCap, String tenNCC, String diaChi, String sdt) {
        this.idNhaCungCap = idNhaCungCap;
        this.tenNCC = tenNCC;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public int getIdNhaCungCap() {
        return idNhaCungCap;
    }

    public void setIdNhaCungCap(int idNhaCungCap) {
        this.idNhaCungCap = idNhaCungCap;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}