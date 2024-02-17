package ChainResponsibility;

public class Wizard {
    private ElementaryAttack elementaryAttack;

    public Wizard(ElementaryAttack elementaryAttack) {
        this.elementaryAttack = elementaryAttack;
    }

    public ElementaryAttack getElementaryAttack() {
        return elementaryAttack;
    }

    public Wizard setElementaryAttack(ElementaryAttack elementaryAttack) {
        this.elementaryAttack = elementaryAttack;
        return this;
    }

    public void chainAttack(Player player){
        System.out.println("Attack to " + player.getTypePlayer().name().toLowerCase());
        elementaryAttack.attack(player);
    }

}
