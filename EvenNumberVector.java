import java.util.*;
class EvenNumberVector
{
     public static void main(String args[])
     { 
         Scanner sc=new Scanner(System.in);
         
          Vector v=new Vector();
       
          for(int i=0;i<5;i++)
          {
              v.add(sc.nextInt());
          }
          Vector even=new Vector();
          Vector odd=new Vector();
          System.out.println("Pring Even and odd Element");
          Iterator list=v.iterator();
          while(list.hasNext())
          {
              Object obj=list.next();
              int n=(int)obj;
              if(n%2==0)
              {
                   even.add(obj);
              }
              else
              {
                   odd.add(obj);
              }
          }
          System.out.println(even+"    "+odd);
     }
}