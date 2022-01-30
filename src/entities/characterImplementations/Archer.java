package entities.characterImplementations;

import behavior.attack.BowShooter;
import behavior.movement.Walker;
import entities.FairytaleCharacter;

public class Archer extends FairytaleCharacter {

    public Archer() {
        super.setDamageType(new BowShooter(40, 300, 20));
        super.setMovementBehavior(new Walker());
    }

    @Override
    public void display() {
        System.out.println("Я лучник!");
    }
}
