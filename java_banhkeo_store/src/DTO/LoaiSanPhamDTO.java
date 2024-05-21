package DTO;

public class LoaiSanPhamDTO {
    private int idLoaiSP;
    private String tenLoaiSP;
    private String dacTinh;

    public LoaiSanPhamDTO(int idLoaiSP, String tenLoaiSP, String dacTinh) {
        this.idLoaiSP = idLoaiSP;
        this.tenLoaiSP = tenLoaiSP;
        this.dacTinh = dacTinh;
    }

    public LoaiSanPhamDTO() {
    }

    public int getIdLoaiSP() {
        return idLoaiSP;
    }

    public void setIdLoaiSP(int idLoaiSP) {
        this.idLoaiSP = idLoaiSP;
    }

    public String getTenLoaiSP() {
        return tenLoaiSP;
    }

    public void setTenLoaiSP(String tenLoaiSP) {
        this.tenLoaiSP = tenLoaiSP;
    }

    public String getDacTinh() {
        return dacTinh;
    }

    public void setDacTinh(String dacTinh) {
        this.dacTinh = dacTinh;
    }
}