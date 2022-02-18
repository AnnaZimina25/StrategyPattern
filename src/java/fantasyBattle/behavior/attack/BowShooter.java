package fantasyBattle.behavior.attack;

public class BowShooter extends Damage{
    public BowShooter(int amountOfDamage, int range, int hitProbability) {
        super(amountOfDamage, range, hitProbability);
    }

    @Override
    public void attack() {
        System.out.println("Я стреляю из лука!");
    }
}
