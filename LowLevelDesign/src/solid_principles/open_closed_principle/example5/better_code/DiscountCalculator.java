package solid_principles.open_closed_principle.example5.better_code;

public class DiscountCalculator {
    public String calculateDiscount(iProduct product){
        return product.getType()+" Actual Price: "+product.getPrice()+" Discount: "+ product.getPrice()*product.getDiscount();
    }
}
