import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Moves ember = new Moves("Ember", 4, 10, TYPE.FIRE, CONDITION.BURNING, 0);
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter name for trainer 1: ");
        String name = scan.nextLine();
        Trainer trainer1 = new Trainer(name);

        System.out.println("Enter name for trainer 2: ");
        name = scan.nextLine();
        Trainer trainer2 = new Trainer(name);

        System.out.println(trainer1.getName() + " choose your six pokemon and their abilities!");
        for (int i = 0; i < trainer1.getPokeList().length; i++) {
            System.out.println("Enter a number to choose add a pokemon to your list");
            for (int j = 0; j < 4; j++) {
                System.out.println("Choose 4 abilities for POKEMON NAME");
            }
        }


        trainer1.addPokemon(AllPokemon.charmander);
        //trainer2.addPokemon(AllPokemon.squirtle);
        // trainer1.getPokemon(0).attack(enemy, move);

        trainer1.getPokemon(0).setAbility(ember, 0);
        trainer1.getPokemon(0).printAbilities();
        //trainer1.getPokemon(0).attack(trainer2.getPokemon(0), 0);
        System.out.println("STATIC : "+ AllPokemon.squirtle.getHealth());
        //System.out.println("TRAINER2 :" + trainer2.getPokemon(0).getHealth());

    }

}
