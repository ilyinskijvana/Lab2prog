package Attacks;

import ru.ifmo.se.pokemon.*;

public class PoisonPowder extends StatusMove {

    public PoisonPowder() {
        super(Type.POISON, 0, 75);
    }

    @Override
    protected String describe() {
        return "достал перцовку";
    }

    @Override
    protected void applyOppEffects(Pokemon defendingPokemon) {
        double maxHP = defendingPokemon.getStat(Stat.HP);
        Effect PoisonPowderEffect = new Effect().stat(Stat.HP, (int)(maxHP / 8)).turns(8);
        defendingPokemon.addEffect(PoisonPowderEffect);
    }
}
