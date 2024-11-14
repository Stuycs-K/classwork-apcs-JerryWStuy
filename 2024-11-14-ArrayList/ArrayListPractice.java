import java.util.ArrayList;

public class ArrayListPractice{
  public static void main(String args[]){

  }
  public static ArrayList<String>createRandomArray(int size){
    ArrayList<String> array = new ArrayList<String>(size);
    for (int i = 0; i < size; i++){
      int x = (int)(11* Math.random());
      if (x == 0){
        array.add("");
      }
      else{
        array.add("" + x);
      }
    }
    return array;
  }

  public static void replaceEmpty( ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
    for (int i = 0; i < original.size(); i++){
      if(original.get(i).equals("")){
        original.set(i,"Empty");
      }
    }
  }

  public static ArrayList<String> makeReversedList( ArrayList<String> original){
  //return a new ArrayList that is in the reversed order of the original.
    ArrayList<String> array = new ArrayList<String>();
    for(int i = 0; i < original.size(); i++){
      array.add(original.get(original.size()-i-1));
    }
    return array;
  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
  int longest, shortest;
  boolean trueIsA;
  ArrayList<String> array = new ArrayList<String>(a.size() + b.size());
  if (a.size() < b.size()){
    longest = b.size();
    shortest = a.size();
    trueIsA = true;
  }
  else{
    longest = a.size();
    shortest = b.size();
    trueIsA = false;
  }
  for (int i = 0; i < shortest; i++){
    array.add(a.get(i));
    array.add(b.get(i));
  }
  for (int i = shortest; i < longest; i++){
    if (trueIsA){
      array.add(b.get(i));
    }
    else{
      array.add(a.get(i));
    }
  }
  return array;
  }
}
