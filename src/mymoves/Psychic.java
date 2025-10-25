package mymoves;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Psychic extends SpecialMove{
    public Psychic(double power, double accuracy){
        super(Type.PSYCHIC, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        
        Effect effect = new Effect().stat(Stat.SPECIAL_DEFENSE, -1).chance(0.1);
        p.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "жестко юзает Psychic";
    }
}
