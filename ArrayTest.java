public class ArrayTest{
public static void main(String[]args){
  //1 initialize the array
  int[] anArray = new int[11];

  //2 print the array variable
  System.out.println("part 2: " + anArray);

  //Part 3 Write the loop to initialize it
  for (int i = 0; i < anArray.length; i++){
    anArray[i] = 100 + 10*i;
  }


  //Part 4 anArray[0], anArray[5],anArray[10] to see if it worked
  System.out.print("part 4: ");
  for (int i = 0; i < 3; i++){
    System.out.print(anArray[5*i]+ " ");
}
  System.out.println("");

  //Part 5 Write a loop to print the whole array (on one line)
  System.out.print("part 5: ");
  for (int i = 0; i < anArray.length; i++){
    System.out.print(anArray[i] + " ");
  }
}
}
