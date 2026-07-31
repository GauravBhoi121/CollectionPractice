import java.util.*;
class AddAllVector
{
       public static void main(String args[])
       {
            Scanner sc=new Scanner(System.in);
            Vector v=new Vector();
            v.add(10);
v.add(10);
v.add(40);
v.add(10);
v.add(20);
v.add(30);
            Vector s=new Vector();
            s.addAll(v);
            System.out.println(s);
            
            if(v.isEmpty())
            {
                System.out.println("Not Empty");
            }
            else
            {
                System.out.println("Not Empty");
            }
          
       }
}