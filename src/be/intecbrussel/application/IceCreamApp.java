package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.*;


public class IceCreamApp {
    public static void main(String[] args) {
        PriceList priceList = new PriceList(0.50,0.80,1.0);
        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList);
        Cone.Flavor[] flavors = {Cone.Flavor.BANANA, Cone.Flavor.LEMON, Cone.Flavor.CHOCOLATE};
        Eatable[] order = {iceCreamSalon.orderIceRocket(),iceCreamSalon.orderCone(flavors),iceCreamSalon.orderMagnum(Magnum.MagnumType.ALPINENUTS)};
        for (Eatable eatable : order) {
            eatable.eat();

        }
        iceCreamSalon.getProfit();


    }
}