package Pokemons;

import Attacks.Rest;
import Attacks.SleepPowder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bellsprout extends Pokemon {
    public Bellsprout(final String name, final int level) {
        super(name, level);
        setStats(50, 75, 35, 70, 30, 40);
        addType(Type.GRASS);
        addType(Type.POISON);
        addMove(new Rest());
        addMove(new SleepPowder());
    }
}
