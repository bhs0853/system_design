package behavioral_patterns.strategy_pattern.better_code;

public class Main {
    public static void main(String[] args){
        PaymentProcessor paymentProcessor = new PaymentProcessor(new CreditCardStrategy());
        paymentProcessor.processPayment();
        paymentProcessor.setPaymentStrategy(new PayPalStrategy());
        paymentProcessor.processPayment();
    }
}
