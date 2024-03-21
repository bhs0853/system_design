package solid_principles.ocd.example3.better_code;

public class VehicleInsuranceEvaluator {
    public InsuranceQuote evaluateInsurance(IVehicleType vehicleType){
        return new InsuranceQuote(vehicleType);
    }
}
