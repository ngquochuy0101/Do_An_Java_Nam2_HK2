/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DTO.LoaiSanPhamDTO;
import DTO.SQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author anhhu
 */
public class LoaiSPDAO {
        SQLConnection connection = new SQLConnection();

    public LoaiSPDAO() throws SQLException {
        connection.connect("jdbc:mysql://localhost:3306/qlsieuthimini", "root", "");
    }
        
            public ArrayList<LoaiSanPhamDTO> docDSSP() {
        ArrayList<LoaiSanPhamDTO> danhSachSanPham = new ArrayList<>();
        try {
            String query = "SELECT * FROM loaisp";
            System.out.println(query);
            ResultSet resultSet = connection.executeQuery(query);
            while (resultSet.next()) {
                LoaiSanPhamDTO sanPham = new LoaiSanPhamDTO();
                sanPham.setTenLoaiSP(resultSet.getString("tenLoaiSP"));
                sanPham.setIdLoaiSP(resultSet.getInt("idLoaiSP"));
                sanPham.setDacTinh(resultSet.getString("dacTinh"));
                danhSachSanPham.add(sanPham);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi lấy danh sách sản phẩm: " + e.getMessage());
        }
        return danhSachSanPham;
    }
    }

