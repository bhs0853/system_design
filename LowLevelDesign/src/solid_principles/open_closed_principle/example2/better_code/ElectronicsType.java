package solid_principles.open_closed_principle.example2.better_code;

public class ElectronicsType implements IProduct{
    int price = 10000;
    double discount = 0.12;
    @Override
    public IProduct getType() {
        return new ElectronicsType();
    }
    public int getPrice(){
        return price;
    }
    public double getDiscount(){
        return discount;
    }
}
