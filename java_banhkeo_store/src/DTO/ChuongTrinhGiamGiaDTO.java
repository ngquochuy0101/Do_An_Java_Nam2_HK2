package DTO;

import java.util.Date;

public class ChuongTrinhGiamGiaDTO {
    private int idChuongTrinh;
    private String ten;
    private String start;
    private String end;

    public ChuongTrinhGiamGiaDTO(int idChuongTrinh, String ten, String start, String end) {
        this.idChuongTrinh = idChuongTrinh;
        this.ten = ten;
        this.start = start;
        this.end = end;
    }

    public ChuongTrinhGiamGiaDTO() {
    }

    public int getIdChuongTrinh() {
        return idChuongTrinh;
    }

    public void setIdChuongTrinh(int idChuongTrinh) {
        this.idChuongTrinh = idChuongTrinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}