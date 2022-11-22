package Attacks;

import ru.ifmo.se.pokemon.*;

public class RockThrow extends PhysicalMove {
    public RockThrow() {
        super(Type.ROCK, 50, 90);
    }

    @Override
    protected String describe() {
        return "достал камень из кармана и кинул его";
    }

    @Override
    protected void applyOppDamage(Pokemon defendPokemon, double damage) {
    }
}
