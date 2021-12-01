package be.intecbrussel.eatables;

public class Cone implements Eatable {

    private Flavor[] balls = new Flavor[0];

    public Cone(){

    }
    public Cone(Flavor[] balls){
        this.balls=balls;
    }



    @Override
    public void eat() {

    }
}
