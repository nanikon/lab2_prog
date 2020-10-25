package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Move;
import attacks.physicalattacks.AerialAce;
import attacks.statusattacks.HoneClaws;
import attacks.physicalattacks.Scratch;

public class Glameow extends Pokemon {
	public Glameow(String name, int level) {
		super(name, level);
		this.setType(Type.NORMAL);
		this.setStats(49, 55, 42, 42, 37, 85);
		Move[] attacks = new Move[3];
		attacks[0] = new HoneClaws();
		attacks[1] = new AerialAce();
		attacks[2] = new Scratch();
		this.setMove(attacks);
	}
}