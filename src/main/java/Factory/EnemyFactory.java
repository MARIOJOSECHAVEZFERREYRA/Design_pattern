package Factory;

public class EnemyFactory {
    public Enemy createEnemy(String type){
        if(type.equalsIgnoreCase("Warrior"))
            return new Warrior();
        else if(type.equalsIgnoreCase("Wizard"))
            return new Wizard();
        else
            return null;
    }
}
