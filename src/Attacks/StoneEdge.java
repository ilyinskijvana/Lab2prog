package Attacks;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {
    @Override
    protected String describe(){
        return "использует бейсбольную биту";
    }
    public StoneEdge(){
        super(Type.ROCK, 100, 80);
    }
    @Override
        protected double calcCriticalHit(Pokemon p1, Pokemon var2) {
            if (p1.getStat(Stat.SPEED) / 8.0 > Math.random()) {
                return 2.0;
            } else {
                return 1.0;
            }
        }
    @Override
    protected void applyOppDamage(Pokemon defendpokemon, double damage){
    }
}
