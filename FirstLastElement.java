import java.util.*;
class FirstLastElement
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         Vector v=new Vector();
         int n=sc.nextInt();
         System.out.println("Enter the Elemet int the vector");
         
         for(int i=0;i<n;)
         {
              v.add(sc.nextInt());
               i++;
         }
         System.out.println(v.firstElement());
         System.out.println(v.lastElement());
    }
}