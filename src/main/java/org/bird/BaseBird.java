package org.bird;

public abstract class BaseBird {
    private final int legs;
    private final double weight;
    private final Color color;

    public BaseBird(int legs, double weight, Color color) {
        this.legs = legs;
        this.weight = weight;
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public double getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    public void introduce(){
        System.out.println("I am " + this.getColor() + " color bird.");
        System.out.println("I have " + this.getLegs() + " legs.");
        System.out.println("My weight is " + this.getWeight() + " gms.");
    }
}
