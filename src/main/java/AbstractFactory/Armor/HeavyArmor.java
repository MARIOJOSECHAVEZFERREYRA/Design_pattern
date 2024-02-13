package AbstractFactory.Armor;

public class HeavyArmor implements Armor {
    @Override
    public void protect() {
        System.out.println("Heavy armor protect!");
    }
}
