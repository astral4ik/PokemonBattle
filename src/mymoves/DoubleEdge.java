package mymoves;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class DoubleEdge extends PhysicalMove{
    private int selfDamage;

    public DoubleEdge(double power, double accuracy){
        super(Type.NORMAL, power, accuracy);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def, damage);
        this.selfDamage = (int) Math.floor(damage/3);
    }

    @Override 
    protected void applySelfDamage(Pokemon att, double damage){
        if (selfDamage > 0){
            att.setMod(Stat.HP, -selfDamage);
        }
        selfDamage = 0;
    }

    @Override
    protected String describe() {
        return "жестко юзает Double-Edge";
    }
}
