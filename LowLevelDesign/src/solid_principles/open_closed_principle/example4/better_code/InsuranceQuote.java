package solid_principles.open_closed_principle.example4.better_code;

public class InsuranceQuote {
    private final double insuredAmount;
    private final double premiumAmount;
    public InsuranceQuote(String vehicleType,int costPrice){
        this.insuredAmount = costPrice*0.9;
        this.premiumAmount = costPrice*0.02;
        System.out.print(vehicleType + " cost: " + costPrice+" Insured Amount: ");
        System.out.print(this.insuredAmount+" Premium Amount: ");
        System.out.println(this.premiumAmount);
    }
//    public double getInsuredAmount() {
//        return insuredAmount;
//    }
//    public double getPremiumAmount() {
//        return premiumAmount;
//    }
}
