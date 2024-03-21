package solid_principles.ocd.example1.better_code;

public class PDFType implements IReportType{
    @Override
    public void generateReport(){
        System.out.println("pdf report generated");
    }
}
