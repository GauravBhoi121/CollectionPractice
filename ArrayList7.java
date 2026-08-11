/*Q7. Question Statement
Write a Java program to store integer array elements into an ArrayList and remove all negative numbers.
Description
Store values
Remove negatives using condition
Input
Array: -1 2 -3 4 5
Output
Updated List: [2, 4, 5]    */
import java.util.*;
class ArrayList7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        int a[]=new int []{-1,-2,-3,4,5,-2};
      
        for(int i:a)
        {
             al.add(i);
        }
         
        for(int i=0;i<al.size();i++)
        {
           if(al.get(i)<0)
            {
                 al.remove(i);
                 i--;
            }
        }
         al.forEach((x)->System.out.println(x));
    }
}