package Pokemons;

import Attacks.Rest;
import Attacks.SleepPowder;
import Attacks.PoisonPowder;
import ru.ifmo.se.pokemon.Type;

public class Weepinbell extends Bellsprout {
    public Weepinbell(final String name, final int level) {
        super(name, level);
        setStats(65, 90, 50, 85, 45, 55);
        addType(Type.GRASS);
        addType(Type.POISON);
        addMove(new PoisonPowder());
        addMove(new Rest());
        addMove(new SleepPowder());
    }
}
