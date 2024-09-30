//1. Write both your names + emails at the top of the document as a comment.
// Jerry Wang, jerryw28@nycstudents.net + Han Xiao, hanx3@nycstudents.net
//2. Copy your arrToString method from before.
/**Return a String that represets the array in the format:
* "[2, 3, 4, 9]"
* Note the comma+space between values, and between values
*/
public class ArrayMethods{
  public static void main(String[] args) {
    System.out.println(arrToString(new int[]{3,6,9,10}));
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
    return "";
  }



  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
  public static int[][] swapRC(int[][]nums){
    return new int[1][1];
  }
}
