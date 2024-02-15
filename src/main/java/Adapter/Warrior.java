package Adapter;

public class Warrior implements Enemy{
    @Override
    public void attack() {
        System.out.println("Warrior attacks!");
    }

    @Override
    public void damage() {
        System.out.println("Warrior damage!");
    }
}

