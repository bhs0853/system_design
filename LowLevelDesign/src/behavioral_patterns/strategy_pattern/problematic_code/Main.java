package behavioral_patterns.strategy_pattern.problematic_code;

class PaymentProcessor {
    public void processPayment(String paymentType, double amount) {
        if (paymentType.equals("CreditCard")) {
            System.out.println("Processing credit card payment of $" + amount);
            // Credit card payment logic
        } else if (paymentType.equals("PayPal")) {
            System.out.println("Processing PayPal payment of $" + amount);
            // PayPal payment logic
        } else if (paymentType.equals("Bitcoin")) {
            System.out.println("Processing Bitcoin payment of $" + amount);
            // Bitcoin payment logic
        } else {
            System.out.println("Unsupported payment method");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment("CreditCard", 150.00);
        processor.processPayment("PayPal", 250.00);
    }
}
