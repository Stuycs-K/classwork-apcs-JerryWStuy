import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class TriangleTester{
   public static void main(String[] args){
     System.out.println(countTrianglesA("inputTri.txt");
   }



   public static int countTrianglesA(String filename){
     int a = 0;
     int b = 0;
     int c =0;
     try {
       File file = new File(filename);
       Scanner input = new Scanner(file);
     input.close();//releases the file from your program

     } catch (FileNotFoundException ex) {
     //File not found what should you do?
     System.out.println("File not found");
     return; //you can return from a void function just don't put a value.
     }
     int temp = 0;

     Scanner input = new Scanner(filename);
     while(input.hasNext()){
       if (triangleExist()

     }

   }
   public static boolean triangleExist(String lengths){

   }
}
