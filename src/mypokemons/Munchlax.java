package mypokemons;
import mymoves.DoubleEdge;
import mymoves.IceBeam;
import mymoves.Psychic;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Munchlax extends Pokemon{
    public Munchlax(String name, int level){
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(135, 85, 40, 40, 85, 5);

        Psychic psychic = new Psychic(90, 100);
        DoubleEdge doubleEdge = new DoubleEdge(120, 100);
        IceBeam iceBeam = new IceBeam(90, 100);
        
        super.setMove(psychic, doubleEdge, iceBeam);
    }
}