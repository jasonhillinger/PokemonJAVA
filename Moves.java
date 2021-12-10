public class Moves {
    // This class will contain moves/abilities for Pokemon to use
    private String name;
    private int powerPoints; // Amount of times this move can be used. AKA PP in game
    private int damage; // amount of damage this ability will cause to another pokemons HP
    private TYPE type;
    private CONDITION condition; //Condition that will be applied when ability is used.
    private int levelRequirement;

    public Moves(String _name, int _powerPoints,int _damage,TYPE _type,CONDITION _condition, int _level) {
        name = _name;
        powerPoints = _powerPoints;
        damage = _damage;
        type = _type;
        condition = _condition;
        levelRequirement = _level;
    }

    public int getDamage(){
        return damage;
    }

    public int getPowerpoints(){
        return powerPoints;
    }

    public void setPowerpoints(int val){
        powerPoints = val;
    }

    public void use(){
        powerPoints--;
    }
}
