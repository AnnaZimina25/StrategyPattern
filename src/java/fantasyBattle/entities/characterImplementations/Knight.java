package fantasyBattle.entities.characterImplementations;

import fantasyBattle.behavior.attack.SwordWarrior;
import fantasyBattle.behavior.movement.Rider;
import fantasyBattle.entities.FairytaleCharacter;

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
