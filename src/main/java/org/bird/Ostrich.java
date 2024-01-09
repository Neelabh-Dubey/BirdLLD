package org.bird;

public class Ostrich extends GroundFlightBird{

    public Ostrich(int legs, double weight, Color color) {
        super(legs, weight, color);
    }

    @Override
    public void introduce(){
        System.out.println("Hi, I am Ostrich.");
        super.introduce();
    }
}
