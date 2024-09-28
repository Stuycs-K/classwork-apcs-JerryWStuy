public class arrayToString{
  public static void main (String args[]){
    // turnArrayToString test cases
    System.out.println(turnArrayToString(new int[]{1, 2, 3, 1227})); //Worked
    System.out.println(turnArrayToString(new int[]{1, 2, 3, 1227, -4})); //Worked
    System.out.println(turnArrayToString(new int[]{})); //Worked
    // sameArray method test cases
    System.out.println(sameArray(new int[]{1, 2, 3, 1227, 1227, -4}, new int[]{1, 2, 3, 1227, -4})); //Worked
    System.out.println(sameArray(new int[]{1, 2, 3, 1227, -4}, new int[]{1, 2, 3, 1227, -4})); //Worked
    // returnCopy method test cases
    int[] copyTest = new int[]{3,5,6,7,8,9,10,1227,520,180};
    System.out.println(sameArray(copyTest, returnCopy(copyTest))); //Worked
    System.out.println(copyTest);
    System.out.println(returnCopy(copyTest));
    System.out.println(turnArrayToString(copyTest));
    System.out.println(turnArrayToString(returnCopy(copyTest)));
    copyTest = new int[] {-5, 67, 1230, -1234, 1227, 1227, -5, 7, 8 , 9 , 0};
    System.out.println(sameArray(copyTest, returnCopy(copyTest))); //Worked
    System.out.println(copyTest);
    System.out.println(returnCopy(copyTest));
    System.out.println(turnArrayToString(copyTest));
    System.out.println(turnArrayToString(returnCopy(copyTest)));
    // concatArray method test cases
    int[] concat1 = new int[]{-10, 10 , 1227, 0 , 25};
    int[] concat2 = new int[]{-10, 10 , 1227, 0 , 25};
    System.out.println(turnArrayToString(concatArray(concat1, concat2)));
    concat1 = new int[]{-10123, 10123 , 12237, 02 , 25};
    concat2 = new int[]{-10, 10 , 1227, 0 , 2545};
    System.out.println(turnArrayToString(concatArray(concat1, concat2)));

  }

  public static boolean sameArray(int[] ary1, int[] ary2){
    boolean isTrue = false;
    if (ary1.length == ary2.length){
      for (int i = 0; i < ary1.length; i++){
        if (ary1[i] == ary2[i]){
          isTrue = true;
        }
        else {
          return false;
        }
      }
      return isTrue;
    }
    else{
      return false;
    }
  }

  public static String turnArrayToString (int[] nums){
    String s = "[";
    for (int i = 0; i < nums.length; i++){
      s += nums[i];
      if (i < nums.length - 1){
        s += ", ";
      }
    }
    return s + "]";
  }
  public static int[] returnCopy(int[]ary) {
    int[] array = new int[ary.length];
    for (int i = 0; i < ary.length; i++){
      array[i] = ary[i];
    }
    return array;
  }
  
  public static int[] concatArray(int[]ary1,int[]ary2){
    int[] array = new int[ary1.length + ary2.length];
    for (int i = 0; i < ary1.length; i++){
      array[i] = ary1[i];
    }
    for (int i = 0; i < ary2.length; i++){
      array[i+ary1.length] = ary2[i];
    }
    return array;
  }
}

