public class Furina extends Adventurer {
    private String nickname = "";
    private int fanfareStacks = 0;
    private int damage = 0;

    public Furina(String name){
        super(name);
        nickname = name;
    }
    public Furina(String name, int hp){
        super(name,hp);
        nickname = name;
    }

    public int restoreSpecial(int n){
        if( n > getSpecialMax() - getSpecial()){
                n = getSpecialMax() - getSpecial();
        }
        setSpecial(getSpecial()+n);
        damage = fanfareStacks * 2;
        return n;
    }

    public String getSpecialName(){
        return("Fanfare");
    }
    public int getSpecial(){
        return fanfareStacks;
    }
    public void setSpecial(int n){
        if (n < getSpecialMax()){
            fanfareStacks = n;
        }
        damage = fanfareStacks * 2;
    }
    public int getSpecialMax(){
        return 400;
    }

    public String getNickame(){
        return("My name is Furina, also known as Focalors. My nickname is: " + nickname);
    }

    public String attack(Adventurer other){
        other.applyDamage(damage);
        other.setHP(other.getHP()- damage);
        return (other.getName() + " just took " + damage + " damage from a normal attack.");
    }

    public String support(Adventurer other){
        this.setHP(this.getHP()-5);
        other.setHP(other.getHP()+fanfareStacks*10);
        return("Healed you for " + fanfareStacks*10 + "hp.");
    }

    public String support(){
        this.setHP(this.getHP()+fanfareStacks*10);
        return("Healed myself for " + fanfareStacks*10 + "hp.");
    }

    public String specialAttack(Adventurer other){
        other.setHP(other.getHP()- damage*5);
        return (other.getName() + " just took " + damage*5 + " damage from a bubble attack.");
    }
}
