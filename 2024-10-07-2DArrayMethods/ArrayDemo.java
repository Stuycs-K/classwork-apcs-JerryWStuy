import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    System.out.println(countZeros2D(new int[][]{{132,1,132,12312,0,0},{123,45,50,87,0}}));
    System.out.println(countZeros2D(new int[][]{{132,1,132,0,0,0,0},{123,45,50,87,0}}));
    replaceNegative(new int[][]{{3,4,5,6,-7,-12,-90},{0,-5,-5,-5,-5}});
    int[][] testForSame = new int[][]{{132,1,132,0,0,0,0},{123,45,50,87,0}};
    System.out.println(testForSame == copy(testForSame));
    System.out.println(arrToString(copy(testForSame)));
    System.out.println(htmlTable(new int[][]{{1,2},{3}}));

  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
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
  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
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

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int zeroes = 0;
    for (int i = 0; i < nums.length; i++){
      for (int x = 0; x < nums[i].length; x++){
        if (nums[i][x] == 0){
          zeroes++;
        }
      }
    }
    return zeroes;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for (int i = 0 ; i < nums.length; i++){
      for (int x = 0; x < nums[i].length; x++){
        sum += nums[i][x];
      }
    }
     return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0 ; i < vals.length; i++){
      for (int x = 0; x < vals[i].length; x++){
        if (vals[i][x] < 0){
          if (i == x){
            vals[i][x] = 1;
          }
          else {
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
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
    int[][] newArr = new int [nums.length][];
    for (int i = 0; i < nums.length; i++){
      newArr[i] = new int[nums[i].length];
      for (int x = 0; x < nums[i].length; x++){
        newArr[i][x] = nums[i][x];
      }
    }
    return newArr;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] arr = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums[0].length; i++){
      for (int x = 0; x < nums.length; x++){
        arr[i][x] = nums[x][i];
      }
    }
    return arr;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String table = "<table>";
    for (int i = 0; i < nums.length; i++){
      table += "<tr>";
      for (int x = 0; x < nums[i].length; x++){
        table += "<td>";
        table += Integer.toString(nums[i][x]);
        table += "</td>";
      }
      table += "</tr>";
    }
    return table + "</table>";
  }
}
