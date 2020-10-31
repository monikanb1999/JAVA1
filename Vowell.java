import java.util.Scanner;
import java.util.*;
class Vowell{
  public static void main(String args[]){
    int count=0;
    String str ="";
    Scanner input = new Scanner(System.in);
    String myStr = input.nextLine();//getting input from the user
    String words[] = myStr.split(" ");//making strings into string array
    for(int i=0;i<words.length;i++)
    {
      int tempCount =0; //intializing temporary count variable
      char[] temp = words[i].toCharArray();//converting to Char Array
    for(int j=0;j<temp.length;j++)
    {
      if(temp[j]=='a' || temp[j]=='e' || temp[j]=='i' || temp[j]=='o' || temp[j]=='u')
      tempCount++;
    }
    if(tempCount>count)
    {
      count=tempCount;
      str = new String(temp);
    }
  }
    System.out.println("count max vowels="+count+"\nmax vowel word "+str);
}
}
