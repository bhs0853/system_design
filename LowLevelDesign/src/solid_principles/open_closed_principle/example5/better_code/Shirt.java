package solid_principles.open_closed_principle.example5.better_code;

import jdk.jshell.spi.SPIResolutionException;

public class Shirt implements iClothing{
    private final int price;
    public Shirt(int price){
        this.price = price;
    }
    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public double getDiscount() {
        return discountRate;
    }
}
