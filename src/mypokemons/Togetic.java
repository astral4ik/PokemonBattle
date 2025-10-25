package mypokemons;
import mymoves.SweetKiss;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public class Togetic extends Togepi{
    public Togetic(String name, int level){
        super(name, level);
        
        super.setType(Type.FAIRY, Type.FLYING);
        super.setStats(55, 40, 85, 80, 105, 40);

        SweetKiss sweetKiss = new SweetKiss();
        
        super.addMove(sweetKiss);
    }
}