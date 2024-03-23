package solid_principles.open_closed_principle.example1.better_code;

public class PDFType implements IReportType{
    @Override
    public void generateReport(){
        System.out.println("pdf report generated");
    }
}
