package fantasyBattle.entities.characterImplementations;

import fantasyBattle.behavior.attack.PitchforkWarrior;
import fantasyBattle.behavior.movement.Walker;
import fantasyBattle.entities.FairytaleCharacter;

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
