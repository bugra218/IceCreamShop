package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamSalon implements IceCreamSeller {

    private PriceList priceList;
    private double totalProfit = 0;


    public IceCreamSalon() {
        this(new PriceList());

    }

    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;

    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavor) {
        Cone cone = new Cone(flavor);
        totalProfit = totalProfit + priceList.getBallPrice() * flavor.length;

        return cone;
    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket iceRocket = new IceRocket();
        totalProfit = totalProfit + priceList.getRocketPrice();
        return iceRocket;
    }

    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        Magnum magnum = new Magnum(magnumType);
        totalProfit = totalProfit + priceList.getMagnumPrice(magnumType);

        return magnum;
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }
    @Override
    public String toString() {
        return "IceCreamSalon totalProfit=" + totalProfit;
    }
}
