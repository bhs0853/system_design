package solid_principles.liskov_substitution_principle.better_code;

public class MasterCard implements ICreditCard,IInternationalSupportedCreditCards{
    private String ccNumber;

    private String ownerName;

    private int cvv;

    public MasterCard(String ccNumber,String ownerName,int cvv){
        this.ccNumber = ccNumber;
        this.ownerName = ownerName;
        this.cvv = cvv;
    }

    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay impl of MasterCard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer impl of MasterCard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay impl of MasterCard");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate payment impl of MasterCard");
    }

    @Override
    public void displayCreditCardDetails() {
        System.out.println("CC Number: " + this.ccNumber + " , With Owner Name: " +this.ownerName);
    }


    @Override
    public void intlPayment() {
        System.out.println("Intl payment impl of MasterCard");
    }
}
