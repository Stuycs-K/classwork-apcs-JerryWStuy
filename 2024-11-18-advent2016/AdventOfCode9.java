import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AdventOfCode9{
  public static void main(String[] args) {
    System.out.println(decompressedLength("Advent9.txt"));
  }

  public static int decompressedLength(String filename){
    String entireString = "";
    try {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
          entireString += scanner.nextLine();
        }
        scanner.close();
        return actualDecompressedLength(entireString);
      }
    catch (FileNotFoundException e) {
      System.out.println("File not found");
      return 0;
    }
  }


  public static int actualDecompressedLength(String entireString){
    int length = 0;
    int i = 0;
    while (i < entireString.length()) {
        char current = entireString.charAt(i);
        if (current == '(') {
            int closingParentheses = entireString.indexOf(')', i);
            String marker = entireString.substring(i + 1, closingParentheses);
            String[] parts = marker.split("x");
            int numChars = Integer.parseInt(parts[0]);
            int repeatCount = Integer.parseInt(parts[1]);
            length += numChars * repeatCount;
            i = closingParentheses + 1 + numChars;
        } else {
            length++;
            i++;
        }
    }
    return length;
  }


  
}