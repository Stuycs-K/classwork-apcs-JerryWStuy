import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AdventOfCode6{
  public static void main(String[] args) {
    System.out.println(decodeMessage("Advent6.txt"));
    System.out.println(decodeMessageLeast("Advent6.txt"));
  }

  public static String decodeMessage(String filename) {
    String message = "";
    ArrayList<String> lines = new ArrayList<>();
    try {
      File file = new File(filename);
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        lines.add(scanner.nextLine());
      }
      scanner.close();

    } catch (FileNotFoundException e) {
      System.out.println("File not found");
      return "";
    }

    int numColumns = lines.get(0).length(); 
    for (int col = 0; col < numColumns; col++) {
      int[] frequency = new int[26];
        for (String line : lines) {
          char c = line.charAt(col);  
          frequency[c - 'a']++;
        }

    char mostChar = 'a';  
    int max = frequency[0]; 

    for (int i = 0; i < 26; i++) {  
      if (frequency[i] > max || (frequency[i] == max && (char) ('a' + i) < mostChar)) {
        mostChar = (char) ('a' + i);  
        max = frequency[i];  
      }
    }
    message += mostChar;  
    }
  return message;
  }

  public static String decodeMessageLeast(String filename) {
    String message = "";
    ArrayList<String> lines = new ArrayList<>();
    try {
      File file = new File(filename);
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        lines.add(scanner.nextLine());
      }
      scanner.close();

    } catch (FileNotFoundException e) {
      System.out.println("File not found");
      return "";
    }

    int numColumns = lines.get(0).length(); 
    for (int col = 0; col < numColumns; col++) {
      int[] frequency = new int[26];
        for (String line : lines) {
          char c = line.charAt(col);  
          frequency[c - 'a']++;
        }

    char mostChar = 'a';  
    int max = frequency[0]; 

    for (int i = 0; i < 26; i++) {  
      if (frequency[i] < max || (frequency[i] == max && (char) ('a' + i) > mostChar)) {
        mostChar = (char) ('a' + i);  
        max = frequency[i];  
      }
    }
    message += mostChar;  
    }
  return message;
  }
}
