package DTO;

import java.util.Date;

public class SanPhamDTO {
    private int idSP;
    private String tenSP;
    private int soLuongSpConLai;
    private String HSD;
    private String NSX;
    private String hinhAnhMinhHoa;
    private int donGia;
    private int idLoaiSP;
    private int idChiTietSP;

    public SanPhamDTO() {
    }

    public SanPhamDTO(int idSP, String tenSP, int soLuongSpConLai, String HSD, String NSX, String hinhAnhMinhHoa, int donGia, int idLoaiSP, int idChiTietSP) {
        this.idSP = idSP;
        this.tenSP = tenSP;
        this.soLuongSpConLai = soLuongSpConLai;
        this.HSD = HSD;
        this.NSX = NSX;
        this.hinhAnhMinhHoa = hinhAnhMinhHoa;
        this.donGia = donGia;
        this.idLoaiSP = idLoaiSP;
        this.idChiTietSP = idChiTietSP;
    }

    public SanPhamDTO(String tenSP, int soLuongSpConLai, String HSD, String NSX, String hinhAnhMinhHoa, int donGia, int idLoaiSP, int idChiTietSP) {
        this.tenSP = tenSP;
        this.soLuongSpConLai = soLuongSpConLai;
        this.HSD = HSD;
        this.NSX = NSX;
        this.hinhAnhMinhHoa = hinhAnhMinhHoa;
        this.donGia = donGia;
        this.idLoaiSP = idLoaiSP;
        this.idChiTietSP = idChiTietSP;
    }
    public SanPhamDTO(int id, String tenString, int dg,int slconlai){
        idSP=id;
        tenSP=tenString;
        soLuongSpConLai=slconlai;
        donGia=dg;
    }

    public int getIdSP() {
        return idSP;
    }

    public void setIdSP(int idSP) {
        this.idSP = idSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuongSpConLai() {
        return soLuongSpConLai;
    }

    public void setSoLuongSpConLai(int soLuongSpConLai) {
        this.soLuongSpConLai = soLuongSpConLai;
    }

    public String getHSD() {
        return HSD;
    }

    public void setHSD(String HSD) {
        this.HSD = HSD;
    }

    public String getNSX() {
        return NSX;
    }

    public void setNSX(String NSX) {
        this.NSX = NSX;
    }

    public String getHinhAnhMinhHoa() {
        return hinhAnhMinhHoa;
    }

    public void setHinhAnhMinhHoa(String hinhAnhMinhHoa) {
        this.hinhAnhMinhHoa = hinhAnhMinhHoa;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getIdLoaiSP() {
        return idLoaiSP;
    }

    public void setIdLoaiSP(int idLoaiSP) {
        this.idLoaiSP = idLoaiSP;
    }

    public int getIdChiTietSP() {
        return idChiTietSP;
    }

    public void setIdChiTietSP(int idChiTietSP) {
        this.idChiTietSP = idChiTietSP;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SanPhamDTO{");
        sb.append("idSP=").append(idSP);
        sb.append(", tenSP=").append(tenSP);
        sb.append(", soLuongSpConLai=").append(soLuongSpConLai);
        sb.append(", HSD=").append(HSD);
        sb.append(", NSX=").append(NSX);
        sb.append(", hinhAnhMinhHoa=").append(hinhAnhMinhHoa);
        sb.append(", donGia=").append(donGia);
        sb.append(", idLoaiSP=").append(idLoaiSP);
        sb.append(", idChiTietSP=").append(idChiTietSP);
        sb.append('}');
        return sb.toString();
    }
}