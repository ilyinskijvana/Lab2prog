package Attacks;

import ru.ifmo.se.pokemon.*;

public class ZenHeadbutt extends PhysicalMove {

    public ZenHeadbutt() {
        super(Type.PSYCHIC, 80, 90);
    }

    @Override
    protected String describe() {
        return "использовал свой лоб как оружие";
    }

    @Override
    protected void applyOppEffects(Pokemon defendPokemon) {

        if (shouldApplyEffect(0.2)) {
            Effect.flinch(defendPokemon);
        }
    }

    private boolean shouldApplyEffect(double chance) {
        return Math.random() <= chance;
    }
}
