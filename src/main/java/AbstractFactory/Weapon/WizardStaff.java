package AbstractFactory.Weapon;

public class WizardStaff implements Weapon{
    @Override
    public void damage() {
        System.out.println("Wizard staff attack!");
    }
}
