package Pokemons;

import Attacks.RockThrow;
import Attacks.RockTomb;
import Attacks.DoubleTeam;
import Attacks.StoneEdge;
import ru.ifmo.se.pokemon.Type;

public class Magcargo extends Slugma {
    public Magcargo(final String name, final int level) {
        super(name, level);
        setStats(60, 50, 120, 90, 80, 30);
        addType(Type.ROCK);
        addType(Type.FIRE);
        addMove(new StoneEdge());
        addMove(new RockThrow());
        addMove(new RockTomb());
        addMove(new DoubleTeam());
    }
}
