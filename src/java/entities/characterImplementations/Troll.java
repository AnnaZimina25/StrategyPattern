package entities.characterImplementations;

import behavior.attack.ClubWarrior;
import behavior.movement.Walker;
import entities.FairytaleCharacter;

public class Troll extends FairytaleCharacter {

    public Troll() {
        super.setDamageType(new ClubWarrior(70, 60, 85));
        super.setMovementBehavior(new Walker());
    }

    @Override
    public void display() {
        System.out.println("Я тролль!");
    }
}
