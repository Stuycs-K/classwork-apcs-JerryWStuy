public class fib{
  public static void main(String[] args) {
    makeWords(3,"","abc");
  }
  public static int fib(int n){
    if (n == 1 || n == 2){
      return 1;
    }
    else{
      return fib(n-1) + fib(n-2);
    }
  }
  public static void makeWords(int remainingLetters, String result, String alphabet){
    if (remainingLetters == 0){
      System.out.println(result);
    }
    else{
      for (int i = 0; i < alphabet.length(); i++){
        makeWords(remainingLetters-1, result+alphabet.substring(i,i+1), alphabet);
      }
    }
  }
}
