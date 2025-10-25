
import ru.ifmo.se.pokemon.*;
import mypokemons.*;

//https://pokemondb.net/pokedex/absol
//https://pokemondb.net/pokedex/munchlax
//https://pokemondb.net/pokedex/snorlax
//https://pokemondb.net/pokedex/togepi
//https://pokemondb.net/pokedex/togekiss

public class Program {
    public static void main(String[] args){
        Battle b = new Battle();
        Munchlax munchlax = new Munchlax("Телепузик", 1);
        Absol absol = new Absol("Кчау", 1);
        Snorlax snorlax = new Snorlax("Пупуня", 1);
        Togepi togepi = new Togepi("Малыш", 1);
        Togetic togetic = new Togetic("Птичка", 1);
        Togekiss togekiss = new Togekiss("Большая птичка", 1);
        b.addAlly(munchlax);
        b.addAlly(togepi);
        b.addAlly(togetic);
        b.addFoe(absol);
        b.addFoe(togekiss);
        b.addFoe(snorlax);
        b.go();
    }


}
