package Brigde.Fighter;

import Brigde.Enemy.Enemy;

import java.security.spec.ECField;

public class WizardFighterImpl implements Fighter {
    @Override
    public void attack() {
        System.out.println("Wizard protect!");
    }

    @Override
    public void protect() {
        System.out.println("Wizard protect!");
    }
}
