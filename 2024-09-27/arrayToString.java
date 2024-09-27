public class arrayToString{
  public static void main (String args[]){
    // arrayToString test cases
    System.out.println(arrayToString(new int[]{1, 2, 3, 1227})); //Worked
    System.out.println(arrayToString(new int[]{1, 2, 3, 1227, -4})); //Worked
    System.out.println(arrayToString(new int[]{})); //Worked
    //  sameArray method test cases
    System.out.println(sameArray(new int[]{1, 2, 3, 1227, -4}, new int[]{1, 22, 3, 1227, -4})); //Did not work
    System.out.println(sameArray(new int[]{1, 2, 3, 1227, -4}, new int[]{1, 2, 3, 1227, -4})); //Worked

  }




  public static boolean sameArray(int[] ary1, int[] ary2){
    boolean isTrue = false;
    if (ary1.length == ary2.length){
      for (int i = 0; i < ary1.length; i++){
        if (ary1[i] == ary2[i]){
          isTrue = true;
        }
        else {
          isTrue = false;
        }
      }
      return isTrue;
    }
    else{
      return false;
    }
  }


  public static String arrayToString (int[] nums){
    String s = "[";
    for (int i = 0; i < nums.length; i++){
      s += nums[i];
      if (i < nums.length - 1){
        s += ", ";
      }
    }
    return s + "]";
  }
}
