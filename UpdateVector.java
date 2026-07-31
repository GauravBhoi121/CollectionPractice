import java.util.*;
class UpdateVector
{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         Vector v=new Vector();
         
         System.out.println("Enter the size of vector to add Element ");
         int n=sc.nextInt();
         for(int i=0;i<n;i++)
         {
              v.add(sc.nextInt());
         }
       
         System.out.println("Enter the index ");
         int index=sc.nextInt();
         System.out.println("Enter the element ");
         n=sc.nextInt();
         v.set(index,n);
         System.out.println(v);
     }
}