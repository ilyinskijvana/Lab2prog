package Pokemons;

import Attacks.NastyPlot;
import Attacks.Confide;
import Attacks.RockSlide;
import Attacks.ZenHeadbutt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Oranguru extends Pokemon {
    public Oranguru(final String name, final int level) {
        super(name, level);
        setStats(90, 60, 80, 90, 110, 60);
        addType(Type.NORMAL);
        addType(Type.PSYCHIC);

        addMove(new NastyPlot());
        addMove(new Confide());
        addMove(new RockSlide());
        addMove(new ZenHeadbutt());
    }
}
