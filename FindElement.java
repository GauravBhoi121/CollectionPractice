import java.util.*;
class FindElement
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
      
         System.out.println("Enter the Element to find ");
         int element=sc.nextInt();
         if(v.contains(element)){         System.out.println("Element found ");}
         else{         System.out.println("Element not found ");}
   }
}