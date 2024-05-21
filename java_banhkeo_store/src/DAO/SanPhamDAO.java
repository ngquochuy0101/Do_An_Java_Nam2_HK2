package DAO;

import DTO.SQLConnection;
import DTO.SanPhamDTO;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;

public class SanPhamDAO {

    SQLConnection connection = new SQLConnection();

    public SanPhamDAO() throws SQLException {
        connection.connect("jdbc:mysql://localhost:3306/qlsieuthimini", "root", "");

    }

    public void them(SanPhamDTO sp) {
        try {

            String query = "INSERT INTO sanpham (tenSP, soLuongSpConLai, HSD, NSX, hinhAnhMinhHoa, donGia, idLoaiSP, idChiTietSP) VALUES ('"
                    + sp.getTenSP() + "','"
                    + sp.getSoLuongSpConLai() + "','"
                    + sp.getHSD() + "','"
                    + sp.getNSX() + "','"
                    + sp.getHinhAnhMinhHoa() + "',"
                    + sp.getDonGia() + ","
                    + sp.getIdLoaiSP() + ","
                    + sp.getIdChiTietSP() + ")";

            System.out.println(query);
            connection.executeUpdate(query);
            System.out.println("Thêm sản phẩm thành công");

        } catch (SQLException e) {
            System.out.println("Lỗi khi thêm sản phẩm: " + e.getMessage());
        }
    }

    public void update(SanPhamDTO sp) {
        try {

            String query = "UPDATE sanpham SET "
                    + "tenSP='" + sp.getTenSP() + "', "
                    + "soLuongSpConLai='" + sp.getSoLuongSpConLai() + "', "
                    + "HSD='" + sp.getHSD() + "', "
                    + "NSX='" + sp.getNSX() + "', "
                    + "hinhAnhMinhHoa='" + sp.getHinhAnhMinhHoa() + "', "
                    + "donGia='" + sp.getDonGia() + "', "
                    + "idLoaiSP='" + sp.getIdLoaiSP() + "', "
                    + "idChiTietSP='" + sp.getIdChiTietSP() + "' "
                    + "WHERE idSP='" + sp.getIdSP() + "'";

            System.out.println(query);
            connection.executeUpdate(query);
            System.out.println("Sửa sản phẩm thành công");

        } catch (SQLException e) {
            System.out.println("Lỗi khi sua sản phẩm: " + e.getMessage());
        }
    }

    public void xoa(SanPhamDTO sp) {
        try {

            String query = "Update sanpham set soLuongSpConLai= 0 WHERE idSP='" + sp.getIdSP() + "'";
            System.out.println(query);
            connection.executeUpdate(query);
            System.out.println("Xóa sản phẩm thành công");

        } catch (SQLException e) {
            System.out.println("Lỗi khi xoa sản phẩm: " + e.getMessage());
        }
    }

    public SanPhamDTO timkiem(int id) {
        try {

            String query = "SELECT * FROM sanpham WHERE idSP='" + id + "'";
            System.out.println(query);
            ResultSet resultset = connection.executeQuery(query);
            System.out.println("Tìm sản phẩm thành công");

            if (resultset.next()) {
                SanPhamDTO spdto = new SanPhamDTO(resultset.getInt(1), resultset.getString(2),
                        resultset.getInt(3), resultset.getString(4),
                        resultset.getString(5), resultset.getString(6), resultset.getInt(7),
                        resultset.getInt(8), resultset.getInt(9));
                System.out.println(spdto.getDonGia());
                return spdto;
            } else {
                System.out.println("Không tìm thấy sản phẩm với id: " + id);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi tìm sản phẩm: " + e.getMessage());
        }
        return null;
    }

    public ArrayList<SanPhamDTO> docDSSP() {
        ArrayList<SanPhamDTO> danhSachSanPham = new ArrayList<>();
        try {
            String query = "SELECT * FROM sanpham";
            System.out.println(query);
            ResultSet resultSet = connection.executeQuery(query);
            while (resultSet.next()) {
                SanPhamDTO sanPham = new SanPhamDTO();
                sanPham.setIdSP(resultSet.getInt("idSP"));
                sanPham.setTenSP(resultSet.getString("tenSP"));
                sanPham.setSoLuongSpConLai(resultSet.getInt("soLuongSpConLai"));
                sanPham.setHSD(resultSet.getString("HSD"));
                sanPham.setNSX(resultSet.getString("NSX"));
                sanPham.setHinhAnhMinhHoa(resultSet.getString("hinhAnhMinhHoa"));
                sanPham.setDonGia((int) resultSet.getFloat("donGia"));
                sanPham.setIdLoaiSP(resultSet.getInt("idLoaiSP"));
                sanPham.setIdChiTietSP(resultSet.getInt("idChiTietSP"));
                danhSachSanPham.add(sanPham);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi lấy danh sách sản phẩm: " + e.getMessage());
        }
        return danhSachSanPham;
    }

    public static void main(String[] args) throws SQLException {
        SanPhamDTO sp = new SanPhamDTO();
        sp.setTenSP("Tên sản phẩm");
        sp.setSoLuongSpConLai(10);
        sp.setHSD("2024-12-31");
        sp.setNSX("2024-12-10");
        sp.setHinhAnhMinhHoa("path/to/image.jpg");
        sp.setDonGia(100000);
        sp.setIdLoaiSP(1);
        sp.setIdChiTietSP(1);

        SanPhamDAO sanPhamDao = new SanPhamDAO();
        sanPhamDao.them(sp);
        sanPhamDao.xoa(sp);
        ArrayList<SanPhamDTO> dsspArrayList = new ArrayList<>();
        dsspArrayList = sanPhamDao.docDSSP();
        for (SanPhamDTO sanPham : dsspArrayList) {
            System.out.println(sanPham.toString());
        }
    }
}
