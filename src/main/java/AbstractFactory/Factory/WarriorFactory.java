package AbstractFactory.Factory;

import AbstractFactory.Armor.Armor;
import AbstractFactory.Armor.HeavyArmor;
import AbstractFactory.Enemy.Enemy;
import AbstractFactory.Enemy.Warrior;
import AbstractFactory.Weapon.Axe;
import AbstractFactory.Weapon.Weapon;

public class WarriorFactory extends EnemyAbstractFactory{
    @Override
    public Enemy createEnemy() {
        return new Warrior();
    }

    @Override
    public Armor createArmor() {
        return new HeavyArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new Axe();
    }
}
