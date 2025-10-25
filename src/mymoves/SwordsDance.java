package mymoves;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class SwordsDance extends StatusMove{
    public SwordsDance(){
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        
        Effect effect = new Effect().stat(Stat.ATTACK, 2);
        p.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "жестко танцует Swords Dance";
    }
}
