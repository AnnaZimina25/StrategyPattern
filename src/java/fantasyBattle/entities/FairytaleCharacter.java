package fantasyBattle.entities;

import fantasyBattle.behavior.attack.Damage;
import fantasyBattle.behavior.movement.MovementBehavior;

public abstract class FairytaleCharacter {

    Damage damageType;
    MovementBehavior movementBehavior;

    public void attack() {
        damageType.attack();
    }

    public void move() {
        movementBehavior.move();
    }

    public abstract void display();

    public void setDamageType(Damage damageType) {
        this.damageType = damageType;
    }

    public void setMovementBehavior(MovementBehavior movementBehavior) {
        this.movementBehavior = movementBehavior;
    }
}
