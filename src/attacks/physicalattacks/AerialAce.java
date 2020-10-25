package attacks.physicalattacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public class AerialAce extends PhysicalMove {
	public AerialAce() {
		super(Type.FLYING, 60, 100);
	}

	protected String describe() {
		return "использует Aerial Ace";
	}

	protected boolean checkAccuracy(Pokemon att, Pokemon def) {
		return true;
	}
}