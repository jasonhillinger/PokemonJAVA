public class Main {
    public static void main(String[] args) {
        Moves ember = new Moves("Ember",4, 10, TYPE.FIRE, CONDITION.BURNING, 0);
        Pokemon charmander = new Pokemon(120, "Charmander", 5);
        Pokemon squirtle = new Pokemon(110, "Waffle", 6);
        Trainer trainer1 = new Trainer("Jason");

        trainer1.addPokemon(charmander);
        //trainer1.getPokemon(0).attack(enemy, move);
        charmander.setAbility(ember, 0);
        charmander.printAbilities();

    }
}
