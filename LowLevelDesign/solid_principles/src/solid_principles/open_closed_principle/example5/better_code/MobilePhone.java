package solid_principles.open_closed_principle.example5.better_code;

public class MobilePhone implements iElectronics{
    private final int price;
    public MobilePhone(int price){
        this.price = price;
    }
    @Override
    public String getType() {
        return type;
    }
    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public double getDiscount() {
        return discountRate;
    }
}
