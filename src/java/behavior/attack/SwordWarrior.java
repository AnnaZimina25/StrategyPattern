package behavior.attack;

public class SwordWarrior extends Damage {
    public SwordWarrior(int amountOfDamage, int range, int hitProbability) {
        super(amountOfDamage, range, hitProbability);
    }

    @Override
    public void attack() {
        System.out.println("Я атакую мечом!");
    }
}
