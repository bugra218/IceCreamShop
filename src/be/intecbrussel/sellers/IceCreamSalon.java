package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamSalon implements IceCreamSeller{

    private PriceList priceList;
    private double totalProfit;

    @Override
    public Cone orderCone(Flavor[] flavor) {
        return null;
    }

    @Override
    public IceRocket orderIceRocket() {
        return null;
    }

    @Override
    public Magnum orderMagnum(MagnumType magnumType) {
        return null;
    }

    @Override
    public double getProfit() {
        return 0;
    }
    public String toString(){
        return null;
    }
}
