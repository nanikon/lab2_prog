import ru.ifmo.se.pokemon.Battle;
import pokemons.*;


public class SimpleBattle {
	public static void main (String[] args) {
		Battle b = new Battle();
        b.addAlly(new Honedge("Хонедж", 1));
        b.addFoe(new Doublade("Дублейд", 2));
        b.addAlly(new AegislashBlade("Эгислаш-Клинок", 3));
        b.addFoe(new Glameow("Гламур", 2));
        b.addAlly(new Purugly("Пуругли", 3));
        b.addFoe(new Passimian("Пассимиан", 3));
        b.go();
	}
}