package Attacks;

import ru.ifmo.se.pokemon.*;

public class SleepPowder extends StatusMove {
    @Override
    protected String describe(){
        return "решил дремануть";
    }
    public SleepPowder(){
        super();
    }
    @Override
    protected void applyOppEffects(Pokemon defendPokemon) {
        Effect.sleep(defendPokemon);
    }
}
