package solid_principles.open_closed_principle.example3.better_code;

public class ReportGenerator {
    public String generateReportFile(iReportType type){
        return type.generateReport();
    }
}
