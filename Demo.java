class Calci
{
  int num1;
  int num2;
  int result;
public void calculation()
{
  result=num1+num2;
}
}
public class Demo
{
public static void main(String args[])
{
  Calci calc = new Calci();//calc is the reference of the object creaTed
  calc.num1 = 2;
  calc.num2 = 9;
  calc.calculation();
  System.out.println(calc.result);

}
}
