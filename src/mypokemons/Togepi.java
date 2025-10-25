package mypokemons;
import mymoves.Psychic;
import mymoves.Facade;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Togepi extends Pokemon{
    public Togepi(String name, int level){
        super(name, level);

        super.setType(Type.FAIRY);
        super.setStats(35, 20, 65, 40, 65, 20);

        Psychic psychic = new Psychic(90, 100);
        Facade facade = new Facade(70, 100);
        
        super.setMove(psychic, facade);
    }
}