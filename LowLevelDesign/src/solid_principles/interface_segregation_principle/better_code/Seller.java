package solid_principles.interface_segregation_principle.better_code;

import solid_principles.interface_segregation_principle.better_code.ICanApprove;

public class Seller implements ICanSell,ICanBuy,ICanModify {

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
