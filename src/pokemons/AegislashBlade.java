package pokemons;

import ru.ifmo.se.pokemon.Type;
import pokemons.Doublade;
import attacks.statusattacks.Confide;

public class AegislashBlade extends Doublade {
	public AegislashBlade(String name, int level) {
		super(name, level);
		this.setStats(60, 140, 50, 140, 50, 60);
		this.addMove(new Confide());
	}
}