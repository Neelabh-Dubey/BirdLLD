package org.bird;

import java.util.ArrayList;
import java.util.List;

/**
 * Requirement is to design a bird-
 *  - It has behaviour like fly, eat, sing, etc.
 *  - It has attributes like weight, colour, feather count, etc.
 *  - Some attributes and methods are common to all the birds like eat(), weight
 *  - Some attributes are specific to few birds like fly() for penguin and ostrich, and fly for sparrow and crow
 *  - Keep in mind 6 birds are -  sparrow, ostrich, penguin, crow, pigeon, toy (that eats battery)
 */

public class Main {
    public static void main(String[] args) {
        List<BaseBird> birdList = new ArrayList<>();
        List<Flyable> flyableBirdList = new ArrayList<>();

        Sparrow sparrow = new Sparrow(2,25,Color.YELLOW);
        birdList.add(sparrow);
        flyableBirdList.add(sparrow);

        Ostrich ostrich = new Ostrich(2, 25000, Color.RED);
        birdList.add(ostrich);
        flyableBirdList.add(ostrich);

        Penguin penguin = new Penguin(4, 2500, Color.BLUE);
        birdList.add(penguin);
        flyableBirdList.add(penguin);

        for(int i = 0; i < 3; i++){
            System.out.println("Bird " + (i+1) + "- ");
            birdList.get(i).introduce();
            flyableBirdList.get(i).fly();
        }
    }
}