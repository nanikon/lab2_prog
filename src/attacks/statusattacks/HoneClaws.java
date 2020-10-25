package attacks.statusattacks;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class HoneClaws extends StatusMove {
	public HoneClaws() {
		super(Type.DARK, 0, 100);
	}

	protected String describe() {
		return "использует Hone Claws";
	}

	protected void applySelfEffects(Pokemon p) {
		p.setMod(Stat.ATTACK, +1);
		p.setMod(Stat.ACCURACY, +1);
	}
}