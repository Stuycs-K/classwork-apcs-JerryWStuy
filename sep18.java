public class sep18{

public static void main(String[]args){
String s = "操你妈";

int i = 0;
while (i < s.length()){
  System.out.println(s.substring(i, i +1));
  //                 s.charAt(i)
  i = i + 1;
  //OR: i += 1;
  //OR: i++;
}
}
}
