package solid_principles.open_closed_principle.example1.better_code;

public class WordReport implements IReportType{
    @Override
    public void generateReport() {
        System.out.println("word report generated");
    }
}