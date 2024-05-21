package GUI;

import DTO.SanPhamDTO;
import java.awt.*;
import java.awt.print.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class InvoicePrinter implements Printable {

    String idHD;
    String tenKhachHang;
    String ngayTao;
    String SDT;
    String IDNV;
    ArrayList<SanPhamDTO> gioHang = new ArrayList<SanPhamDTO>();
    String soTienDuocGiamString;
    String tongTienSP;
    String tongHoaDon;

    public InvoicePrinter(String idHD, String tenKhachHang, String ngayTao, String SDT, String IDNV, ArrayList<SanPhamDTO> gioHang, String soTienDuocGiamString, String tongTienSP, String tongHoaDon) {
        this.idHD = idHD;
        this.tenKhachHang = tenKhachHang;
        this.ngayTao = ngayTao;
        this.SDT = SDT;
        this.IDNV = IDNV;
        this.gioHang = gioHang;
        this.soTienDuocGiamString = soTienDuocGiamString;
        this.tongTienSP = tongTienSP;
        this.tongHoaDon = tongHoaDon;
    }

    public InvoicePrinter() {
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex > 0) {
            return NO_SUCH_PAGE;
        }

        Graphics2D g2d = (Graphics2D) graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

        g2d.setFont(new Font("Arial", Font.BOLD, 12));
        int y = 100; // Giá trị y ban đầu
        g2d.drawString("---------  Hóa Đơn --------- ", 100, y);
        y += 20; // Tăng giá trị y để in dòng tiếp theo
//        g2d.drawString("Mã hóa đơn: " + idHD, 100, y);
//        y += 20;
        g2d.drawString("Ngày lập: " + ngayTao, 100, y);
        y += 20;
        g2d.drawString("Nhân viên: " + IDNV, 100, y);
        y += 20;
        g2d.drawString("Sản phẩm: ", 100, y);
        y += 20;
        g2d.drawString("--------------------------", 100, y);
        y += 20;

        for (SanPhamDTO spdto : gioHang) {
            g2d.drawString(spdto.getSoLuongSpConLai() + " " + spdto.getTenSP() + " " + spdto.getDonGia(), 150, y);
            y += 20;
        }

        g2d.drawString("--------------------------", 100, y);
        y += 20;

        g2d.drawString("Số tiền được giảm: " + soTienDuocGiamString, 100, y);
        y += 20;
        g2d.drawString("Tổng tiền sản phẩm: " + tongTienSP, 100, y);
        y += 20;
        g2d.drawString("Tổng tiền: " + tongHoaDon, 100, y);
        y += 20;
        g2d.drawString("--------- Cảm ơn quý khách! --------- ", 100, y);

        return PAGE_EXISTS;
    }

}
