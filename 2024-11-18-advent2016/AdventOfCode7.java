import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AdventOfCode7{

  public static void main(String[] args) {
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
          if (evenOrNot(parts)){
            sum++;
          }
        }
        scanner.close();
        return sum;
      }
    catch (FileNotFoundException e) {
      System.out.println("File not found");
      return 0;
    }
  }

  public static boolean evenOrNot(String[] parts){
    boolean isABBA = false;
    for (int i = 0; i < parts.length; i++) {
      boolean isHypernet = (i % 2 != 0);
      for (int x = 0; x < parts[i].length() - 3; x++) {
        String segment = parts[i].substring(x, x + 4);
        if (isABBA(segment)) {
          if (isHypernet) {
            return false; 
          } else {
            isABBA = true; 
          }
        }
      }
    }
    return isABBA;
  }

  public static boolean isABBA(String segment) {
    return segment.charAt(0) == segment.charAt(3) &&
           segment.charAt(1) == segment.charAt(2) &&
           segment.charAt(0) != segment.charAt(1);
  }
}
