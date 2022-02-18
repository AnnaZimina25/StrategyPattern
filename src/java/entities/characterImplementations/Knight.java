package entities.characterImplementations;

import behavior.attack.SwordWarrior;
import behavior.movement.Rider;
import entities.FairytaleCharacter;

public class Knight extends FairytaleCharacter {

    public Knight() {
        super.setDamageType(new SwordWarrior(80, 150, 65));
        super.setMovementBehavior(new Rider());
    }

    @Override
    public void display() {
        System.out.println("Я рыцарь!");
    }
}
