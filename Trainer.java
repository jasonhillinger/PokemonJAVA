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

    public void addPokemon(Pokemon pokeAdd) {
        if (amountOfPokemon > trainerPokemon.length) {
            System.out.println("Trainer cannot hold anymore Pokemon!");
        } else {
            try {
                trainerPokemon[amountOfPokemon] = (Pokemon) pokeAdd.clone();
                amountOfPokemon++;
            } catch (CloneNotSupportedException e) {
                System.out.println("CLONING ERROR");
            }

        }
    }

    public String getName() {
        return name;
    }

    public Pokemon getPokemon(int index) {
        return trainerPokemon[index];
    }

    public Pokemon[] getPokeList() {
        return trainerPokemon;
    }

    public void printPokemon() {
        System.out.println(name + "'s Current Pokemon");
        try {
            for (int i = 0; i < trainerPokemon.length; i++) {
                System.out.println(trainerPokemon[i].getName());
            }
        } catch (Exception e) {
            // Do nothing
        }

    }
}
