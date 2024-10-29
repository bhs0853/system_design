package solid_principles.open_closed_principle.example3.better_code;

public class Main {
    public static void main(String[] args){
        iReportType pdf = new ReportPdfType();
        iReportType doc = new ReportDocType();
        ReportGenerator rg = new ReportGenerator();
        System.out.println(rg.generateReportFile(pdf));
        System.out.println(rg.generateReportFile(doc));
    }
}
