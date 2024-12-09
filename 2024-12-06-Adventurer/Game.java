import java.util.Scanner;
public class Game {
  public static void main(String[] args) {
    //do this once
    Scanner userInput = new Scanner(System.in);

    //You can do the rest many times:

    System.out.println("Enter username");
    String userName = userInput.nextLine();
    System.out.println("Username is: " + userName);

    Furina Furina = new Furina("My Furina", 1000);
    Furina CodeWarrior = new Furina("Their CodeWarrior", 1000);
    while (CodeWarrior.getHP() > 0 && Furina.getHP() > 0){
      System.out.println("Enter the move you want to do");
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String move = userInput.nextLine();

      if (move.equals("quit")){
        break;
      }
      else if (move.equals("attack") || move.equals("a")){
        Furina.attack(CodeWarrior);
      }
      else if (move.equals("special") || move.equals("sp")){
        Furina.specialAttack(CodeWarrior);
      }
      else if (move.equals("support") || move.equals("su")){
        Furina.support();
      }
      else{
        System.out.println("This is an invalid move, please try again.");
        continue;
      }

      int random = (int)(Math.random() * 3);
      if (random == 0){
        CodeWarrior.attack(Furina);
      }
      else if (random == 1){
        CodeWarrior.specialAttack(Furina);
      }
      else if (random == 2){
        CodeWarrior.support();
      }

      System.out.println("Furina's HP: " + Furina.getHP());
      System.out.println("CodeWarrior's HP: " + CodeWarrior.getHP());

    }
    if (Furina.getHP() > 0){
      System.out.println("Of course the Focalors of Fontaine won.");
    }
    else{
      System.out.println("Rigged battle, bad game design.");
    }
    System.out.println("Game ended.");
  }
}
