package Brigde.Enemy;

import Brigde.Fighter.Fighter;

public abstract class Enemy {
    private int health;
    protected Fighter fighter;

    public int getHealth() {
        return health;
    }

    public Enemy setHealth(int health) {
        this.health = health;
        return this;
    }

    public Fighter getFighter() {
        return fighter;
    }

    public Enemy setFighter(Fighter fighter) {
        this.fighter = fighter;
        return this;
    }
}
