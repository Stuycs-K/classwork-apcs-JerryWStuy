public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow(a.getX()-b.getX(),2)+Math.pow(a.getY()-b.getY(),2));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    System.out.println(new Point(p3));
    System.out.println(p3);
    System.out.println(distance(p1,p2));
    System.out.println(Point.distance(p1,p2));
    System.out.println(p1.distanceTo(p2));
    p1 = new Point(3,4);
    p2 = new Point(-3,-4);
    p3 = new Point(-5,-6);
    System.out.println(new Point(p3));
    System.out.println(p3);
    System.out.println(distance(p1,p2));
    System.out.println(Point.distance(p1,p2));
    System.out.println(p1.distanceTo(p2));
    Point a = new Point(0,0);
    Point b = new Point(1,0);
    Point c = new Point(0.5,Math.sqrt(3.0)/2);
    System.out.println(distance(a,b));
    System.out.println(distance(b,c));
    System.out.println(distance(a,c));
    p1 = new Point(3.0,4.0);
    p2 = new Point(0,0);
    p3 = new Point(-5.5,-6.5);
    System.out.println(new Point(p3));
    System.out.println(p3);
    System.out.println(distance(p1,p2));
    System.out.println(Point.distance(p1,p2));
    System.out.println(p1.distanceTo(p2));




  }
}
