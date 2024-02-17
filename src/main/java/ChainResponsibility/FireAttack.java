package ChainResponsibility;

public class FireAttack extends ElementaryAttack{
    public FireAttack() {
    }

    public FireAttack(ElementaryAttack next) {
        super(next);
    }

    @Override
    public void attack(Player player) {
        if(player.getTypePlayer().equals(TypePlayer.VAMPIRE))
            System.out.println("FIRE attack!!");
        else if(hasNext())
            getNext().attack(player);
        else
            System.out.println("No attack was found");
    }
}

