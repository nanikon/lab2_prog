package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.physicalattacks.ShadowClaw;
import attacks.physicalattacks.BrutalSwing;

public class Honedge extends Pokemon {
	public Honedge(String name, int level) {
		super(name, level);
		this.setType(Type.STEEL, Type.GHOST);
		this.setStats(45, 80, 100, 35, 37, 28);
		this.addMove(new ShadowClaw());
		this.addMove(new BrutalSwing());
	}
}