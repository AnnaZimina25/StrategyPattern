package entities.characterImplementations;

import behavior.attack.PitchforkWarrior;
import behavior.movement.Walker;
import entities.FairytaleCharacter;

public class Peasant extends FairytaleCharacter {

    public Peasant() {
        super.setDamageType(new PitchforkWarrior(10, 45, 90));
        super.setMovementBehavior(new Walker());
    }

    @Override
    public void display() {
        System.out.println("Я крестьянин!");
    }
}
