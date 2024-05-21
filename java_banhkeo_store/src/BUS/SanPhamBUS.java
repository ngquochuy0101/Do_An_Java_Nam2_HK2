package BUS;

import DAO.SanPhamDAO;
import DTO.SanPhamDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public class SanPhamBUS {

    public ArrayList<SanPhamDTO> dssp;

    public SanPhamBUS() {
    }

    /**
     *
     * @return
     * @throws SQLException
     */
    public ArrayList docDSSP() throws SQLException {
        SanPhamDAO data = new SanPhamDAO();
        if (dssp == null) {
            dssp = new ArrayList<SanPhamDTO>();
        }
        dssp = data.docDSSP();
        return dssp;
    }

    public void them(SanPhamDTO sp) throws SQLException {
        docDSSP();
        for (SanPhamDTO spDTO : dssp) {
            if (sp.getIdSP() == spDTO.getIdSP()) {
                System.out.println(" id da ton tai trong list!");
                return;
            }
        }
        SanPhamDAO dataDao = new SanPhamDAO();
        dataDao.them(sp);
        dssp.add(sp);
    }

    public void capNhat(SanPhamDTO sp) throws SQLException {
        docDSSP();
        boolean daCapNhat = false;
        for (int i = 0; i < dssp.size(); i++) {
            if (sp.getIdSP() == dssp.get(i).getIdSP()) {
                SanPhamDAO dataDao = new SanPhamDAO();
                dataDao.update(sp);
                dssp.set(i, sp);
                daCapNhat = true;
                break;
            }
        }
        if (!daCapNhat) {
            System.out.println("Không tìm thấy sản phẩm với id: " + sp.getIdSP() + " để cập nhật.");
        }
    }

    public void xoa(SanPhamDTO sp) throws SQLException {
        docDSSP();
        boolean daXoa = false;
        for (int i = 0; i < dssp.size(); i++) {
            if (sp.getIdSP() == dssp.get(i).getIdSP()) {
                SanPhamDAO dataDao = new SanPhamDAO();
                dataDao.xoa(sp);
                dssp.remove(i);
                daXoa = true;
                break;
            }
        }
        if (!daXoa) {
            System.out.println("Không tìm thấy sản phẩm với id: " + sp.getIdSP() + " để xóa.");
        }
    }

    public SanPhamDTO timKiem(int id) throws SQLException {
        docDSSP();
        for (SanPhamDTO sp : dssp) {
            if (sp.getIdSP() == id) {
                return sp;
            }
        }
        System.out.println("Không tìm thấy sản phẩm với id: " + id);
        return null;
    }

    public static void main(String[] args) {
        try {
            SanPhamBUS bus = new SanPhamBUS();

            // Đọc danh sách sản phẩm
            bus.docDSSP();

            // Hiển thị danh sách sản phẩm
            System.out.println("Danh sách sản phẩm:");
            for (SanPhamDTO sp : bus.dssp) {
                System.out.println("ID: " + sp.getIdSP());
                System.out.println("Tên sản phẩm: " + sp.getTenSP());
                // Hiển thị thêm các thông tin khác của sản phẩm
                System.out.println("-----------------------------------");
            }

            // Thêm sản phẩm mới
            SanPhamDTO newProduct = new SanPhamDTO("1123", 2, "2024-1-1", "2024-1-1", "hinh12.jpg", 10, 1, 1);
            // Thiết lập thông tin cho sản phẩm mới
            // newProduct.setIdSP(...);
            // newProduct.setTenSP(...);
            // ...
            bus.them(newProduct);

            // Cập nhật thông tin sản phẩm
            int productIdToUpdate = 4; // ID sản phẩm cần cập nhật
            SanPhamDTO productToUpdate = bus.timKiem(productIdToUpdate);
            if (productToUpdate != null) {
                // Cập nhật thông tin cho sản phẩm
                // productToUpdate.setTenSP(...);
                // productToUpdate.setSoLuongSpConLai(...);
                // ...
                productToUpdate.setDonGia(13123);
                bus.capNhat(productToUpdate);
            }

            // Xóa sản phẩm
            int productIdToDelete = 2; // ID sản phẩm cần xóa
            SanPhamDTO productToDelete = bus.timKiem(productIdToDelete);
            if (productToDelete != null) {
                bus.xoa(productToDelete);
            }

            // Tìm kiếm sản phẩm
            int productIdToSearch = 3; // ID sản phẩm cần tìm kiếm
            SanPhamDTO searchedProduct = bus.timKiem(productIdToSearch);
            if (searchedProduct != null) {
                System.out.println("Tìm thấy sản phẩm:");
                System.out.println("ID: " + searchedProduct.getIdSP());
                System.out.println("Tên sản phẩm: " + searchedProduct.getTenSP());
                // Hiển thị thêm các thông tin khác của sản phẩm
            }

        } catch (SQLException e) {
            System.out.println("Lỗi khi thao tác với cơ sở dữ liệu: " + e.getMessage());
        }
    }
}