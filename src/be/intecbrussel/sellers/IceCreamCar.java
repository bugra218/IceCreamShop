package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamCar implements IceCreamSeller {
    private PriceList priceList;
    private Stock stock;
    private double profit = 0;

    public IceCreamCar() {
        this(new PriceList(), new Stock());

    }

    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;

    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavor) {

        return this.prepareCone(flavor);
    }


    private Cone prepareCone(Cone.Flavor[] flavor) {
        if (stock.getCones() > 0) {
            if (stock.getBalls() > flavor.length) {
                profit = profit + priceList.getBallPrice() * flavor.length;
                stock.setCones(stock.getCones() - 1);
                stock.setBalls(stock.getBalls() - flavor.length);
                return new Cone(flavor);
            } else {
                throw new NoMoreIceCreamException("Balls out of stock");
            }

        } else {
            throw new NoMoreIceCreamException("Cones are out of stock");
        }
    }

    @Override
    public IceRocket orderIceRocket() {
        return this.prepareRocket();
    }

    private IceRocket prepareRocket() {
        if (stock.getIceRockets() > 0) {
            profit = profit + priceList.getRocketPrice();
            stock.setIceRockets(stock.getIceRockets() -1);
            return new IceRocket();
        } else {
            throw new NoMoreIceCreamException("Ice rockets are out of stock");
        }
    }


    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {

        return this.prepareMagnum(magnumType);
    }

    private Magnum prepareMagnum(Magnum.MagnumType magnumType) {
        if (stock.getMagnum() > 0) {
            profit = profit + priceList.getMagnumPrice(magnumType);
            stock.setMagnum(stock.getMagnum() -1);
            return new Magnum(magnumType);

        } else {
            throw new NoMoreIceCreamException("Magnums are out of stock");
    }}

    @Override
    public double getProfit() {
        return profit;
    }
}

