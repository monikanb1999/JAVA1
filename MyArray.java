import java.util.Scanner;
import java.util.*;
class MyArray
{
  public static void main(String args[])
  {//int a[10];
    int[] arrName = new int[10];// one dimen array.
    int a[] = {1,2,3,4,5,6,7};
    int myAr[] = {9,1,8,2,3,7};
    Arrays.sort(myAr);
    System.out.println(Arrays.toString(myAr));
     arrName[0] = 10;
     arrName[1] = 20;
     Scanner inputObj = new Scanner(System.in);
     for(int i=2;i<10;i++)
       arrName[i] = inputObj.nextInt();
     System.out.println("my array length = " + arrName.length );
     for(int i=0; i<arrName.length ; i++)
       System.out.print(arrName[i] + "  ");
     System.out.println("\n my 'a' array length = " + a.length );
    for(int i=0; i<a.length ; i++)
      System.out.print(a[i] + "  ");
     int result = callMyFunction(arrName);//passing my 1D array and geting an int value as return type
     System.out.println("sum of my my array = "+result);
  }
  static int callMyFunction(int sumArray[])
   {
     int sum=0;
     for(int itr=0;itr<sumArray.length;itr++)
       sum = sum + sumArray[itr];
     return sum;
   }
}