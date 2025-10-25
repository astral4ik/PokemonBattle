package mymoves;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DarkPulse extends SpecialMove{
    public DarkPulse(double power, double accuracy){
        super(Type.DARK, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        
        if (Math.random() <= 0.2){
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe() {
        return "жестко юзает Dark Pulse";
    }
}
