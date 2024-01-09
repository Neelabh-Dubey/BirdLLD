package org.bird;

public class Sparrow extends AirFlightBird{
    public Sparrow(int legs, double weight, Color color) {
        super(legs, weight, color);
    }

    @Override
    public void introduce(){
        System.out.println("Hi, I am Sparrow.");
        super.introduce();
    }
}
