import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      String text = "This is a sample\nOf how to read\ntext!";

      // creates a Scanner object to read throug the String
      Scanner input = new Scanner(text);

      //you don't want a for loop here unless you know the size of the data set

      while(input.hasNext()){
        System.out.println(input.next());
      }
      System.out.println(text);

      Scanner sc1 = new Scanner("This is a bunch of words");

      while(sc1.hasNext()){
        System.out.println(sc1.next());
      }
      System.out.println(sc1);

      Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2");
      int temp = 0;
      while(sc2.hasNext()){
        temp += sc2.nextDouble();
      }
      System.out.println(temp);
    }
  }
