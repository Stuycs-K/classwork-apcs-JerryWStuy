public class Driver {
    public static void main(String[] args) {
        Adventurer Furina = new Furina("Hydro Queen", 100);

        // Self method testing 
        System.out.println(Furina.getName());
        System.out.println("HP: " + Furina.getHP());

        System.out.println("Special stacks(" + Furina.getSpecialName() + "): " + Furina.getSpecial());
        Furina.restoreSpecial(50);
        System.out.println("Special stacks (" + Furina.getSpecialName() + ") after restoring: " + Furina.getSpecial());

        System.out.println(Furina.support());
        System.out.println("HP after support: " + Furina.getHP());

        // Opponent testing
        Adventurer Hilichurl = new Furina("Hilichurl", 80);
        System.out.println(Furina.attack(Hilichurl));
        System.out.println("HP after normal attack: " + Hilichurl.getHP());

        System.out.println(Furina.specialAttack(Hilichurl));
        System.out.println("HP after special attack: " + Hilichurl.getHP());

        System.out.println(Furina.support(Hilichurl));
        System.out.println("HP after support: " + Hilichurl.getHP());
    }
}
