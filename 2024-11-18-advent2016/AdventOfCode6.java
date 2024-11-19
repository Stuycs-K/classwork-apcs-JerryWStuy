import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AdventOfCode6{
  public static void main(String[] args) {
    System.out.println(decodeMessage("Advent6.txt"));
  }

  public static String decodeMessage(String filename) {
    String decodedMessage = "";
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

    char mostFrequentChar = 'a';  
    int maxFrequency = frequency[0]; 

    for (int i = 0; i < 26; i++) {  
      if (frequency[i] > maxFrequency || (frequency[i] == maxFrequency && (char) ('a' + i) < mostFrequentChar)) {
        mostFrequentChar = (char) ('a' + i);  
        maxFrequency = frequency[i];  
      }
    }
    decodedMessage += mostFrequentChar;  
    }
  return decodedMessage;
  }
}
