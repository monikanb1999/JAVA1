//Anagram 
//To check whether two given strings are anagram of each other or not. 
//For example, “abcd” and “dabc” 
import java.util.*;
import java.io.*;
class Anagram{
        public static boolean isAnagram(String a,String b)
        {    //remove whitespace
             //remove lowercase
             //make it to chararray
             //sorting array                
              a = a.replace(" ","").toLowerCase();
              b = b.replace(" ","").ToLowerCase();
                
                char[] c= a.toCharArray();
                char[] d= b.toCharArray();
                
                Arrays.sort(c);
                Arrays.sort(d);
                if(Arrays.equals(c,d))
                     return true;
                else 
                     return false;
        }                         
public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //to get input from user
        String a = scan.next();
        String b = scan.next();
        boolean ret =isAnagram(a,b);
        System.out.println((ret)?"Anagram":"not Anagram");
}
}
     
