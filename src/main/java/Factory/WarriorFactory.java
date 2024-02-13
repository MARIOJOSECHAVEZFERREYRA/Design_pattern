package Factory;

public class WarriorFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy(String type) {
        return new Warrior();
    }
}
