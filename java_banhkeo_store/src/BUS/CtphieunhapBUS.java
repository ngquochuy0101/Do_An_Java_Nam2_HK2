/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.CtphieunhapDAO;
import DTO.CtphieunhapDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
/**
 *
 * @author DELL
 */
public class CtphieunhapBUS {
     CtphieunhapDAO CtpnDao = new CtphieunhapDAO();
     ArrayList DsCtpn = new ArrayList<CtphieunhapDTO>();
    public CtphieunhapBUS(){
         CtpnDao = new CtphieunhapDAO();
          DsCtpn = new ArrayList<CtphieunhapDTO>();
    }
    
    public void luuCtpn(CtphieunhapDTO ctsp) throws SQLException{
        
        CtpnDao.addctsp(ctsp);
        DsCtpn.add(ctsp);
        
    }
    public void ReadData(){
       if(DsCtpn== null){
          
//        impDTO = dao.readData();
      
       }
    
    }

    
}
