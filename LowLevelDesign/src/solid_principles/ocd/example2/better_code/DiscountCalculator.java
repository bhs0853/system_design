package solid_principles.ocd.example2.better_code;

public class DiscountCalculator {
    public double calculateDiscount(IProduct product){
        return product.getPrice()*product.getDiscount();
    }
}
