package attacks.physicalattacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public class VitalThrow extends PhysicalMove{
	public VitalThrow() {
		super(Type.FIGHTING, 70, 100, -1, 1);
	}

	protected String describe() {
		return "использует Vital Throw";
	}

	protected boolean checkAccuracy(Pokemon att, Pokemon def) {
		return true;
	}
}