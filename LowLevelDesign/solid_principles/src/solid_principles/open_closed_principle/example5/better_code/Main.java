package solid_principles.open_closed_principle.example5.better_code;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        iElectronics edge40 = new MobilePhone(25000);
        iElectronics edge50pro = new MobilePhone(31000);
        iClothing poloShirt = new Shirt(2100);
        List<iProduct> productList = new ArrayList<>();
        productList.add(edge40);
        productList.add(edge50pro);
        productList.add(poloShirt);
        DiscountCalculator dc = new DiscountCalculator();
        for(iProduct product: productList){
            System.out.println(dc.calculateDiscount(product));
        }

    }
}
