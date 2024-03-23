package solid_principles.open_closed_principle.example2.better_code;

public class DiscountCalculator {
    public double calculateDiscount(IProduct product){
        return product.getPrice()*product.getDiscount();
    }
}
