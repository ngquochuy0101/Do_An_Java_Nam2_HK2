package DTO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class PhieunhapDTO {
    private String IdPhieunhap;
    private String Ncc;
    private String IdNhanvien;
    private String Ngaynhap;
    private double Tongtien;

    public PhieunhapDTO() {
    }

    public PhieunhapDTO(String IdPhieunhap, String Ngaynhap, String Ncc, String IdNhanvien, double Tongtien) {
        setIdPhieunhap(IdPhieunhap);
        setNgaynhap(Ngaynhap);
        setNcc(Ncc);
        setIdNhanvien(IdNhanvien);
        setTongtien(Tongtien);
    }

    public double getTongtien() {
        return Tongtien;
    }

    public void setTongtien(double Tongtien) {
        if (Tongtien < 0) {
            showMessage("Tổng tiền không thể là số âm");
            return;
        }
        this.Tongtien = Tongtien;
    }

    public String getIdPhieunhap() {
        return IdPhieunhap;
    }

    public void setIdPhieunhap(String IdPhieunhap) {
        
        this.IdPhieunhap = IdPhieunhap;
    }

    public String getNcc() {
        return Ncc;
    }

    public void setNcc(String Ncc) {
        if (Ncc == null || Ncc.trim().isEmpty()) {
            showMessage("Nhà cung cấp không thể để trống");
            return;
        }
        this.Ncc = Ncc;
    }

    public String getNgaynhap() {
        return Ngaynhap;
    }

    public void setNgaynhap(String Ngaynhap) {
        if (!isValidDate(Ngaynhap)) {
            showMessage("Ngày nhập không hợp lệ");
            return;
        }
        this.Ngaynhap = Ngaynhap;
    }

    public String getIdNhanvien() {
        return IdNhanvien;
    }

    public void setIdNhanvien(String IdNhanvien) {
        if (IdNhanvien == null || IdNhanvien.trim().isEmpty()) {
            showMessage("ID nhân viên không thể để trống");
            return;
        }
        this.IdNhanvien = IdNhanvien;
    }

    private boolean isValidDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);
        try {
            sdf.parse(date);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
}
