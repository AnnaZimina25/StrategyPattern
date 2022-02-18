package fantasyBattle.behavior.attack;

public abstract class Damage {

    // Число урона
    private int amountOfDamage;

    // Дальность
    private int range;

    // Вероятность попадания
    private int hitProbability;

    public abstract void attack();

    public Damage(int amountOfDamage, int range, int hitProbability) {
        this.amountOfDamage = amountOfDamage;
        this.range = range;
        this.hitProbability = hitProbability;
    }

    public int getAmountOfDamage() {
        return amountOfDamage;
    }

    public void setAmountOfDamage(int amountOfDamage) {
        this.amountOfDamage = amountOfDamage;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getHitProbability() {
        return hitProbability;
    }

    public void setHitProbability(int hitProbability) {
        this.hitProbability = hitProbability;
    }
}
