package Factory;

public class WizardFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy(String type) {
        return new Wizard();
    }
}
