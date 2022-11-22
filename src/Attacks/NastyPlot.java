package Attacks;

import ru.ifmo.se.pokemon.*;

public class NastyPlot extends StatusMove {
    Effect NastyPlotEffect = new Effect().stat(Stat.SPECIAL_ATTACK, 2);

    public NastyPlot() {
        super();
    }

    @Override
    protected String describe() {
        return "получил двойную силу после Балтики 7";
    }

    @Override
    protected void applySelfEffects(Pokemon defendPokemon) {
        defendPokemon.addEffect(NastyPlotEffect);
    }
}
