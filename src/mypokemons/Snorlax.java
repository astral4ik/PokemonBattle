package mypokemons;
import mymoves.FocusBlast;
import ru.ifmo.se.pokemon.Pokemon;


public class Snorlax extends Munchlax{
    public Snorlax(String name, int level){
        super(name, level);

        super.setStats(160, 110, 65, 65, 110, 30);

        FocusBlast focusBlast = new FocusBlast(120, 70);
        
        super.addMove(focusBlast);
    }
}