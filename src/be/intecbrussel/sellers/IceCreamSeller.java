package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public interface IceCreamSeller extends Profitable {
    public Cone orderCone(Flavor[] flavor);
    public IceRocket orderIceRocket();
    public Magnum orderMagnum(MagnumType magnumType);
}
