/*Q1.Question Statement
Write a Java program to accept an integer array from the user, store only even numbers into an ArrayList, and display the elements.
Description
Read array elements
Check each number
Store even numbers in ArrayList
Input
Array: 1 2 3 4 5 6
Output
Even Numbers: [2, 4, 6]    */
import java.util.*;
class ArrayListOpretion
{
     public static void  main(String args[])
     {
         Scanner sc=new Scanner(System.in);
          int []a={1,2,3,4,5,6,7};
        
          ArrayList<Integer> li=new ArrayList<Integer>();
          for(int i:a)
          {
               if(i%2==0)
               {
                  li.add(i);
               }
          }
           System.out.println(li);
     }
}