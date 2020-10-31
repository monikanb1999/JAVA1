import java.util.Scanner;
class Anagram{
public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
      a = a.toLowerCase();
      b = b.toLowerCase();
      int arr[] = new int[26];
      for(int i=0;i<a.length();i++)
      {
        arr[a.charAt(i)-97]++;
      }
      for(int j=0;j<b.length();j++)
      {
        arr[b.charAt(j)-97]--;
      }
      for(int k=0;k<arr.length;k++)
      {
        if(k != 0)
        System.out.println("No");
      }
      System.out.println("Yes");
    }
  }
