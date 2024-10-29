package solid_principles.open_closed_principle.example4.better_code;

public class Main {
    public static void main(String[] args){
        iVehicle car = new Car(2100000);
        iVehicle truck = new Truck(3500000);
        VehicleInsuranceEvaluator evaluator = new VehicleInsuranceEvaluator();
        evaluator.evaluateInsurance(car);
        evaluator.evaluateInsurance(truck);
    }
}
