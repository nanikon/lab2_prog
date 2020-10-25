package attacks.statusattacks;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class MetalSound extends StatusMove {
	public MetalSound() {
		super(Type.STEEL, 0, 85);
	}

	protected String describe() {
		return "использует Metal Sound";
	}

	protected void applyOppEffects(Pokemon p) {
		p.setMod(Stat.SPECIAL_DEFENSE, -2);
	}
}