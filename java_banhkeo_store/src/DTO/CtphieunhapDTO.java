/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author DELL
 */
public class CtphieunhapDTO {
    String IdPhieunhap,IdCtphieunhhap,Tensp,Masp,link;
    int soluong;
    double dongia,thanhtien;

    public CtphieunhapDTO() {
    }

    public CtphieunhapDTO(String IdPhieunhap, String IdCtphieunhhap, String Tensp, String Masp, int soluong, double dongia, double thanhtien, String link) {
        this.IdPhieunhap = IdPhieunhap;
        this.IdCtphieunhhap = IdCtphieunhhap;
        this.Tensp = Tensp;
        this.Masp = Masp;
        this.soluong = soluong;
        this.dongia = dongia;
        this.thanhtien = soluong*dongia;
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    
    
    public String getIdPhieunhap() {
        return IdPhieunhap;
    }

    public void setIdPhieunhap(String IdPhieunhap) {
        this.IdPhieunhap = IdPhieunhap;
    }

    public String getIdCtphieunhhap() {
        return IdCtphieunhhap;
    }

    public void setIdCtphieunhhap(String IdCtphieunhhap) {
        this.IdCtphieunhhap = IdCtphieunhhap;
    }

    public String getTensp() {
        return Tensp;
    }

    public void setTensp(String Tensp) {
        this.Tensp = Tensp;
    }

    public String getMasp() {
        return Masp;
    }

    public void setMasp(String Masp) {
        this.Masp = Masp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }
    
    
}
