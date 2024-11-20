import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AdventOfCode7{

  public static void main(String[] args) {
    System.out.println(validIPs("Advent7.txt"));
    System.out.println(supportSSL("Advent7.txt"));
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
        if (isItABBA(segment)) {
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

  public static boolean isItABBA(String segment) {
    return segment.charAt(0) == segment.charAt(3) &&
           segment.charAt(1) == segment.charAt(2) &&
           segment.charAt(0) != segment.charAt(1);
  }

  public static int supportSSL(String filename){
    int sum = 0;
    try {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
          String line = scanner.nextLine();
          line = line.replace(']',',');
          line = line.replace('[',',');
          String[] parts = line.split(",");
          if (insideOut(parts)){
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

  public static boolean insideOut(String[] parts){
    boolean isABA = false;
    for (int i = 0; i < parts.length; i += 2) {
      for (int x = 0; x < parts[i].length() - 2; x++) {
        String segment = parts[i].substring(x, x + 3);
        if (isItABA(segment)) {
          String segmentBackwards = segment.substring(1,2) + segment.substring(0,1) + segment.substring(1,2);
          for (int j = 1; j < parts.length; j += 2) {  
            if (parts[j].contains(segmentBackwards)) {
              return true;  
            }
          }
        }
      }
    }
    return isABA;
  }
  public static boolean isItABA(String segment) {
    return segment.charAt(0) == segment.charAt(2) &&
           segment.charAt(0) != segment.charAt(1);
  }
}
