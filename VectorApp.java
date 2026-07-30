import java.util.*;
class VectorApp
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       Vector v=new Vector();
       v.add(10);
       v.add(30);
       v.add(40);
       
      Iterator i=v.iterator();
      while(i.hasNext())
      {
          Object o=i.next();
          System.out.println(o);
      }
   }
}