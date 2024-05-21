/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;
import DAO.LoaiSPDAO;
import DTO.LoaiSanPhamDTO;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author anhhu
 */
public class LoaiSPBUS {
    
    public ArrayList<LoaiSanPhamDTO> DSSP=new ArrayList<>();
    
    public LoaiSPBUS(){};
    
    public void doc() throws SQLException{
    LoaiSPDAO data = new LoaiSPDAO();
    if(DSSP == null){
    DSSP = new ArrayList<LoaiSanPhamDTO>();
    }
    DSSP = data.docDSSP();
    }
}
