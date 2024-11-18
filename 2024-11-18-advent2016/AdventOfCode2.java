import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdventOfCode2{
  public static void main(String[] args){
    System.out.println(distance("Advent2.txt"));
   }
   public static int distance(String filename){
     String code = "";
     try {
       File file = new File(filename);
       Scanner input = new Scanner(file);
       while (input.hasNextLine()){
         String movement = input.nextLine();
         if (movement.substring(0,1).equals("R")){
           direction += 1;
         }
         else{
           direction -= 1;
         }
         if (direction < 0){
           direction = (4+direction);
         }
         else{
           direction = direction % 4;
         }
         if (direction == 0){
           distanceUp += Integer.parseInt(movement.substring(1,2));
         }
         else if (direction == 1){
           distanceRight += Integer.parseInt(movement.substring(1,2));
         }
         else if (direction == 2){
           distanceUp -= Integer.parseInt(movement.substring(1,2));
         }
         else{
           distanceRight -= Integer.parseInt(movement.substring(1,2));
         }
       }
       input.close();
     }
     catch (FileNotFoundException ex) {
       System.out.println("File not found");
     }
     return (Math.abs(distanceRight) + Math.abs(distanceUp));
   }
}
