package solid_principles.liskov_substitution_principle.better_code;

public interface ICreditCard {

    void tapAndPay();

    void onlineTransfer();

    void swipeAndPay();

    void mandatePayments();

    void displayCreditCardDetails();
}
