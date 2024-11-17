import java.util.ArrayList;


public class Driver{
  public static void main(String args[]){
    ArrayList<String> array1, array2, array3;
    array1 = ArrayListPractice.createRandomArray(5);
    array2 = ArrayListPractice.createRandomArray(10);
    System.out.println(array1);
    System.out.println(array2);
    ArrayListPractice.replaceEmpty(array1);
    ArrayListPractice.replaceEmpty(array2);
    System.out.println(array1);
    System.out.println(array2);
    array1 = ArrayListPractice.makeReversedList(array1);
    array2 = ArrayListPractice.makeReversedList(array2);
    System.out.println(array1);
    System.out.println(array2);
    array3 = ArrayListPractice.mixLists(array1, array2);
    System.out.println(array3);
  }
}
