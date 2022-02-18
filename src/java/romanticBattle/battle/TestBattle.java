package romanticBattle.battle;

import fantasyBattle.entities.characterImplementations.Knight;
import romanticBattle.entities.RomanticCharacter;
import romanticBattle.entities.characterImplementations.KnightAdapter;
import romanticBattle.entities.characterImplementations.Musketeer;

import java.util.ArrayList;
import java.util.List;

public class TestBattle {

    public static void main(String[] args) {
        List<RomanticCharacter> characters = new ArrayList<>();
        characters.add(new Musketeer());
        characters.add(new KnightAdapter(new Knight()));

        characters.forEach(character -> character.fightForLove());
    }
}