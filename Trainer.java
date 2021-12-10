import java.lang.reflect.Constructor;

public class Trainer {
    private String name;
    private Pokemon[] trainerPokemon;
    private int amountOfPokemon;

    public Trainer(String _name) {
        name = _name;
        trainerPokemon = new Pokemon[6];
        amountOfPokemon = 0;
    }

    public void addPokemon(Pokemon pokeAdd){
        if(amountOfPokemon > trainerPokemon.length){
            System.out.println("Trainer cannot hold anymore Pokemon!");
        }
        else{
        trainerPokemon[amountOfPokemon] = pokeAdd;
        amountOfPokemon++;
        }
    }

    public Pokemon getPokemon(int index){
        return trainerPokemon[index];
    }
}
