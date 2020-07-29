import net.sf.jasperreports.engine.*;

public class PdfCompiler {
    public static void main(String[]args) throws Exception {
        JasperReport jasperReport = JasperCompileManager.compileReport("C:\\Users\\User\\report3.jrxml");

        JRDataSource jrDataSource = new JREmptyDataSource();

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, jrDataSource);

        JasperExportManager.exportReportToPdfFile(jasperPrint, "C:\\Users\\User\\report3.pdf");
    }
}
