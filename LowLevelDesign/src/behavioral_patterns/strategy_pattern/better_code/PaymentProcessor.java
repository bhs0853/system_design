package behavioral_patterns.strategy_pattern.better_code;

public class PaymentProcessor {
    PaymentStrategy paymentStrategy;
    public PaymentProcessor(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(){
        paymentStrategy.pay();
    }
}
