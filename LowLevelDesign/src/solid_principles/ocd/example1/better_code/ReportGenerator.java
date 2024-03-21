package solid_principles.ocd.example1.better_code;

public class ReportGenerator {
    public void generateReport(IReportType type){
        type.generateReport();
    }
}

