import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AdventOfCode1{
  public static void main(String[] args){
    System.out.println(distance("Advent1.txt"));
    System.out.println(firstLocationVisitedTwice("Advent1.txt"));
   }

   public static int distance(String filename){
     int distanceRight = 0;
     int distanceUp = 0;
     int direction = 0;
     try {
       File file = new File(filename);
       Scanner input = new Scanner(file);
       while (input.hasNext()){
         String movement = input.next();
         if (movement.substring(0,1).equals("R")){
           direction += 1;
         }
         else{
           direction -= 1;
         }
         if (direction < 0){
           direction = (4 + direction);
         }
         else{
           direction = direction % 4;
         }
         String result = movement.replace(",", "");
         if (direction == 0){
           distanceUp += Integer.parseInt(result.substring(1,result.length()));
         }
         else if (direction == 1){
           distanceRight += Integer.parseInt(result.substring(1,result.length()));
         }
         else if (direction == 2){
           distanceUp -= Integer.parseInt(result.substring(1,result.length()));
         }
         else{
           distanceRight -= Integer.parseInt(result.substring(1,result.length()));
         }
       }
       input.close();
     }
     catch (FileNotFoundException ex) {
       System.out.println("File not found");
     }
     return (Math.abs(distanceRight) + Math.abs(distanceUp));
   }

   public static int firstLocationVisitedTwice(String filename) {
    int distanceRight = 0;
    int distanceUp = 0;
    int direction = 0;
    Set<String> visitedLocations = new HashSet<>();
    visitedLocations.add(distanceRight + "," + distanceUp);
    try {
        File file = new File(filename);
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String movement = input.next();
            if (movement.substring(0, 1).equals("R")) {
                direction += 1;
            } else {
                direction -= 1;
            }
            if (direction < 0) {
                direction = (4 + direction);
            } else {
                direction = direction % 4;
            }
            int steps = Integer.parseInt(movement.substring(1, movement.length()-1));
            for (int i = 0; i < steps; i++) {
                if (direction == 0) {
                    distanceUp++;
                } else if (direction == 1) {
                    distanceRight++;
                } else if (direction == 2) {
                    distanceUp--;
                } else {
                    distanceRight--;
                }
                String currentLocation = distanceRight + "," + distanceUp;
                if (visitedLocations.contains(currentLocation)) {
                    input.close();
                    return Math.abs(distanceRight) + Math.abs(distanceUp);
                } 
                else{
                  visitedLocations.add(currentLocation);
                }
            }
        }
        input.close();
    } catch (FileNotFoundException ex) {
        System.out.println("File not found");
    }
    return -1;
  } 
}
