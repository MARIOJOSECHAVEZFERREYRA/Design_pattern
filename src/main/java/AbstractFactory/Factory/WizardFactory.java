package AbstractFactory.Factory;

import AbstractFactory.Armor.Armor;
import AbstractFactory.Armor.Robe;
import AbstractFactory.Enemy.Enemy;
import AbstractFactory.Enemy.Wizard;
import AbstractFactory.Weapon.Weapon;
import AbstractFactory.Weapon.WizardStaff;

public class WizardFactory extends EnemyAbstractFactory{
    @Override
    public Enemy createEnemy() {
        return new Wizard();
    }

    @Override
    public Armor createArmor() {
        return new Robe();
    }

    @Override
    public Weapon createWeapon() {
        return new WizardStaff();
    }
}
