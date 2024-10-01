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
}
