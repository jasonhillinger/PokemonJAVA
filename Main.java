public class Main {
    public static void main(String[] args) {
        Moves ember = new Moves("Ember", 4, 10, TYPE.FIRE, CONDITION.BURNING, 0);
        Pokemon charmander = new Pokemon(120, "Charmander", 5, TYPE.FIRE);
        Pokemon squirtle = new Pokemon(50, "Waffles", 5, TYPE.WATER);
        Trainer trainer1 = new Trainer("Jason");

        trainer1.addPokemon(charmander);
        // trainer1.getPokemon(0).attack(enemy, move);
        trainer1.getPokemon(0).setHealth(420);
        System.out.println("CLONED HP: "+ trainer1.getPokemon(0).getHealth());
        System.out.println("ORIGINAL: "+ charmander.getHealth());

    }
}
