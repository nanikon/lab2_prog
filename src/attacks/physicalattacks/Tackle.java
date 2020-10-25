package attacks.physicalattacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Tackle extends PhysicalMove {
	public Tackle() {
		super(Type.NORMAL, 40, 100);
	}

	protected String describe() {
		return "использует Tackle";
	}
}