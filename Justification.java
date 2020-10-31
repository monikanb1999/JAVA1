import java.util.Scanner;
class Justification
{
  public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in);
    String a = sc.nextLine();
    int c = sc.nextInt();
    System.out.printf("%-15s%03d\n",a,c);
    System.out.println("string = "+a+"int = "+c);

  }
}
