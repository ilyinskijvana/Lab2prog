package Attacks;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    Effect RestEffect1 = new Effect().stat(Stat.HP, 1);
    Effect RestEffect2 = new Effect().turns(2);

    @Override
    protected String describe() {
        return "отрубился на 2 хода но зарядился энергией";
    }

    public Rest() {
        super(Type.PSYCHIC, 0, 1);
    }

    @Override
    protected void applySelfEffects(Pokemon defendPokemon) {
        defendPokemon.addEffect(RestEffect1);
        defendPokemon.addEffect(RestEffect2);
    }
}
