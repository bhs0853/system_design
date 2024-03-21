package solid_principles.ocd.example1.better_code;

public class WordReport implements IReportType{
    @Override
    public void generateReport() {
        System.out.println("word report generated");
    }
}
