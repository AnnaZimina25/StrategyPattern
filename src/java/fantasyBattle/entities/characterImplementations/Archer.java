package fantasyBattle.entities.characterImplementations;

import fantasyBattle.behavior.attack.BowShooter;
import fantasyBattle.behavior.movement.Walker;
import fantasyBattle.entities.FairytaleCharacter;

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
