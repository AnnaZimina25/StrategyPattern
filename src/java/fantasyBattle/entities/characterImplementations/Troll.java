package fantasyBattle.entities.characterImplementations;

import fantasyBattle.behavior.attack.ClubWarrior;
import fantasyBattle.behavior.movement.Walker;
import fantasyBattle.entities.FairytaleCharacter;

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
