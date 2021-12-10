public class Pokemon {
    // Parent Class for all Pokemon

    // Data members
    private int health;
    private String name;

    private enum STATUS {
        ALIVE, FEINT
    };

    private STATUS state; // Either Alive or Feint
    private CONDITION condition; // Conditions applied for enemy pokemon moves.
    private TYPE type;
    private TYPE weakness;
    private int level;
    private Moves[] abilities;

    private Moves empty = new Moves("Empty", 0, 0, TYPE.NONE, CONDITION.NONE, 0);

    // constructor
    Pokemon(int _health, String _name, int _level) {
        health = _health;
        name = _name;
        level = _level;
        state = STATUS.ALIVE;
        condition = CONDITION.HEALTHY;
        abilities = new Moves[4];
        //initializing moves to empty
        for (int i = 0; i < abilities.length; i++) {
            abilities[i] = empty;
        }
    }

    // Methods

    // Getters and setters
    public void setHealth(int _health) {
        health = _health;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String _name) {
        name = _name;
    }

    public String getName() {
        return name;
    }

    public void setLevel(int val) {
        level = val;
    }

    public int getLevel() {
        return level;
    }

    public void setAbility(Moves move, int abilitySlot) {
        abilities[abilitySlot] = move;
    }

    public Moves getAbility(int abilitySlot) {
        return abilities[abilitySlot];
    }

    // Regular Methods

    // Levels up pokemon
    // TODO: Prevent level from exceeding 100
    public void levelUp() {
        level++;
    }

    // Kills/Feints Pokemon. We use Feint as a dead pokemon
    public void feint() {
        state = STATUS.FEINT;
    }

    public void revive() {
        state = STATUS.ALIVE;
    }

    public void attack(Pokemon enemy, Moves move) {
        if (move.getPowerpoints() <= 0) {
            System.out.println("Not enough PP!");
        } else {
            enemy.health -= move.getDamage();
            move.use();
            if (enemy.health <= 0) {
                enemy.health = 0; // ensures no negative HP
                enemy.feint(); // pokemon feints due to zero health
            }
        }
    }

    //will print the abilities with powerpoints and the array slot associated with it
    public void printAbilities(){
        System.out.println("Name: " + name + "\tHP: " + health);
        for (int i = 0; i < abilities.length; i++) {
            System.out.println(i+1 + ": " + abilities[i].getName() + " PP: "+abilities[i].getPowerpoints());
        }
    }

}