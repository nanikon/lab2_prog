package attacks.physicalattacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Scratch extends PhysicalMove{
	public Scratch() {
		super(Type.NORMAL, 40, 100);
	}

	protected String describe() {
		return "���������� Scratch";
	}
}