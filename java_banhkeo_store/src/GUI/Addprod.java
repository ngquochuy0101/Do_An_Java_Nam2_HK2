package GUI;

import DTO.SanPhamDTO;
import DTO.SanphamDTO_1;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Addprod extends JPanel {

    JLabel lb = new JLabel();
     JFrame f = new JFrame("Chi tiết sản phẩm");

    public Addprod(SanPhamDTO ad) throws IOException {
        setPreferredSize(new Dimension(160, 250)); // Đặt kích thước của JPanel
        setEnabled(true);
        setLayout(new BorderLayout()); // Sử dụng BorderLayout để sắp xếp các thành phần
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // Đặt viền cho panel

        JPanel p1 = new JPanel(new BorderLayout());
        JPanel p2 = new JPanel(new GridLayout(4, 1, 5, 5)); // Thêm khoảng cách giữa các hàng

        JLabel lb1 = new JLabel(ad.getTenSP(), SwingConstants.LEFT);
        JLabel lb2 = new JLabel("Giá: " + ad.getDonGia(), SwingConstants.LEFT);
        JLabel lb3 = new JLabel("Còn lại: " + ad.getSoLuongSpConLai(), SwingConstants.LEFT);
        JLabel lb4 = new JLabel("HSD: " + ad.getHSD(), SwingConstants.LEFT); // Hiển thị HSD từ DTO

        p2.add(lb1);
        p2.add(lb2);
        p2.add(lb3);
        p2.add(lb4);

        lb.setIcon(ResizeImage(ad.getHinhAnhMinhHoa()));
        p1.add(lb, BorderLayout.CENTER);

        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.SOUTH);
         addMouseListener(new java.awt.event.MouseAdapter(){
                    @Override
                    public void mouseClicked( java.awt.event.MouseEvent evt){
                     if(evt.getClickCount()== 2){
                         try {
                             ShowChitiet(ad);
                         } catch (SQLException ex) {
                             Logger.getLogger(Addprod.class.getName()).log(Level.SEVERE, null, ex);
                         }
                         
                        
                     }   
                    }
                });
        
    }

    public ImageIcon ResizeImage(String filepath) {
        ImageIcon MyImg = new ImageIcon(filepath);
        Image img = MyImg.getImage();
        Image newImg = img.getScaledInstance(160, 130, Image.SCALE_SMOOTH); // Đặt kích thước hình ảnh
        return new ImageIcon(newImg);
    }
    
    public void ShowChitiet(SanPhamDTO pn) throws SQLException{
//        System.out.println(""+pn.getIdSp());
//      JFrame f = new JFrame("Chi tiết sản phẩm");
       Themsanpham pal  = new Themsanpham();
        f = new JFrame("Chi tiết sản phẩm");
        f.setLayout(new CardLayout());
       pal.Hienthittsanpham(pn);
    f.add(pal);
//    f.setEnabled(false);
    f.setSize(870, 510);
     f.revalidate();
        f.repaint();
      
    f.setLocationRelativeTo(null);
    f.setVisible(true);
        
        
        
    }
}
