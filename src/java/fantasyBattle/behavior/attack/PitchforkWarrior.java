package fantasyBattle.behavior.attack;

public class PitchforkWarrior extends Damage{
    public PitchforkWarrior(int amountOfDamage, int range, int hitProbability) {
        super(amountOfDamage, range, hitProbability);
    }

    @Override
    public void attack() {
        System.out.println("Я атакую вилами!");
    }
}
