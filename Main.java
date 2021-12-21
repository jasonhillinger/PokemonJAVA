import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name for trainer 1: ");
        String name = scan.nextLine();
        Trainer trainer1 = new Trainer(name);

        System.out.println("Enter name for trainer 2: ");
        name = scan.nextLine();
        Trainer trainer2 = new Trainer(name);

        int choose;
        System.out.println(trainer1.getName() + " choose your six pokemon and their abilities!");
        System.out.println("1)  Charmander\n2)  Charmeleon\n3)  Charizard\n4)  Squirtle\n5)  Wartortle\n6)  Blastoise");

        for (int i = 0; i < trainer1.getPokeList().length; i++) {
            choose = scan.nextInt();
            System.out.println("Enter a number to choose add a pokemon to your list "+ i+1+" ");
            switch (choose) {
                case 1:
                    trainer1.addPokemon(AllPokemon.charmander);
                    for (int j = 0; j < 4; j++) {
                        System.out.println("Choose 4 abilities for " + AllPokemon.charmander.getName());
                    }
                    break;

                case 2:
                    trainer1.addPokemon(AllPokemon.charmeleon);
                    break;

                case 3:
                    trainer1.addPokemon(AllPokemon.charizard);
                    break;

                case 4:
                    trainer1.addPokemon(AllPokemon.squirtle);
                    break;

                case 5:
                    trainer1.addPokemon(AllPokemon.wartortle);
                    break;

                case 6:
                    trainer1.addPokemon(AllPokemon.blastoise);
                    break;
                default:
                    break;
            }
            
            
        }

        trainer1.addPokemon(AllPokemon.charmander);
        // trainer2.addPokemon(AllPokemon.squirtle);
        // trainer1.getPokemon(0).attack(enemy, move);

        trainer1.getPokemon(0).setAbility(AllMoves.ember, 0);
        trainer1.getPokemon(0).printAbilities();
        // trainer1.getPokemon(0).attack(trainer2.getPokemon(0), 0);
        System.out.println("STATIC : " + AllPokemon.squirtle.getHealth());
        // System.out.println("TRAINER2 :" + trainer2.getPokemon(0).getHealth());

    }

    public static void choose4Moves(Pokemon poke, Scanner scn){
        int choose;
        System.out.println("Choose 4 abilities");
        choose = scn.nextInt();
        if(poke.getType() == TYPE.FIRE){
            //switch case for fire abilities
        }
        else if(poke.getType() == TYPE.WATER){
            //switch case for water type pokemon
        }
        else{
            //switch case for leaf type abilties
        }
    }

}
