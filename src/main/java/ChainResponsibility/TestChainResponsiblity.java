package ChainResponsibility;

public class TestChainResponsiblity {
    public static void main(String[] args) {
        Player player = new Player(TypePlayer.WIZARD);
        Wizard wizard = new Wizard(new FireAttack(new IceAttack( new ElectricAttack())));
        wizard.chainAttack(player);
    }
}
