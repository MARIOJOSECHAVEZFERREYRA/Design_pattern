package Brigde.Enemy;

import Brigde.Fighter.Fighter;
import Brigde.Fighter.WizardFighterImpl;
import com.sun.org.apache.bcel.internal.generic.GETFIELD;

public class Wizard extends Enemy {
    public Wizard() {
        setFighter(new WizardFighterImpl());
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public Enemy setHealth(int health) {
        return super.setHealth(health);
    }

    public void attack() {
        System.out.println("Wizard: ");
        getFighter().attack();
    }

    public void protect() {
        System.out.println("Wizard: ");
        getFighter().protect();
    }
}
