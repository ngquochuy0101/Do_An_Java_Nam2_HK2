    package DAO;

import DTO.CtphieunhapDTO;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CtphieunhapDAO {

    private DatabaseConnection Connect;

    public CtphieunhapDAO() {
        Connect = new DatabaseConnection(); // Tạo một thể hiện của DatabaseConnection
    }

    public void addctsp(CtphieunhapDTO ctsp) throws SQLException {
        String selectQuery = "SELECT * FROM chitietphieunhap WHERE idSP = ? and Idphieunhap = ?";

        try (PreparedStatement selectStmt = Connect.connect().prepareStatement(selectQuery)) {
            selectStmt.setString(1, ctsp.getMasp());
            selectStmt.setString(2, ctsp.getIdPhieunhap());
            ResultSet resultSet = selectStmt.executeQuery();

            if (resultSet.next()) {
                int currentQuantity = resultSet.getInt("soluong");
                int newQuantity = currentQuantity + ctsp.getSoluong();

                String updateQuery = "UPDATE chitietphieunhap SET soluong = ? WHERE masanpham = ?";
                try (PreparedStatement updateStmt = Connect.connect().prepareStatement(updateQuery)) {
                    updateStmt.setInt(1, newQuantity);
                    updateStmt.setString(2, ctsp.getMasp());
                    updateStmt.executeUpdate();
                }
            } else {
                String insertQuery = "INSERT INTO Chitietphieunhap (Idphieunhap, masanpham, tensanpham, dongia, soluong, thanhtien, link) VALUES (?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement insertStmt = Connect.connect().prepareStatement(insertQuery)) {
                    insertStmt.setString(1, ctsp.getIdPhieunhap());
                    insertStmt.setString(2, ctsp.getMasp());
                    insertStmt.setString(3, ctsp.getTensp());
                    insertStmt.setDouble(4, ctsp.getDongia());
                    insertStmt.setInt(5, ctsp.getSoluong());
                    insertStmt.setDouble(6, ctsp.getThanhtien());
                    insertStmt.setString(7, ctsp.getLink());

                    int result = insertStmt.executeUpdate();

                    if (result > 0) {

                        updateTongTien(ctsp);

                        JOptionPane.showMessageDialog(null, "Thêm dữ liệu Chi tiết phiếu nhập thành công!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Thêm dữ liệu thất bại!");
                    }
                }
            }
        }
    }

    private void updateTongTien(CtphieunhapDTO ctsp) throws SQLException {
        // Lấy tổng tiền hiện tại từ phieunhap
        String selectPhieunhapQuery = "SELECT tongtien FROM phieunhap WHERE Idphieunhap = ?";
        double currentTongTien = 0;

        try (PreparedStatement selectPhieunhapStmt = Connect.connect().prepareStatement(selectPhieunhapQuery)) {
            selectPhieunhapStmt.setString(1, ctsp.getIdPhieunhap());
            ResultSet rs = selectPhieunhapStmt.executeQuery();
            if (rs.next()) {
                currentTongTien = rs.getDouble("tongtien");
            }
        }

        // Tính toán tổng tiền mới
        double newTongTien = currentTongTien + ctsp.getThanhtien();

        // Cập nhật tổng tiền trong phieunhap
        String updatePhieunhapQuery = "UPDATE phieunhap SET tongtien = ? WHERE Idphieunhap = ?";
        try (PreparedStatement updatePhieunhapStmt = Connect.connect().prepareStatement(updatePhieunhapQuery)) {
            updatePhieunhapStmt.setDouble(1, newTongTien);
            updatePhieunhapStmt.setString(2, ctsp.getIdPhieunhap());
            updatePhieunhapStmt.executeUpdate();
        }
    }

    public ArrayList<CtphieunhapDTO> readData(String id) {
        ArrayList<CtphieunhapDTO> list = new ArrayList<>();
        try {
            PreparedStatement pstmt = Connect.connect().prepareStatement("SELECT * FROM chitietphieunhap WHERE Idphieunhap = ?");
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                CtphieunhapDTO imp = new CtphieunhapDTO();
                imp.setIdCtphieunhhap(rs.getString("idphieunhap"));
                imp.setMasp(rs.getString("idsp"));
                imp.setSoluong(rs.getInt("soluong"));
                imp.setThanhtien(rs.getDouble("thanhtien"));
                list.add(imp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
