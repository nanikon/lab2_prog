package pokemons;

import ru.ifmo.se.pokemon.Type;
import pokemons.Honedge;
import attacks.statusattacks.MetalSound;

public class Doublade extends Honedge{
	public Doublade(String name, int level) {
		super(name, level);
		this.setStats(59, 110, 150, 45, 49, 35);
		this.addMove(new MetalSound());
	}
}