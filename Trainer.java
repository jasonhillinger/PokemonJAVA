import java.lang.reflect.Constructor;

public class Trainer {
    private String name;
    private Pokemon[] trainerPokemon;

    public Trainer(String _name){
        name = _name;
        trainerPokemon = new Pokemon[6];
    }
}
