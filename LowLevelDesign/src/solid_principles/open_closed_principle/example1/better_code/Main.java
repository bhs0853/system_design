package solid_principles.open_closed_principle.example1.better_code;

public class Main {
    public static void main(String[] args){
        ReportGenerator r = new ReportGenerator();
        PDFType p = new PDFType();
        WordReport w = new WordReport();
        r.generateReport(p);
        r.generateReport(w);



    }
}
