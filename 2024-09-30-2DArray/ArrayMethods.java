//1. Write both your names + emails at the top of the document as a comment.
// Jerry Wang, jerryw28@nycstudents.net + Han Xiao, hanx3@nycstudents.net
//2. Copy your arrToString method from before.
/**Return a String that represets the array in the format:
* "[2, 3, 4, 9]"
* Note the comma+space between values, and between values
*/
public class ArrayMethods{
  public static void main(String[] args) {
    System.out.println(arrToString(new int[]{2, 3, 4, 9}));
    System.out.println(arrToString(new int[][]{{3,5,6,7},{3,3,2},{5,4},{4}})); // jagged array, works
    System.out.println(arrToString(new int[][]{{3,5,6,7},{3,3,2,4},{5,4,1,4}})); // rectangluar array, works
    System.out.println(arrToString(new int[][]{{3,5,6,7},{3,3,2,4},{5,4,1,4},{}})); // adds empty array, works
    System.out.println(arr2DSum(new int[][]{{3,5,6,7},{3,3,2},{5,4},{4}})); //jagged array, works
    System.out.println(arr2DSum(new int[][]{{3,5,6,7},{3,3,2,4},{5,4,1,4}})); // rectangluar array, works
    System.out.println(arr2DSum(new int[][]{{3,5,6,7},{3,3,2,4},{5,4,1,4},{}})); // adds empty array, works
    System.out.println(arrToString(swapRC(new int[][]{{1,2,3},{4,5,6}}))); // should return {{1,4},{2,5},{3,6}}
    System.out.println(arrToString(swapRC(new int[][]{{1,4},{2,5},{3,6}}))); // should return {{1,2,3},{4,5,6}}
    replaceNegative(new int[][]{{1,-4},{2,-5},{-3,6}});
    System.out.println(arrToString(copy(new int[][]{{1,4},{2,5},{3,6}})));
    int [][] copyTest = new int[][] {{-5, 67, 1230}, {-1234, 1227, 1227}, {-5, 7, 8 , 9 , 0}};
    System.out.println(sameArray(copyTest, copy(copyTest))); //Worked
    System.out.println(copyTest);
    System.out.println(copy(copyTest));
    System.out.println(arrToString(copyTest));
    System.out.println(arrToString(copy(copyTest)));
  }

  public static String arrToString(int[]nums){
    String s = "[";
    for (int i = 0; i < nums.length; i++){
      s += nums[i];
      if (i < nums.length - 1){
        s += ", ";
      }
    }
    return s + "]";
  }

  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
  public static String arrToString(int[][]ary){
    //this should use arrToString(int[])
    String newArray = "[";
    for (int i = 0; i < ary.length; i++){
      newArray += arrToString(ary[i]);
      if (i < ary.length - 1){
        newArray += ", ";
      }
    }
    return newArray + "]";
  }

/*     Return the sum of all of the values in the 2D array */
    public static int arr2DSum(int[][]nums){
      //use a nested loop to solve this
      int sum = 0;
      for (int i = 0 ; i < nums.length; i++){
        for (int x = 0; x < nums[i].length; x++){
          sum += nums[i][x];
        }
      }
      return sum;//place holder return value so it compiles.
    }


  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
  public static int[][] swapRC(int[][]nums){
    int[][] arr = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums[0].length; i++){
      for (int x = 0; x < nums.length; x++){
        arr[i][x] = nums[x][i];
      }
    }
    return arr;
  }

//3. Modify a given 2D array of integer as follows:
//Replace all the negative values:
//-When the row number is the same as the column number replace
//that negative with the value 1
//-All other negatives replace with 0
public static void replaceNegative(int[][] vals){
  for (int i = 0; i < vals.length; i++){
    for (int x = 0; x< vals[i].length; x++){
      if (vals[i][x] < 0){
        if (i == x){
          vals[i][x] = 1;
        }
        else{
          vals[i][x] = 0;
        }
      }
    }
  }
  System.out.println(arrToString(vals));

}

//4. Make a copy of the given 2d array.
//When testing : make sure that changing the original does NOT change the copy.
//DO NOT use any built in methods that "copy" an array.
//You SHOULD write a helper method for this.

// Helper method in question
public static int[] returnCopy(int[]ary) {
  int[] array = new int[ary.length];
  for (int i = 0; i < ary.length; i++){
    array[i] = ary[i];
  }
  return array;
}

//Tests if its a copy and NOT the same array
public static boolean sameArray(int[][] ary1, int[][] ary2){
  boolean isTrue = false;
  if (ary1.length == ary2.length){
    for (int i = 0; i < ary1.length; i++){
      for (int x = 0; x < ary1[i].length; x++){
        if (ary1[i] == ary2[i]){
          isTrue = true;
        }
        else {
          return false;
        }
      }
    }
    return isTrue;
  }
  else{
    return false;
  }
}
//If you don't see a good way to do that, you should stop and look at prior methods.
public static int[][] copy(int[][] nums){
  int[][] newArr = new int[nums.length][];
  for (int i = 0; i < nums.length; i++){
    newArr[i] = returnCopy(nums[i]);
  }
  return newArr;//placeholder so it compiles
}
}