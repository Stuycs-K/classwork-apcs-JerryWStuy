/* 8. In the last step, we overriden speak().
This means that when we call speak() with a Bird constructor,
it will use the speak() method from Bird instead of the speak() method from Animal.
10. Only the third constructor did not work because an animal 
does not have an "is-a" relationhip with bird; that is to say, 
it is not a bird even though a bird may be an animal.
*/
public class Driver{
  public static void main(String args[]){
    /*
    Animal birb = new Animal("birb", 5, "Bird");
    birb.speak();
    Bird birb2 = new Bird("birb", 5, "Bird", 10, "red");
    birb2.speak();
    Animal birb3 = new Bird("birb", 5, "Bird", 10, "red");
    birb3.speak(); 
    */
    Animal a1 = new Animal("a", 1, "a1");
    Bird b1 = new Bird("b", 2, "b1", 7, "green");
    //Bird b2 = new Animal("bb", 3, "b2");
    Animal a2 = new Bird("aa", 4, "a2", 9, "orange");
    a1.speak();
    b1.speak();
    a2.speak();
  }
}
