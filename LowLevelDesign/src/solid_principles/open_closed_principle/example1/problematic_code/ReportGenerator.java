package solid_principles.open_closed_principle.example1.problematic_code;

public class ReportGenerator {
    public String generateReport(String reportType) {
        if (reportType.equals("PDF")) {
            return "Generating PDF report.";
        } else if (reportType.equals("Word")) {
            return "Generating Word report.";
        }
        return "Report type not supported.";
    }
}
