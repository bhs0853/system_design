package solid_principles.interface_segregation_principle.problematic_code;

public class Admin implements IUser{
    @Override
    public boolean canBuy() {
        return false;
    }

    @Override
    public boolean canSell() {
        return false;
    }

    @Override
    public boolean canApprove() {
        return false;
    }

    @Override
    public boolean canModify() {
        return false;
    }
}
