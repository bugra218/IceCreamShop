package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;

public class PriceList {
    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;
    public PriceList(){
        this(0.50,0.80,1);

    }
    public PriceList(double ballPrice,double rocketPrice,double magnumStandardPrice){
        this.ballPrice=ballPrice;
        this.rocketPrice=rocketPrice;
        this.magnumStandardPrice=magnumStandardPrice;

    }
    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public double getMagnumPrice(Magnum.MagnumType MagnumType) {
        double magnumPrice = magnumStandardPrice;
        switch (MagnumType) {
            case ALPINENUTS:
                magnumPrice *= 1.5;
                break;
            case BLACKCHOCOLATE:
            case WHITECHOCOLATE:
            case MILKCHOCOLATE:
                magnumPrice *= 1;
                break;
            case ROMANTICSTRAWBERRIES:
                magnumPrice *= 1.8;
                break;
        }
        return magnumPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }

}
