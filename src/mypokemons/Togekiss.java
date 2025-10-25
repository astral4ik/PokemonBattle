package mypokemons;
import mymoves.Facade;
import ru.ifmo.se.pokemon.Pokemon;

public class Togekiss extends Togetic{
    public Togekiss(String name, int level){
        super(name, level);

        super.setStats(85, 50, 95, 120, 115, 80);

        Facade facade2 = new Facade(70, 100);
        
        super.addMove(facade2);
    }
}