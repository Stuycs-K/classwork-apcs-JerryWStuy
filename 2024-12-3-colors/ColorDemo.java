public class ColorDemo{

  public static final String CLEAR_SCREEN = "\u001b[2J";
  public static final String CLEAR_COLOR =  "\u001b[0m";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";
  public static int BLACK = 30;
  public static int RED = 31;
  public static int GREEN = 32;

  public static void main(String args[]){
    color(32,41);
    System.out.print("These are the first two colors that I actually liked. I have them here to demonstrate the first part of the lesson. Ironically, they happened to be green and red, though you'd have to highlight the text to see the green. I guess Christmas fever must have gotten to me.");
    System.out.println(CLEAR_COLOR);
    System.out.println("I now clear the color for the back/foreground before doing anything next.");
    color(RED, GREEN+10);
    System.out.print("These are manually inverted colors of my first line.");
    System.out.println("\u001b[7m");
    System.out.println("I've now inversed them to be the same as the first.");
    System.out.println("\u001b[39m");
    System.out.println("Reset foreground to default.");
    System.out.println("\u001b[49m");
    System.out.println("Reset background to default.");
    System.out.println("\u001b[1m");
    System.out.println("This is bolded text.");
    System.out.println(CLEAR_COLOR);
    System.out.println(HIDE_CURSOR);
    System.out.println("Now your cursor is gone");
    System.out.println(SHOW_CURSOR);
    System.out.println("Now your cursor is back");
  }

  public static void color(int foreground,int background){
    System.out.print( "\u001b[" + foreground + ";" + background + "m");
  }

  public static void color(int foreground, int background, int modifier){
    System.out.print( "\u001b[" + foreground + ";" + background + ";" + modifier + "m");
  }

  public static void go(int r,int c){
    System.out.print("\u001b[" + r + ";" + c + "f");
  }
}
