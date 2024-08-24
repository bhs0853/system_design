package solid_principles.interface_segregation_principle.problematic_code;

public interface IUser {
    boolean canBuy();
    boolean canSell();
    boolean canApprove();
    boolean canModify();
}
