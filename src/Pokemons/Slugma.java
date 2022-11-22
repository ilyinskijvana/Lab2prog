package Pokemons;

import Attacks.RockThrow;
import Attacks.RockTomb;
import Attacks.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slugma extends Pokemon {
    public Slugma(final String name, final int level) {
        super(name, level);
        setStats(40, 40, 40, 70, 40, 20);
        addType(Type.FIRE);
        addMove(new RockThrow());
        addMove(new RockTomb());
        addMove(new DoubleTeam());


    }
}
