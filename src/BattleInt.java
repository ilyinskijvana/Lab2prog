import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class BattleInt {

    public BattleInt(Pokemon[] teamA, Pokemon[] teamB) {
        Battle b = new Battle();
        if (teamB.length == 0 && teamA.length == 0) {
            System.out.println("Никто не пришел на фан-встречу:(");
            System.exit(0);
        }
        if (teamA.length == 0) {
            System.out.println("Чуваки из команды 'Гроза Района' не пришли на стрелку района");
            System.exit(0);
        }

        if (teamB.length == 0) {
            System.out.println("Чуваки из команды 'Ультразабиваны' не пришли на стрелку района но к ним претензий нету");
            System.exit(0);
        }

        for (Pokemon blatnie : teamA)
            b.addAlly(blatnie);
        for (Pokemon mujiki : teamB)
            b.addFoe(mujiki);
        b.go();
    }
}
