package solid_principles.liskov_substitution_principle.better_code;

public class RuPayCard implements ICreditCard, IUpiSupportedCreditCards{
    private String ccNumber;

    private String ownerName;

    private int cvv;
    public RuPayCard(String ccNumber,String ownerName,int cvv){
        this.ccNumber = ccNumber;
        this.ownerName = ownerName;
        this.cvv = cvv;
    }

    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay impl of RuPay");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer impl of RuPay");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay impl of RuPay");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate payment impl of RuPay");
    }

    @Override
    public void displayCreditCardDetails() {
        System.out.println("CC Number: " + this.ccNumber + " , With Owner Name: " +this.ownerName);
    }

    @Override
    public void upiPayment() {
        System.out.println("UPI payment impl of RuPay");
    }

}
