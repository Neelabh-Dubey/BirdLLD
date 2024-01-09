package org.bird;

public class Penguin extends GroundFlightBird{

    public Penguin(int legs, double weight, Color color) {
        super(legs, weight, color);
    }

    @Override
    public void introduce(){
        System.out.println("Hi, I am Penguin.");
        super.introduce();
    }
}
