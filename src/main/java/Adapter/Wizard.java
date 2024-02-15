package Adapter;

public class Wizard implements Enemy{
    @Override
    public void attack() {
        System.out.println("Wizard damage!");
    }

    @Override
    public void damage() {
        System.out.println("Wizard damage!");
    }
}
