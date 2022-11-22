package Pokemons;

import Attacks.Rest;
import Attacks.SleepPowder;
import Attacks.PoisonPowder;
import Attacks.DoubleTeam;
import ru.ifmo.se.pokemon.Type;

public class Victreebel extends Weepinbell {
    public Victreebel(final String name, final int level) {
        super(name, level);
        setStats(80, 105, 65, 100, 70, 70);
        addType(Type.GRASS);
        addType(Type.POISON);
        addMove(new DoubleTeam());
        addMove(new PoisonPowder());
        addMove(new Rest());
        addMove(new SleepPowder());
    }
}
