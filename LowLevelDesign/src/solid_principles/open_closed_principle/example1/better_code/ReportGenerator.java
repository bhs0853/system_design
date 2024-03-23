package solid_principles.open_closed_principle.example1.better_code;

public class ReportGenerator {
    public void generateReport(IReportType type){
        type.generateReport();
    }
}

