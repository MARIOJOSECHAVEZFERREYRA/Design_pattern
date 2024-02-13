package Factory;

public class TestFactory {
    public static void main(String[] args){
         EnemyFactory enemyFactory = new EnemyFactory();
         Enemy warrior = enemyFactory.createEnemy("Warrior");
         Enemy wizard = enemyFactory.createEnemy("Wizard");
         warrior.Attack();
         wizard.Attack();
    }
}
