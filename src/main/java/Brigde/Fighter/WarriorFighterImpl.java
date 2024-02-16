package Brigde.Fighter;

public class WarriorFighterImpl implements Fighter{
    @Override
    public void attack() {
        System.out.println("Warrior attack!");
    }

    @Override
    public void protect() {
        System.out.println("Warrior protect!");
    }
}
