import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class List2{
  public static void main(String args[])
  {
    List<Integer> obj = new ArrayList<Integer>();
    obj.add(10);
    obj.add(20);
    obj.add(30);
    obj.add(40);
    obj.add(50);
    obj.add(3,98);
    Collections.sort(obj);
    obj.remove(3);
    for(int i=0;i<obj.size();i++)
    {
      System.out.print(obj.get(i)+" ");
    }
  }
}
