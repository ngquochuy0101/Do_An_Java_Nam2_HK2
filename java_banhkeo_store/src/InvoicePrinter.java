import java.awt.*;
import java.awt.print.*;

public class InvoicePrinter implements Printable {

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex > 0) {
            return NO_SUCH_PAGE;
        }

        Graphics2D g2d = (Graphics2D) graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

        // Vẽ nội dung hóa đơn
        // Ví dụ:
        g2d.setFont(new Font("Arial", Font.BOLD, 12));
        g2d.drawString("Hóa đơn in ấn", 100, 100);
        g2d.drawString("Ngày: 18/05/2024", 100, 120);
        g2d.drawString("Tổng tiền: 100.000 VND", 100, 140);

        return PAGE_EXISTS;
    }

    public static void main(String[] args) {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(new InvoicePrinter());

        boolean doPrint = job.printDialog();
        if (doPrint) {
            try {
                job.print();
            } catch (PrinterException e) {
                e.printStackTrace();
            }
        }
    }
}