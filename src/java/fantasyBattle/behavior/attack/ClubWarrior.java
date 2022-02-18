package fantasyBattle.behavior.attack;

public class ClubWarrior extends Damage{
    public ClubWarrior(int amountOfDamage, int range, int hitProbability) {
        super(amountOfDamage, range, hitProbability);
    }

    @Override
    public void attack() {
        System.out.println("Я атакую дубиной!");
    }
}
