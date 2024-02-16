package Brigde;

import Brigde.Enemy.Warrior;
import Brigde.Enemy.Wizard;
import Brigde.Fighter.WarriorFighterImpl;
import Brigde.Fighter.WizardFighterImpl;

public class TestBrigde {
    public static void main(String[] args) {
        System.out.println("========= Warrior ========");
        Warrior warrior = new Warrior();
        warrior.attack();
        warrior.protect();
        warrior.setFighter(new WizardFighterImpl());
        warrior.attack();
        warrior.protect();
        System.out.println("========= Wizard ========");
        Wizard wizard = new Wizard();
        wizard.attack();
        wizard.protect();
        wizard.setFighter(new WarriorFighterImpl());
        wizard.attack();
        wizard.protect();

    }
}
