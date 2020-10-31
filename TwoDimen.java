import java.util.Scanner;
Class TwodDimen
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int[][] myArr = new int[3][3];
    int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr[i].length;j++)
      {
        System.out.println(arr[i][j]+" ");
      }
    System.out.println(" ");
   }
 }
}
