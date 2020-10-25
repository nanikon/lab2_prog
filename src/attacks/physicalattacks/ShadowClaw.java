package attacks.physicalattacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public class ShadowClaw extends PhysicalMove {
	public ShadowClaw() {
		super(Type.GHOST, 70, 100);
	}

	protected String describe() {
		return "использует Shadow Claw";
	}

	protected double calcCriticalHit(Pokemon att, Pokemon def) {
		return Math.random() < 0.125 ? 2 : 1;
	}
}