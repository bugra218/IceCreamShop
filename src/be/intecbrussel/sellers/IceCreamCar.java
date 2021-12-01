package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamCar implements IceCreamSeller {
    private PriceList priceList;
    private Stock stock;
    private double profit;

    @Override
    public Cone orderCone(Flavor[] flavor) {
        return null;
    }
    public Cone prepareCone(Flavor[] flavor){
        return null;
    }

    @Override
    public IceRocket orderIceRocket() {
        return null;
    }
    public IceRocket prepareRocket(){
        return null;
    }


    @Override
    public Magnum orderMagnum(MagnumType magnumType) {
        return null;
    }
    public Magnum prepareMagnum(MagnumType magnumType){
        return null;
    }

    @Override
    public double getProfit() {
        return 0;
    }
}
