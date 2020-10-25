package attacks.physicalattacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class BrutalSwing extends PhysicalMove {
	public BrutalSwing() {
		super(Type.DARK, 60, 100);
	}

	protected String describe() {
		return "использует Brutal Swing";
	}
} 