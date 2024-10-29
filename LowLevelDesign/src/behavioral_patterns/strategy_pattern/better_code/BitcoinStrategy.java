package behavioral_patterns.strategy_pattern.better_code;

public class BitcoinStrategy implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("processed payment using bitcoin");
    }
}
