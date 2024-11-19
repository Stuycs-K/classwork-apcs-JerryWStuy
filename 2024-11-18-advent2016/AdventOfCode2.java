import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdventOfCode2 {
  public static void main(String[] args) {
    System.out.println(getCode("Advent2.txt"));
    System.out.println(getBathroomCode("Advent2.txt"));

  }
  public static String getCode(String filename) {
    String code = "";
    int[][] pinpad = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };
    int currentRow = 1;  
    int currentCol = 1;  

    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);

      while (input.hasNextLine()) {
        String line = input.nextLine();
        for (char i : line.toCharArray()) {  
          try {
            if (i == 'U') {
              if (currentRow - 1 >= 0) {
                currentRow--;
              }
            } else if (i == 'D') {
              if (currentRow + 1 < pinpad.length) {
                currentRow++;
              }
            } else if (i == 'L') {
              if (currentCol - 1 >= 0) {
                currentCol--;
              }
            } else if (i == 'R') {
              if (currentCol + 1 < pinpad[0].length) {
                currentCol++;
              }
            }
          } 
          catch (Exception e) {
            System.out.println("Out of bounds, staying where I am");
          }
        }
        code += pinpad[currentRow][currentCol];
      }
      input.close();
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }
    return code;
  }

  public static String getBathroomCode(String filename) {
    String[][] keypad = {
        {null, null, "1", null, null},
        {null, "2", "3", "4", null},
        {"5", "6", "7", "8", "9"},
        {null, "A", "B", "C", null},
        {null, null, "D", null, null}
    };
    int currentRow = 2; // Starting at the '5'
    int currentCol = 0;
    String code = "";

    try {
        File file = new File(filename);
        Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            for (char move : line.toCharArray()) {
                if (move == 'U') {
                    if (currentRow > 0 && keypad[currentRow - 1][currentCol] != null) {
                        currentRow--;
                    }
                } else if (move == 'D') {
                    if (currentRow < 4 && keypad[currentRow + 1][currentCol] != null) {
                        currentRow++;
                    }
                } else if (move == 'L') {
                    if (currentCol > 0 && keypad[currentRow][currentCol - 1] != null) {
                        currentCol--;
                    }
                } else if (move == 'R') {
                    if (currentCol < 4 && keypad[currentRow][currentCol + 1] != null) {
                        currentCol++;
                    }
                }
            }
            code += keypad[currentRow][currentCol];
        }
        input.close();
    } catch (FileNotFoundException ex) {
        System.out.println("File not found");
    }
    return code;
  }
}