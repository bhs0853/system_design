package solid_principles.open_closed_principle.example3.better_code;

public class VehicleInsuranceEvaluator {
    public InsuranceQuote evaluateInsurance(IVehicleType vehicleType){
        return new InsuranceQuote(vehicleType);
    }
}
