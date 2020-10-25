package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Move;
import attacks.specialattacks.FocusBlast;
import attacks.physicalattacks.Tackle;
import attacks.physicalattacks.VitalThrow;
import attacks.statusattacks.Swagger;

public class Passimian extends Pokemon {
	public Passimian(String name, int level) {
		super(name, level);
		this.setStats(100, 120, 90, 40, 60, 80);
		this.setType(Type.FIGHTING);
		Move[] attacks = new Move[4];
		attacks[0] = new FocusBlast();
		attacks[1] = new Tackle();
		attacks[2] = new VitalThrow();
		attacks[3] = new Swagger();
		this.setMove(attacks);
	}
}