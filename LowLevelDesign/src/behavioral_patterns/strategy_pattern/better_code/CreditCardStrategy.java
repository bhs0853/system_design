package behavioral_patterns.strategy_pattern.better_code;

public class CreditCardStrategy implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("payment processed using credit card");
    }
}
