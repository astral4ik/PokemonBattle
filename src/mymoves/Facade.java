package mymoves;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove{
    public Facade(double power, double accuracy){
        super(Type.NORMAL, power, accuracy);
    }

    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon deff) {
        double baseDamage = super.calcBaseDamage(att, deff);
        
        if (att.getCondition() == Status.POISON || att.getCondition() == Status.PARALYZE || att.getCondition() == Status.BURN) {
            return baseDamage * 2; 
        }
        return baseDamage;
    }

    @Override
    protected String describe() {
        return "жестко юзает Facade";
    }
}
