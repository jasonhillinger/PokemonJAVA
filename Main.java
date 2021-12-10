public class Main {
    public static void main(String[] args) {
        Moves ember = new Moves("Ember",4, 10, TYPE.FIRE, CONDITION.BURNING, 0);
        Pokemon charmander = new Pokemon(120, "Charmander", 5, TYPE.FIRE);
        Pokemon squirtle = new Pokemon(50, "Waffles", 5, TYPE.LEAF);
        Trainer trainer1 = new Trainer("Jason");

        trainer1.addPokemon(charmander);
        //trainer1.getPokemon(0).attack(enemy, move);
        charmander.setAbility(ember, 0);
        charmander.printAbilities();
        charmander.attack(squirtle, 0);
        System.out.println(squirtle.getHealth());
        

    }
}
