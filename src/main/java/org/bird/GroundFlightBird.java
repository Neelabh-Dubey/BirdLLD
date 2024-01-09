package org.bird;

public class GroundFlightBird extends BaseBird implements GroundFlight{

    public GroundFlightBird(int legs, double weight, Color color) {
        super(legs, weight, color);
    }

    @Override
    public void fly() {
        System.out.println("Cant fly, just can run!");
    }
}
