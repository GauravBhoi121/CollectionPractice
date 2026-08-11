/* Q6. Question Statement
Write a Java program to store integer array elements in an ArrayList and calculate the sum of all elements.
Description
Store elements
Add all values
Input
Array: 2 4 6 8
Output
Sum: 20
            */
import java.util.*;
class ArrayList6
{
      public static void main(String args[])
      {
          Scanner sc=new Scanner(System.in);
          
          int a[]=new int []{2,4,5,6,7};
          List<Integer> al=new ArrayList<Integer>();
          for(int i:a)
          {
             al.add(i);
          }
         
         int sum=0;
         for(Integer i:al)
         {
              sum+=i; 
         }
          System.out.println(sum);
      }
}