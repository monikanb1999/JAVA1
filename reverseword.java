import java.util.*;
class reverseword{
  public static void main (String args[])
  {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    StringBuilder str = new StringBuilder();
    str.append(input);
    str = str.reverse();
    String ans =str.toString();
    if(ans.equals(input))
    System.out.println("Yes");
    else
    System.out.println("No");
  }
}
