package mymoves;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class IceBeam extends SpecialMove{
    public IceBeam(double power, double accuracy){
        super(Type.ICE, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        
        if (Math.random() <= 0.1){
            Effect.freeze(p);
        }
    }

    @Override
    protected String describe() {
        return "жестко юзает Ice Beam";
    }
}
