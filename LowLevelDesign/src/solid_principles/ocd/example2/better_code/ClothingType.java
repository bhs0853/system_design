package solid_principles.ocd.example2.better_code;

public class ClothingType implements IProduct{
    int price = 1500;
    double discount = 0.2;
    @Override
    public IProduct getType() {
        return new ClothingType();
    }
    @Override
    public int getPrice() {
        return price;
    }
    public double getDiscount(){
        return discount;
    }
}
