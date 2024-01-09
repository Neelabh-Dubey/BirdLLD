package org.bird;

public class AirFlightBird extends BaseBird implements Flyable{

    public AirFlightBird(int legs, double weight, Color color) {
        super(legs, weight, color);
    }

    @Override
    public void fly() {
        System.out.println("Can fly in air!");
    }
}
