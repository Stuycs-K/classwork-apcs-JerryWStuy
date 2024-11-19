import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AdventOfCode7{
  public static void main(String args[]){
    System.out.println(validIPs("Advent7.txt"));
  }

  public static int validIPs(String filename){
    int sum = 0;
    try {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
          String line = scanner.nextLine();
          line = line.replace(']',',');
          line = line.replace('[',',');
          String[] parts = line.split(",");

          for (int i = 0; i < line.length; i++){
            for (int x = 0; x < line[i].length(); x++){
              if (i % 2 == 0){
                // if even and ABBA break
              }
              else{
                // if ABBA then +1
              }
            }
          }
        }
        scanner.close();
        return 0;
      }
    catch (FileNotFoundException e) {
      System.out.println("File not found");
      return 0;
    }
  }
}
