public class sep17 {

    public static void main(String[]args){
      //           012345678901
      String s1 = "Hello World!";
      System.out.println("---------SUBSTRINGS---------");
      System.out.println("s1="+s1);
      System.out.println( "s1.substring(1,7) : "+ s1.substring(1,7) );
      System.out.println( "s1.substring(3) : "  + s1.substring(3) );

      //What happens to s1 when you use substring?
      String s2 = s1.substring(1);
      System.out.println("String s2 = s1.substring(1);");
      System.out.println("s1="+ s1);
      System.out.println("s2="+ s2);

      System.out.println("---------LENGTH---------");
      s2 = "\\why\no//\"!\'?";
      System.out.println( "'"+s2+"' has a length of " + s2.length());
      s2 = s2 + " World!";
      System.out.println( "'"+s2+"' has a length of " + s2.length() );


      System.out.println("---------EQUALS vs == ---------");
        System.out.println("s1="+ s1);
      System.out.println("s2="+ s2);
      System.out.println( "s1.equals(s2): "+s1.equals(s2) );
      System.out.println( "s1==s2: "+(s1 == s2) );
      //DO NOT use == for comparison!
      System.out.println( "s1==\"Hello World!\": "+(s1 == "Hello World!")  );
      System.out.println( "s2==\"Hello World!\": "+(s2 == "Hello World!")  );

      System.out.println("---------charAt---------");
      System.out.println( "s2 is "+s2);
      System.out.println( "s2.charAt(0) is " + s2.charAt(0));
      System.out.println( "s2.charAt(s2.length() -1) is " + s2.charAt( s2.length() -1 ));
      //compare characters CAN use ==
      System.out.println( s2.charAt(0) == 'H');

      //The next line would be a compile time ERROR
      //You cannot compare string to primitive using ==
      //System.out.println( s2.charAt(0) == "H");
    }  

}
