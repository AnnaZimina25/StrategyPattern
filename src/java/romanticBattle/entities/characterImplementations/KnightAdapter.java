package romanticBattle.entities.characterImplementations;

import fantasyBattle.entities.characterImplementations.Knight;
import romanticBattle.entities.RomanticCharacter;

public class KnightAdapter extends RomanticCharacter {
    private Knight knight;

    public KnightAdapter(Knight knight) {
        this.knight = knight;
    }

    @Override
    public void fightForLove() {
        knight.attack();
    }
}
