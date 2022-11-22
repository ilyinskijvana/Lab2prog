import Pokemons.*;
import ru.ifmo.se.pokemon.*;
public class Main {
public static void main(String[] args) {
    Pokemon p1 = new Slugma("Семен", 1);
    Pokemon p2 = new Magcargo("Иваныч", 1);
    Pokemon p3 = new Oranguru("Жека", 1);
    Pokemon p4 = new Bellsprout("Егор", 1);
    Pokemon p5 = new Weepinbell("Антон", 1);
    Pokemon p6 = new Victreebel("Костя", 1);

    Pokemon[] teamA = {p1, p2, p3};

    Pokemon[] teamB = {p4, p5, p6};

    new BattleInt(teamA, teamB);

}
}
