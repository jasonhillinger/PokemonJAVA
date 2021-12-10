public class Main {
    public static void main(String[] args) {
        Moves ember = new Moves("Ember",4, 10, TYPE.FIRE, CONDITION.BURNING, 0);
        Pokemon charmander = new Pokemon(120, "Jason", 5);

        charmander.setAbility(ember, 0);

    }
}
