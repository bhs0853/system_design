package solid_principles.open_closed_principle.example4.better_code;

public class VehicleInsuranceEvaluator {
    public InsuranceQuote evaluateInsurance(iVehicle vehicle){
        return vehicle.evaluate();
    }
}
