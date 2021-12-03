package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.NoMoreIceCreamException;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamAppV2 {
    public static void main(String[] args) {
        PriceList priceList = new PriceList(0.50, 0.80, 1.0);
        Stock stock = new Stock();
        stock.setBalls(15);
        stock.setCones(20);
        stock.setMagnum(10);
        stock.setIceRockets(0);
        IceCreamCar iceCreamCar = new IceCreamCar(priceList, stock);

        try {
            iceCreamCar.orderMagnum(Magnum.MagnumType.ALPINENUTS);

        } catch (NoMoreIceCreamException e) {
            System.out.println(e);
        }
        try {
            Cone.Flavor[] flavors = {Cone.Flavor.BANANA, Cone.Flavor.LEMON, Cone.Flavor.CHOCOLATE};
            iceCreamCar.orderCone(flavors);

        } catch (NoMoreIceCreamException e) {
            System.out.println(e);
        }
        try {
            iceCreamCar.orderIceRocket();

        } catch (NoMoreIceCreamException e) {
            System.out.println(e);
        }

        System.out.println("profit: " + iceCreamCar.getProfit());


    }
}
