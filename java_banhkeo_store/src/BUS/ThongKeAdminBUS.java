package BUS;

import DAO.HoaDonDAO;
import DAO.ThongKeAdminDAO;
import DTO.HoaDonDTO;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ThongKeAdminBUS {

    private final ThongKeAdminDAO thongKeDAO;
    private final HoaDonDAO hoaDonDAO;

    public ThongKeAdminBUS() throws SQLException {
        thongKeDAO = new ThongKeAdminDAO();
        hoaDonDAO = new HoaDonDAO();
    }

    public int demSanPham() throws SQLException {
        return thongKeDAO.demSanPham();
    }

    public int demHoaDon() throws SQLException {
        return thongKeDAO.demHoaDon();
    }

    public int demNhanVien() throws SQLException {
        return thongKeDAO.demNhanVien();
    }

    // Hàm thống kê doanh thu theo quý
    public ArrayList<Integer> thongKeTheoQuy(int nam) throws SQLException {
        ArrayList<Integer> doanhThuTheoQuy = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            int doanhThuQuy = thongKeDAO.getTongThuQuy(nam, i);
            doanhThuTheoQuy.add(doanhThuQuy);
        }
        return doanhThuTheoQuy;
    }

    // Hàm tính tổng doanh thu của cả năm
    public int tinhTongDoanhThuNam(int nam) throws SQLException {
        ArrayList<Integer> doanhThuTheoQuy = thongKeTheoQuy(nam);
        int tongDoanhThuNam = 0;

        for (int doanhThuQuy : doanhThuTheoQuy) {
            tongDoanhThuNam += doanhThuQuy;
        }

        return tongDoanhThuNam;
    }

    public ArrayList<HoaDonDTO> timIdHoaDon(int idHoaDon) throws SQLException {
        return hoaDonDAO.timIdHoaDon(idHoaDon);
    }

    public ArrayList<HoaDonDTO> timHoaDonTheoNgay(String batDau, String ketThuc) throws SQLException {
        SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat outputDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date startDate = inputDateFormat.parse(batDau);
            Date endDate = inputDateFormat.parse(ketThuc);

            String formattedStartDate = outputDateFormat.format(startDate);
            String formattedEndDate = outputDateFormat.format(endDate);

            return hoaDonDAO.timHoaDonTheoNgay(formattedStartDate, formattedEndDate);
        } catch (ParseException e) {
        }
        return null;
    }

    public boolean isValidDate(String date) {
        try {
            String[] parts = date.split("-");
            int day = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);

            if (day < 1 || day > 31 || month < 1 || month > 12) {
                return false;
            }

            // Kiểm tra số ngày hợp lệ cho từng tháng
            if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
                return false;
            }

            // Kiểm tra tháng 2 (năm nhuận và không nhuận)
            if (month == 2) {
                if (isLeapYear(year) && day > 29) {
                    return false;
                } else if (!isLeapYear(year) && day > 28) {
                    return false;
                }
            }

            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                return true;
            }
        }
        return false;
    }
}
