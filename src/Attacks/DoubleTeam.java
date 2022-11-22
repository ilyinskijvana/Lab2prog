package Attacks;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {

    protected String describe(){
        return "надел спортивки адидас и стал круче";
    }
    public DoubleTeam() {
        super();
    }

    @Override
    protected void applySelfEffects(Pokemon defendPokemon) {
        defendPokemon.addEffect(new Effect().stat(Stat.EVASION, 1));
    }
}
