package mypokemons;
import mymoves.PlayRough;
import mymoves.SwordsDance;
import mymoves.DarkPulse;
import mymoves.Facade;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Absol extends Pokemon{
    public Absol(String name, int level){
        super(name, level);

        super.setType(Type.DARK);
        super.setStats(65, 130, 60, 75, 60, 75);

        PlayRough playRough = new PlayRough(75,100);
        SwordsDance swordsDance = new SwordsDance();
        DarkPulse darkPulse = new DarkPulse(80, 100);
        Facade facade = new Facade(70, 100);

        super.setMove(playRough, swordsDance, darkPulse, facade);
    }
}
