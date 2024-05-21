package DTO;


public class ChiTietSPDTO {
    private int idChiTietSP;
    private int doNgot;
    private String hinhDang;
    private String huong;

    public ChiTietSPDTO(int idChiTietSP, int doNgot, String hinhDang, String huong) {
        this.idChiTietSP = idChiTietSP;
        this.doNgot = doNgot;
        this.hinhDang = hinhDang;
        this.huong = huong;
    }

    public int getIdChiTietSP() {
        return idChiTietSP;
    }

    public void setIdChiTietSP(int idChiTietSP) {
        this.idChiTietSP = idChiTietSP;
    }

    public int getDoNgot() {
        return doNgot;
    }

    public void setDoNgot(Integer doNgot) {
        this.doNgot = doNgot;
    }

    public String getHinhDang() {
        return hinhDang;
    }

    public void setHinhDang(String hinhDang) {
        this.hinhDang = hinhDang;
    }

    public String getHuong() {
        return huong;
    }

    public void setHuong(String huong) {
        this.huong = huong;
    }
}