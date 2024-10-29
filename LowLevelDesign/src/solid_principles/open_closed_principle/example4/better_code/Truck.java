package solid_principles.open_closed_principle.example4.better_code;

public class Truck implements iVehicle{
    private final int costPrice;
    public Truck(int costPrice){
        this.costPrice = costPrice;
    }
    @Override
    public InsuranceQuote evaluate() {
        return new InsuranceQuote("Truck",costPrice);
    }
}
