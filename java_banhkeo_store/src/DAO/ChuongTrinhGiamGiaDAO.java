package DAO;

import DTO.ChuongTrinhGiamGiaDTO;
import DTO.SQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChuongTrinhGiamGiaDAO {

    SQLConnection connection = new SQLConnection();

    public ChuongTrinhGiamGiaDAO() throws SQLException {
        connection.connect("jdbc:mysql://localhost:3306/qlsieuthimini", "root", "");
    }

    public void them(ChuongTrinhGiamGiaDTO ctgg) {
        try {
            String query = "INSERT INTO chuongtrinhgiamgia ( `ten`, `start`, `end`) VALUES ('"
  
                    + ctgg.getTen() + "','"
                    + ctgg.getStart() + "','"
                    + ctgg.getEnd()
                    + "')";

            System.out.println(query);
            connection.executeUpdate(query);
            System.out.println("Thêm chương trình giảm giá thành công");

        } catch (SQLException e) {
            System.out.println("Lỗi khi thêm chương trình giảm giá: " + e.getMessage());
        }
    }

    public void capnhat(ChuongTrinhGiamGiaDTO ctgg) {
        try {
            String query = "UPDATE chuongtrinhgiamgia SET "
                    + "ten='" + ctgg.getTen() + "', "
                    + "start='" + ctgg.getStart() + "', "
                    + "end='" + ctgg.getEnd() + "' "
                    + "WHERE idChuongTrinh='" + ctgg.getIdChuongTrinh() + "'";

            System.out.println(query);
            connection.executeUpdate(query);
            System.out.println("Cập nhật chương trình giảm giá thành công");

        } catch (SQLException e) {
            System.out.println("Lỗi khi cập nhật chương trình giảm giá: " + e.getMessage());
        }
    }

    public void xoa(int id) {
        try {
            String query = "DELETE FROM chuongtrinhgiamgia WHERE idChuongTrinh='" +id + "'";

            System.out.println(query);
            connection.executeUpdate(query);
            System.out.println("Xóa chương trình giảm giá thành công");

        } catch (SQLException e) {
            System.out.println("Lỗi khi xóa chương trình giảm giá: " + e.getMessage());
        }
    }

    public ChuongTrinhGiamGiaDTO timKiem(int idChuongTrinh) {
        try {
            String query = "SELECT * FROM chuongtrinhgiamgia WHERE idChuongTrinh='" + idChuongTrinh + "'";

            System.out.println(query);
            ResultSet resultSet = connection.executeQuery(query);

            if (resultSet.next()) {
                ChuongTrinhGiamGiaDTO ctgg = new ChuongTrinhGiamGiaDTO();
                ctgg.setIdChuongTrinh(resultSet.getInt("idChuongTrinh"));
                ctgg.setTen(resultSet.getString("ten"));
                ctgg.setStart(resultSet.getString("start"));
                ctgg.setEnd(resultSet.getString("end"));

                return ctgg;
            }

        } catch (SQLException e) {
            System.out.println("Lỗi khi tìm kiếm chương trình giảm giá: " + e.getMessage());
        }

        return null;
    }

    public ArrayList<ChuongTrinhGiamGiaDTO> docDSChuongTrinhGiamGia() {
        ArrayList<ChuongTrinhGiamGiaDTO> danhSachCTGG = new ArrayList<>();

        try {
            String query = "SELECT * FROM chuongtrinhgiamgia";
            ResultSet resultSet = connection.executeQuery(query);

            while (resultSet.next()) {
                ChuongTrinhGiamGiaDTO ctgg = new ChuongTrinhGiamGiaDTO();
                ctgg.setIdChuongTrinh(resultSet.getInt("idChuongTrinh"));
                ctgg.setTen(resultSet.getString("ten"));
                ctgg.setStart(resultSet.getString("start"));
                ctgg.setEnd(resultSet.getString("end"));

                danhSachCTGG.add(ctgg);
            }

        } catch (SQLException e) {
            System.out.println("Lỗi khi đọc danh sách chương trình giảm giá: " + e.getMessage());
        }

        return danhSachCTGG;
    }

    public static void main(String[] args) throws SQLException {
        ChuongTrinhGiamGiaDAO chuongTrinhGiamGiaDAO = new ChuongTrinhGiamGiaDAO();

        // Thêm chương trình giảm giá
        ChuongTrinhGiamGiaDTO chuongTrinh1 = new ChuongTrinhGiamGiaDTO(1, "CTGG1", "2002-12-22", "2002-12-22");
        chuongTrinhGiamGiaDAO.them(chuongTrinh1);

        // Cập nhật chương trình giảm giá
        ChuongTrinhGiamGiaDTO chuongTrinh2 = new ChuongTrinhGiamGiaDTO(2, "CTGG2", "2002-12-22", "2002-12-22");
        chuongTrinhGiamGiaDAO.capnhat(chuongTrinh2);

        // Xóa chương trình giảm giá
        chuongTrinhGiamGiaDAO.xoa(3);

        // Tìm kiếm chương trình giảm giá
        ChuongTrinhGiamGiaDTO chuongTrinh4 = chuongTrinhGiamGiaDAO.timKiem(4);
        if (chuongTrinh4 != null) {
            System.out.println("Tìm thấy chương trình giảm giá: " + chuongTrinh4.getTen());
        } else {
            System.out.println("Không tìm thấy chương trình giảm giá");
        }

        // Đọc danh sách chương trình giảm giá
        ArrayList<ChuongTrinhGiamGiaDTO> danhSachCTGG = chuongTrinhGiamGiaDAO.docDSChuongTrinhGiamGia();
        System.out.println("Danh sách chương trình giảm giá:");
        for (ChuongTrinhGiamGiaDTO chuongTrinh : danhSachCTGG) {
            System.out.println("ID: " + chuongTrinh.getIdChuongTrinh() + ", Tên: " + chuongTrinh.getTen());
            System.out.println("ngay ket thuc: "+chuongTrinh.getEnd());
        }
    }
}
