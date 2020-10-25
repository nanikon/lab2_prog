package attacks.specialattacks;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;

public class FocusBlast extends SpecialMove {
	public FocusBlast() {
		super(Type.FIGHTING, 120, 70);
	}

	protected String describe() {
		return "использует Focus Blast";
	}

	protected void applyOppEffects(Pokemon p) {
		p.addEffect(new Effect().chance(0.1).turns(-1).stat(Stat.SPECIAL_DEFENSE, -1));
	}
}