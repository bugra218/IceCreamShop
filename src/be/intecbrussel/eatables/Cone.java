package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eatable {

    private Flavor[] balls = new Flavor[0];

    public Cone(){

    }
    public Cone(Flavor[] balls){
        this.balls=balls;
    }



    @Override
    public void eat() {

        System.out.println("Eating a Cone with flavors: "+ Arrays.toString(balls));


    }

    public enum Flavor {

        STRAWBERRY,
        BANANA,
        CHOCOLATE,
        VANILLA,
        LEMON,
        STRACIATELLA,
        MOKKA,
        PISTACHE;
    }




}
