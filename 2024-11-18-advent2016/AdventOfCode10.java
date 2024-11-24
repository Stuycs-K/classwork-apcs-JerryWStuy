import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class AdventOfCode10 {
  public static void main(String[] args) {
    System.out.println(whichRobot("Advent10.txt"));
  }

  public static int whichRobot(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      ArrayList<String> instructions = new ArrayList<>();
      while (input.hasNextLine()) {
        instructions.add(input.nextLine());
      }
      input.close();
      System.out.println(getResponsibleBot(instructions, 61, 17));
    } catch (FileNotFoundException ex) {
    System.out.println("File not found");
    }
    return -1;
  }

  public static int getResponsibleBot(ArrayList<String> instructions, int chip1, int chip2){
    return -1;
  }
}