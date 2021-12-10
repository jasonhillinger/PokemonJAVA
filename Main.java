public class Main {
    public static void main(String[] args) {
        Moves ember = new Moves("Ember", 4, 10, TYPE.FIRE, CONDITION.BURNING, 0);
        
        Trainer trainer1 = new Trainer("Jason");
        Trainer trainer2 = new Trainer("Hillinger");

        trainer1.addPokemon(AllPokemon.charmander);
        trainer2.addPokemon(AllPokemon.squirtle);
        // trainer1.getPokemon(0).attack(enemy, move);
        trainer1.getPokemon(0).setAbility(ember, 0);
        trainer1.getPokemon(0).printAbilities();
        trainer1.getPokemon(0).attack(trainer2.getPokemon(0), 0);
        System.out.println("STATIC : "+ AllPokemon.squirtle.getHealth());
        System.out.println("TRAINER2 :" + trainer2.getPokemon(0).getHealth());

    }
}
