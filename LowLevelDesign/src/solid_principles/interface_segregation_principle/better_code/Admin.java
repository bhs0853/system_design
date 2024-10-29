package solid_principles.interface_segregation_principle.better_code;


public class Admin implements ICanApprove, ICanModify,ICanBuy, ICanSell {
    @Override
    public void approve() {
        
    }

    @Override
    public void buy() {

    }

    @Override
    public void modify() {

    }

    @Override
    public void sell() {

    }
}
