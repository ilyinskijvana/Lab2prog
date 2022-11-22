package Attacks;

import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {
    Effect RockTombEffect = new Effect().stat(Stat.SPEED, -1);

    @Override
    protected String describe() {
        return "Быканул и заставил противника впасть в ступор";
    }

    public RockTomb() {
        super(Type.ROCK, 60, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon defendPokemon) {
        defendPokemon.addEffect(RockTombEffect);
    }

    protected void applyOppDamage(Pokemon p, double damage) {
    }
}
