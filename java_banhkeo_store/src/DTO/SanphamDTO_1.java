/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class SanphamDTO_1 {

    private String IdSp;
    private String TenSp;
    private String LoaiSp, Linkanh, Mota, TPChinh, style;
    private int dongia;
    private int soluong;
    private String NSX, HSD;

    public SanphamDTO_1() {
    }

    public SanphamDTO_1(String IdSp, String TenSp, String LoaiSp, String Linkanh, String Mota, String TPChinh, String style, int dongia, int soluong, String NSX, String HSD) {
        this.IdSp = IdSp;
        this.TenSp = TenSp;
        this.LoaiSp = LoaiSp;
        this.Linkanh = Linkanh;
        this.Mota = Mota;
        this.TPChinh = TPChinh;
        this.style = style;
        this.dongia = dongia;
        this.soluong = soluong;
        this.NSX = NSX;
        this.HSD = HSD;
    }

    public String getIdSp() {
        return IdSp;
    }

    public void setIdSp(String IdSp) {
        this.IdSp = IdSp;
    }

    public String getTenSp() {
        return TenSp;
    }

    public void setTenSp(String TenSp) {
        this.TenSp = TenSp;
    }

    public String getLoaiSp() {
        return LoaiSp;
    }

    public void setLoaiSp(String LoaiSp) {
        this.LoaiSp = LoaiSp;
    }

    public String getLinkanh() {
        return Linkanh;
    }

    public void setLinkanh(String Linkanh) {
        this.Linkanh = Linkanh;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    public String getTPChinh() {
        return TPChinh;
    }

    public void setTPChinh(String TPChinh) {
        this.TPChinh = TPChinh;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getNSX() {
        return NSX;
    }

    public void setNSX(String NSX) {
        this.NSX = NSX;
    }

    public String getHSD() {
        return HSD;
    }

    public void setHSD(String HSD) {
        this.HSD = HSD;
    }
    
    

}
