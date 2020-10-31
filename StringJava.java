import java.lang.String;
import java.util.Scanner;
import java.util.Arrays;
class StringJava
{
  public static void main(String args[])
  {
    String str = "hai";
    String strNew ="world";
    String myStr = "world";
    String sentence ="game of throns";
    System.out.println(str);
    System.out.println(str+strNew);
    System.out.println(str.concat(strNew));
    System.out.println(strNew.concat(str));
    System.out.println(strNew.equals(myStr));
    System.out.println(str.equals(myStr));
    char a = str.charAt(1);
    System.out.println("retriving the single character at index 1 in str = "+a);
    System.out.println(Character.toUpperCase(a));
    System.out.println(sentence.indexOf('e'));
    System.out.println(sentence.contains("game"));
    System.out.println(sentence.contains("app"));
    // converting string to char Array
    char[] myCharArray = strNew.toCharArray();

    for(int i=0;i<myCharArray.length;i++)// printing the char array
      System.out.print(myCharArray[i]);
    System.out.println("");
    //iterating over a String
    for(int itr=0;itr<myStr.length();itr++)
      System.out.print(myStr.charAt(itr));
    System.out.println("");
    // using substring function
    System.out.println(sentence.substring(0,5));
    System.out.println(str.toUpperCase());
    Scanner input = new Scanner(System.in);
    //getting a word of string from user
    String xyz = input.next();
    System.out.println(xyz);
    //converting string to int
    String num = "100";
    int z = Integer.parseInt(num);
    System.out.println(z);
    //empty str
    String emptyStr ="";
    System.out.println(emptyStr.isEmpty());
    //trailingSpace
    String trailingSpace = "         test";
    System.out.println("removed the space before if ocurs... ="+trailingSpace.trim());
    //splits
    String date = "11/4/2020";
    String array[] = date.split("/"); // using regular expression inside the split
    System.out.println(Arrays.toString(array));//converting an array to string
    for(String s : array)// using enhanced for loop to print the string array
      System.out.print(s+" ");
    //gettin a full line of sting from user
    input.nextLine();
    System.out.println("");
    String zyx = input.nextLine();
    System.out.println("\n"+zyx);
  }
}
