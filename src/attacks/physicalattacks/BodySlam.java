package attacks.physicalattacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Status;

public class BodySlam extends PhysicalMove {
	public BodySlam() {
		super(Type.NORMAL, 85, 100);
	}

	protected String describe() {
		return "использует Body Slam";
	}

	protected void applyOppEffects(Pokemon p) {
		if (0.3 > Math.random()) {
			Effect.paralyze(p);
		}
	}
}