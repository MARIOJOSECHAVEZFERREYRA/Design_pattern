package AbstractFactory.Factory;

import AbstractFactory.Armor.Armor;
import AbstractFactory.Enemy.Enemy;
import AbstractFactory.Weapon.Weapon;

public abstract class EnemyAbstractFactory {
    public abstract Enemy createEnemy();
    public abstract Armor createArmor();
    public abstract Weapon createWeapon();
}
