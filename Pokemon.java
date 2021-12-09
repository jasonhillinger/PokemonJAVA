public class Pokemon{
    //Parent Class for all Pokemon
    
    //Data members
    private int health;
    private String name;
    private enum STATUS{ALIVE,FEINT};
    private enum CONDITION{HEALTHY,POISONED,BURNING,FROZEN};
    private STATUS state;   //Either Alive or Feint
    private CONDITION condition;    //Conditions applied for enemy pokemon moves.
    private enum TYPE{FIRE,WATER,LEAF};
    private TYPE type;
    private TYPE weakness;
    private int level;
    private Moves[] abilities;
    
    // constructor
    Pokemon(int _health, String _name, int _level){
        health = _health;
        name = _name;
        level = _level;
        state = STATUS.ALIVE;
        condition = CONDITION.HEALTHY;
        abilities = new Moves[4];
    }

    // Methods

    //Getters and setters
    public void setHealth(int _health){
        health = _health;
    }

    public int getHealth(){
        return health;
    }

    public void setName(String _name){
        name = _name;
    }

    public String getName(){
        return name;
    }

    public void setLevel(int val){
        level = val;
    }

    public int getLevel(){
        return level;
    }

    public void setAbility(Moves move,int abilitySlot){
        abilities[abilitySlot] = move;
    }

    public Moves getAbility(int abilitySlot){
        return abilities[abilitySlot];
    }

    //Regular Methods

    //Levels up pokemon
    //TODO: Prevent level from exceeding 100
    public void levelUp(){
        level++;
    }

    //Kills/Feints Pokemon. We use Feint as a dead pokemon
    public void feint(){
        state = STATUS.FEINT;
    }

    public void revive(){
        state = STATUS.ALIVE;
    }

}