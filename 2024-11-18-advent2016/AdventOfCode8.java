import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AdventOfCode8{
  public static void main(String[] args) {

  }

  public static int litUpPoints(String filename){
    try {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        int[][] arr = new int[50][6];
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
      for (int i = 0; i < xByx[1]; i++){
        for (int x = 0; x < xByx[0]; x++){
          arr[i][x] ++;
        }
      }
    }
    else{
      if (lineArr[1].equals("row")){
        int axis = Integer.parseInt(lineArr[2].substring(2));

      }
      else{
        int axis = Integer.parseInt(lineArr[2].substring(2));

      }
    }
  }

  public static int rectangle(int[][]arr){
    int sum = 0
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
