package mymoves;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class ExampleMove extends PhysicalMove{
    public ExampleMove(double power, double accuracy){
        super(Type.NORMAL, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);


    }

    @Override
    protected String describe() {
        return "жестко юзает ";
    }
}
