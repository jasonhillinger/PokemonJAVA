public class Pokemon{
    //Parent Class for all Pokemon
    
    //Data members
    private int health;
    private String name;
    private enum STATUS{ALIVE,FEINT,POISONED,BURNING};
    private enum TYPE{FIRE,WATER,LEAF};
    private int level;
    private Moves[] abilities;
    
    // constructor
    Pokemon(int _health, String _name, int _level){
        health = _health;
        name = _name;
        level = _level;
        abilities = new Moves[4];
    }

    

}