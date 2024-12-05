import java.util.Arrays;

public class Driver{
  public static void main(String args[]){
    System.out.print(Text.CLEAR_SCREEN);
    System.out.print(Text.HIDE_CURSOR);

    int[] threeInts = randArr(3, 100);
    for (int x = 1; x <= 30; x++){
      for (int y = 1; y <= 80; y++){
        if (x == 1 || x == 30){
          Text.go(x,y);
          Text.color(41);
          System.out.print(" ");
          System.out.print(Text.RESET);
        }
        else if (x == 2){
          if (y == 21 || y == 41 || y == 61){
            Text.go(x,y);
            if (threeInts[(y/20)-1] < 25){
              Text.color(31);
              System.out.print(threeInts[(y/20)-1]);
              System.out.print(Text.RESET);
            }
            else if (threeInts[(y/20)-1] > 75){
              Text.color(32);
              System.out.print(threeInts[(y/20)-1]);
              System.out.print(Text.RESET);
            }
            else{
              System.out.print(threeInts[(y/20)-1]);
            }
          }
          else if (y == 1 || y == 80){
            Text.go(x,y);
            Text.color(41);
            System.out.print(" ");
            System.out.print(Text.RESET);
          }
        }
        else if (y == 1 || y == 80){
          Text.go(x,y);
          Text.color(41);
          System.out.print(" ");
          System.out.print(Text.RESET);
        }
        else if (x == 3){
          Text.go(x,y);
          Text.color(42);
          System.out.print("S");
          System.out.print(Text.RESET);
        }
      }
    }
    Text.go(31,0);
    System.out.print(Text.RESET);
  }

  static int[] randArr(int amount, int range){
    int[] arr = new int[amount];
    for (int i = 0; i < amount; i++){
      int x = (int)(range* Math.random());
      arr[i] = x;
    }
    return arr;
  }
}
