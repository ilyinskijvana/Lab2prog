package Attacks;

import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {
    public RockSlide() {
        super(Type.ROCK, 75, 90);
    }

    @Override
    protected String describe() {
        return "направляет пивную отрыжку на соперника";
    }

    @Override
    protected void applyOppEffects(Pokemon defendPokemon) {
        if (this.shouldApplyEffect(0.3)) {
            Effect.flinch(defendPokemon);
        }
    }

    private boolean shouldApplyEffect(double chance) {
        return Math.random() <= chance;
    }

    ;
}


