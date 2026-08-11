/*Q2. Question Statement
Write a Java program to store strings in an ArrayList and count how many strings have length greater than 5.
Description
Store strings in ArrayList
Check string length
Count based on condition
Input
["Apple", "Banana", "Kiwi", "Orange", "Mango"]
Output
Count: 2   */
import java.util.*;
class ArrayListOpretion2
{
     public static void main(String args[])
     {
          Scanner sc=new Scanner(System.in);
         
         ArrayList<String > al=new ArrayList<String>();
 
        System.out.println("this is count how many String you want to Input"); 
        int n=sc.nextInt();
        int count =0;
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            
            if(al.add(sc.nextLine())) System.out.println("add Successfully ....");
            else System.out.println("Not add  Successfully ....");
                 
        }
        System.out.println("Display the count ");
        for(String l:al)
        {
           if(l.length()<5)
                 count ++;
        }
        System.out.println("the count of length is <5 is "+count );
     }
}