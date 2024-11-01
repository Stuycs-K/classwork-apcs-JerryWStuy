import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TriangleTester{
   public static void main(String[] args){
     System.out.println(countTrianglesA("inputTri.txt"));
     System.out.println(countTrianglesB("inputTri.txt"));
   }



   public static int countTrianglesA(String filename){
    int temp = 0;
     try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      while(input.hasNextLine()){
        String lengths = input.nextLine();
        if (triangleExist(lengths)){
         temp++; 
        }
      }
      input.close();
     } 
     catch (FileNotFoundException ex) {
      System.out.println("File not found");
     }
     return temp; 
   }

   
  public static boolean triangleExist(String lengths) {
    int a = 0, b = 0, c = 0;
    int increment = 0;
    Scanner input = new Scanner(lengths);
    while (input.hasNext()) {
      if (increment == 0) {
        a = Integer.parseInt(input.next());
      } else if (increment == 1) {
        b = Integer.parseInt(input.next());
      } else if (increment == 2) {
        c = Integer.parseInt(input.next());
      }
      increment++;
    }
    input.close(); 
    // Check if the lengths form a triangle
    return (a + b > c) && (a + c > b) && (b + c > a);
  }

  public static boolean triangleExist(int a, int b, int c) {
    // Check if the lengths can form a triangle
    return (a + b > c) && (a + c > b) && (b + c > a);
  }

  public static int countTrianglesB(String filename){
    int temp = 0;

    try {
    File file = new File(filename);
    Scanner input = new Scanner(file);

    List<Integer> column1 = new ArrayList<>();
    List<Integer> column2 = new ArrayList<>();
    List<Integer> column3 = new ArrayList<>();
        
    while (input.hasNextLine()) {
      Scanner lineScanner = new Scanner(input.nextLine());
      if (lineScanner.hasNextInt()) {
        column1.add(lineScanner.nextInt());
      }
      if (lineScanner.hasNextInt()) {
        column2.add(lineScanner.nextInt());
      }
      if (lineScanner.hasNextInt()) {
        column3.add(lineScanner.nextInt());
      }
      lineScanner.close();
    }
    input.close();

    for (int i = 0; i < column1.size(); i++) {
      if (i < column2.size() && i < column3.size()) {
        int a = column1.get(i);
        int b = column2.get(i);
        int c = column3.get(i);
        if (triangleExist(a, b, c)) {
          temp++;
        }
      }
    }
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }
    return temp;
  }
}

