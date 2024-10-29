package solid_principles.open_closed_principle.example3.better_code;

public class ReportDocType implements iReportType{
    @Override
    public String generateReport() {
        return ("Generating report doc");
    }
}
