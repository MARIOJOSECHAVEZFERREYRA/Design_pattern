package FactoryMethod;

public class TestFactoryMethod {
    public static void main(String[] args){
        Enemy warrior = new WarriorFactory().createEnemy();
        Enemy wizard = new WizardFactory().createEnemy();
        warrior.Attack();
        wizard.Attack();
    }
}
