package AbstractFactory;

import AbstractFactory.Armor.Armor;
import AbstractFactory.Enemy.Enemy;
import AbstractFactory.Factory.EnemyAbstractFactory;
import AbstractFactory.Factory.WarriorFactory;
import AbstractFactory.Factory.WizardFactory;
import AbstractFactory.Weapon.Weapon;



public class TestAbstractFactory {
    public static void main(String[] args) {
        EnemyAbstractFactory factory = new WarriorFactory();
        Enemy warrior = factory.createEnemy();
        Armor heavyArmor = factory.createArmor();
        Weapon axe = factory.createWeapon();
        warrior.attack();
        heavyArmor.protect();
        axe.damage();

        factory = new WizardFactory();
        Enemy wizard = factory.createEnemy();
        Armor robe = factory.createArmor();
        Weapon wizardStaff = factory.createWeapon();
        wizard.attack();
        robe.protect();
        wizardStaff.damage();


    }
}
