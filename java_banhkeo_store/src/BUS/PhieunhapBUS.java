/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.PhieunhapDAO;
import DTO.PhieunhapDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class PhieunhapBUS {

    ArrayList<PhieunhapDTO> dspn = new ArrayList();

    PhieunhapDAO PnDao = new PhieunhapDAO();

    public PhieunhapBUS() throws SQLException {
        dspn = new ArrayList<>();
        PnDao = new PhieunhapDAO();

    }

    public ArrayList<PhieunhapDTO> Docdspn() {
        dspn = PnDao.DocDSPN();
        return dspn;

    }

    public void DeleteData(PhieunhapDTO pn) {
        boolean kt = PnDao.DeleteData(pn);
        if (kt) {
            for (PhieunhapDTO ds : dspn) {
                if (ds.getIdPhieunhap() == pn.getIdPhieunhap()) {
                    dspn.remove(ds);
                }
                JOptionPane.showMessageDialog(null, "Xóa dữ liệu thanh công!");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Xóa dữ liệu thất bại!");
        }
    }

    public void LuuBus(PhieunhapDTO pn) throws SQLException {

        if (PnDao.add(pn)) {
            dspn.add(pn);

        }else
        {
            JOptionPane.showMessageDialog(null,"Thêm dữ liệu thất bại" );
        }
    }

    public ArrayList<PhieunhapDTO> TiemkiemtheoTimeBus(String date) {
      ArrayList<PhieunhapDTO> list = new ArrayList<>();
      for(PhieunhapDTO pn: dspn){
          if(pn.getNgaynhap().equals(date)){
              list.add(pn);
          }
      }
        
      return list;
    
    }
}
