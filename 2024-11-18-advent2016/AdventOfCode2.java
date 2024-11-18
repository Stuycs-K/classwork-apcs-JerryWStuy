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
         
       input.close();
     }
     catch (FileNotFoundException ex) {
       System.out.println("File not found");
     }
     return (Math.abs(distanceRight) + Math.abs(distanceUp));
   }
}
