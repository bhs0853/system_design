package solid_principles.open_closed_principle.example4.better_code;

public class Car implements iVehicle{
    private final int costPrice;
    public Car(int costPrice){
        this.costPrice = costPrice;
    }
    @Override
    public InsuranceQuote evaluate() {
        return new InsuranceQuote("Car", costPrice);
    }
}
