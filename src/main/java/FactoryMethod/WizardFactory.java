package FactoryMethod;

public class WizardFactory extends EnemyFactory{
    @Override
    public Enemy createEnemy() {
        return new Wizard();
    }
}
