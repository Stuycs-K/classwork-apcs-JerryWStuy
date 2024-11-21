import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AdventOfCode8{
  public static void main(String[] args) {
    System.out.println(litUpPoints("Advent8.txt"));
  }

  public static int litUpPoints(String filename){
    try {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        int[][] arr = new int[6][50];
        while (scanner.hasNextLine()) {
          String line = scanner.nextLine();
          rectangleShift(arr, line);
        }
        scanner.close();
        return rectangle(arr);
      }
    catch (FileNotFoundException e) {
      System.out.println("File not found");
      return 0;
    }
  }

  public static void rectangleShift(int[][] arr, String line){
    String[] lineArr = line.split("\\s+");
    if (lineArr[0].equals("rect")){
      String[] xByx = lineArr[1].split("x");
      for (int i = 0; i < Integer.parseInt(xByx[1]); i++){
        for (int x = 0; x < Integer.parseInt(xByx[0]); x++){
          arr[i][x] = 1;
        }
      }
    }
    else if (lineArr[1].equals("row")) {
      int row = Integer.parseInt(lineArr[2].substring(2));  
      int shift = Integer.parseInt(lineArr[4]);  
      int[] temp = new int[arr[0].length];
      System.arraycopy(arr[row], 0, temp, 0, arr[row].length);
      for (int i = 0; i < arr[row].length; i++) {
        arr[row][(i + shift) % arr[row].length] = temp[i];
      }
    } 
    else {
      int col = Integer.parseInt(lineArr[2].substring(2));  
      int shift = Integer.parseInt(lineArr[4]);  
      int[] temp = new int[arr.length];
      for (int i = 0; i < arr.length; i++) {
        temp[i] = arr[i][col];
      }
      for (int i = 0; i < arr.length; i++) {
        arr[(i + shift) % arr.length][col] = temp[i];
      }
    }
  }

  public static int rectangle(int[][]arr){
    int sum = 0;
    for (int i = 0; i < arr.length; i++){
      for (int x = 0; x < arr[0].length; x++){
        if (arr[i][x] > 0){
          sum++;
        }
      }
    }
    return sum;
  }
}
