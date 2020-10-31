
// DATA STURCTURE ---> CLASS AND OBJECT
class ObjectAndClass
{
  int a;
  static int b;

  public void functionOne()
  {
    System.out.println("this is function one");
  }
  static public void functionTwo()
  {
    System.out.println("this is function two");
  }
  // a static is used to share among all the object/instance
  // while an object is particulary hold the class datamember and function
  public static void main(String args[])
  {
    ObjectAndClass myObjOne = new ObjectAndClass();
    myObjOne.functionOne();//calling with object
    functionTwo();// calling since static
    myObjOne.a = 2;
    System.out.println("myObjOne a int value is = "+myObjOne.a);
    System.out.println("myObjOne a int value is = "+myObjTwo.a);
    b = 3;
    System.out.println("b int value is = "+b);
    ObjectAndClass myObjTwo = new ObjectAndClass();
    myObjTwo.functionOne();
    functionTwo();
    myObjTwo.a = 5;
    System.out.println("myObjTwo a int value is = "+myObjTwo.a);
    System.out.println("myObjOne a int value is = "+myObjOne.a);
    b =5;
    System.out.println("b int value is = "+b);
  }
}
