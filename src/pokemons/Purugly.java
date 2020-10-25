package pokemons;

import pokemons.Glameow;
import ru.ifmo.se.pokemon.Type;
import attacks.physicalattacks.BodySlam;

public class Purugly extends Glameow{
	public Purugly(String name, int level) {
		super(name, level);
		this.setStats(71, 82, 64, 64, 59, 112);
		this.addMove(new BodySlam());
	}
}