public class Pokemon implements Cloneable {
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
    private int speed;
    private Moves[] abilities;

    // constructor
    Pokemon(int _health, String _name, int _level, TYPE _type) {
        health = _health;
        name = _name;
        level = _level;
        state = STATUS.ALIVE;
        condition = CONDITION.HEALTHY;
        abilities = new Moves[4];
        type = _type;
        switch (type) {
            case FIRE:
                weakness = TYPE.WATER;
                break;
            case WATER:
                weakness = TYPE.LEAF;
                break;
            case LEAF:
                weakness = TYPE.FIRE;
                break;
            default:
                weakness = TYPE.NONE;
                break;
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
        if (move.getLevelRequirement() > level) {
            System.out.println(name + " is too low of level to learn " + move.getName());
        } else {
            abilities[abilitySlot] = move;
        }
    }

    public Moves getAbility(int abilitySlot) {
        return abilities[abilitySlot];
    }

    public CONDITION getCondition() {
        return condition;
    }

    public void setCondition(CONDITION cond) {
        condition = cond;
    }

    public TYPE getWeakness() {
        return weakness;
    }

    public TYPE getType(){
        return type;
    }

    public void setWeakness(TYPE weak) {
        weakness = weak;
    }

    // Regular Methods

    // Levels up pokemon
    public void levelUp() {
        level++;
        if (level > 100) {
            level = 100;
        }
        System.out.println(name + " has leveled up and is now level " + level + "!");
    }

    // Kills/Feints Pokemon. We use Feint as a dead pokemon
    public void feint() {
        state = STATUS.FEINT;
        health = 0;
        System.out.println(name + " has feinted!");
    }

    // revives Pokemon with a set amount of health
    public void revive(int hp) {
        state = STATUS.ALIVE;
        health += hp;
        System.out.println(name + " has been revived with " + hp + " health");
    }

    public void attack(Pokemon enemy, int abilityNum) {
        float damageMulti; // damage being multiplied depending on weakness
        if (abilities[abilityNum].getType() == enemy.weakness) {
            damageMulti = 2; // 2x damage if enemy is weak to type of attack
        } else {
            damageMulti = 1; // regular damage otherwise
        }

        if (abilities[abilityNum].getPowerpoints() <= 0) {
            System.out.println("Not enough PP!");
        } else {
            enemy.health -= (int) (abilities[abilityNum].getDamage() * damageMulti);
            abilities[abilityNum].use();
            System.out.println(name + " attacked " + enemy.name + " with " + abilities[abilityNum].getName() + " for "
                    + abilities[abilityNum].getDamage() * damageMulti + " damage!");
            if (enemy.health <= 0) {
                enemy.feint(); // pokemon feints due to zero health
            }
        }
    }

    // will print the abilities with powerpoints and the array slot associated with
    // it
    public void printAbilities() {
        try {
            System.out.println("Name: " + name + "\tHP: " + health);
            for (int i = 0; i < abilities.length; i++) {
                System.out.println(i + 1 + ": " + abilities[i].getName() + " PP: " + abilities[i].getPowerpoints());
            }
        } catch (NullPointerException e) {
            // Do nothing
        }
    }

    // used to clone Pokemon to a trainer
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}