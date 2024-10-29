package solid_principles.open_closed_principle.example3.better_code;

public class ReportPdfType implements iReportType{
    @Override
    public String generateReport() {
        return ("Generating report pdf");
    }
}
