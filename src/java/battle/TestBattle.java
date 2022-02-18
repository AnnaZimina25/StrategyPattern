package battle;

import entities.FairytaleCharacter;
import entities.characterImplementations.*;

public class TestBattle {

    public static void main(String[] args) {
        FairytaleCharacter archer = new Archer();
        archer.display();
        archer.move();
        archer.attack();

        FairytaleCharacter troll = new Troll();
        troll.display();
        troll.move();
        troll.attack();

        FairytaleCharacter peasant = new Peasant();
        peasant.display();
        peasant.move();
        peasant.attack();

        FairytaleCharacter knight = new Knight();
        knight.display();
        knight.move();
        knight.attack();
    }
}