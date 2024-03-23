package solid_principles.open_closed_principle.example2.better_code;

public interface IProduct {
    int getPrice();
    IProduct getType();
    double getDiscount();
}
