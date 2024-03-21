package solid_principles.ocd.example2.better_code;

public class Main {
    public static void main(String[] args){
        DiscountCalculator dc = new DiscountCalculator();
        ElectronicsType e = new ElectronicsType();
        ClothingType c = new ClothingType();
        System.out.println(dc.calculateDiscount(e));
        System.out.println(dc.calculateDiscount(c));
    }
}
