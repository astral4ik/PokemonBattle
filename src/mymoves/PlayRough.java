package mymoves;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class PlayRough extends PhysicalMove{
    public PlayRough(double power, double accuracy){
        super(Type.FAIRY, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        
        Effect effect = new Effect().stat(Stat.ATTACK, -1).chance(0.1);
        p.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "жестко юзает Play Rough";
    }
}
